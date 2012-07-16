/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.Objects;

/**
 *
 * @author gsilvae
 */
public class AVLTree {
    
    private static final int INDENT_SIZE = 3;
    private AVLNode root;
    
    public AVLTree() {}
    
    public AVLTree(int value) {
        this.root = new AVLNode(value);
    }
    
    public AVLTree add(int value) {
        return this.add(new AVLNode(value));
    }
    
    public AVLTree add(AVLNode node) {
        this.root.add(node);
        this.auditAndBalance(node);
        return this;
    }
    
    /**
     * 
     * @param node The review starting point.
     */
    private void auditAndBalance(Node node) {
        if(node == null)
            return;
        if(node.isLeaf())
            this.auditAndBalance(node.getParent());
        int nodeBF = ((AVLNode) node).getBalanceFactor();
        if(-1 <= nodeBF && nodeBF <= 1) {
            if( this.root.equals(node)) {
                return;
            }
        }
        // left-right candidate
        if(nodeBF == -1) {
            AVLNode parent = (AVLNode) node.getParent();
            if(parent != null) {
                // left-right
                int parentBF = parent.getBalanceFactor();
                if(parentBF == 2) {
                    this.balanceLeftRight(parent);
                    this.balanceLeftLeft(parent);
                }
                if(parentBF == -2) {
                    this.balanceRightRight(parent);
                }
            }
        }
        // right-left candidate
        if(nodeBF == 1) {
            AVLNode parent = (AVLNode) node.getParent();
            if(parent != null) {
                // right-left
                int parentBF = parent.getBalanceFactor();
                if(parentBF == -2) {
                    this.balanceRightLeft(parent);
                    this.balanceRightRight(parent);
                }
                if(parentBF == 2) {
                    this.balanceLeftLeft(parent);
                }
            }
        }
        this.auditAndBalance(node.getParent());
    }

    public void balanceLeftRight(AVLNode a) {
        AVLNode b = (AVLNode) a.getLeftChild();
        AVLNode c = (AVLNode) a.getLeftChild().getRightChild();
        a.setLeftChild(c);
        b.setRightChild(null);
        c.setLeftChild(b);
    }
    
    public void balanceRightLeft(AVLNode a) {
        AVLNode c = (AVLNode) a.getRightChild().getLeftChild();
        AVLNode b = (AVLNode) a.getRightChild();
        // bind
        a.setRightChild(c);
        b.setLeftChild(null);
        c.setRightChild(b);
    }
    
    public void balanceLeftLeft(AVLNode a) {
        AVLNode parent = (AVLNode) a.getParent();
        AVLNode b = (AVLNode) a.getLeftChild();
        
        a.setParent(null);
        if(parent == null) {
            this.root = b;
        } else {
            int parentBF = parent.getBalanceFactor();
            if(parentBF < 0)
                parent.setRightChild(b);
            else
                parent.setLeftChild(b);
        }
        a.setLeftChild(null);
        b.setRightChild(a);
    }
    
    public void balanceRightRight(AVLNode a) {
        AVLNode parent = (AVLNode) a.getParent();
        AVLNode b = (AVLNode) a.getRightChild();
        a.setParent(null);
        if(parent == null) {
            this.root = b;
        } else {
            int parentBF = parent.getBalanceFactor();
            if(parentBF < 0)
                parent.setRightChild(b);
            else
                parent.setLeftChild(b);
        }
        a.setRightChild(null);
        b.setLeftChild(a);
    }
    
    public AVLNode setRoot(AVLNode node) {
        this.root = node;
        return this.root;
    }
    
    public AVLNode getRoot() {
        return this.root;
    }

    @Override
    public String toString() {
        return this.toStringPreorder();
    }
    
    public String toStringPreorder() {
        return this.toStringPreorder(0, this.root);
    }
    
    private String toStringPreorder(int indentLevel, Node currentNode) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < indentLevel; i++) {
            sb.append(' ');
        }
        String tabsString = sb.toString();
        if(currentNode ==  null)
            return tabsString + "[nil]\n";
        String str = tabsString + currentNode.toString() + "\n";
        Node currentLeftChild = currentNode.getLeftChild();
        Node currentRightChild = currentNode.getRightChild();
        if(currentLeftChild == null && currentRightChild == null)
            return str;
        // recursive call for the children
        int newIndentLevel = indentLevel + AVLTree.INDENT_SIZE;
        str += this.toStringPreorder(newIndentLevel, currentLeftChild);
        str += this.toStringPreorder(newIndentLevel, currentRightChild);
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AVLTree other = (AVLTree) obj;
        if (!Objects.equals(this.root, other.root)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.root);
        return hash;
    }
    
}
