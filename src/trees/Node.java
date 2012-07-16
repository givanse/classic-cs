/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 *
 * @author gsilvae
 */
public class Node implements Comparable<Node> {
    
    Node parent;
    Node leftChild;
    Node rightChild;
    int value;
    
    public Node(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getParent() {
        return this.parent;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int getValue() {
        return this.value;
    }

    protected Node setLeftChild(Node lc) {
        // current left child is abandoned
        if(this.leftChild != null)
            this.leftChild.setParent(null);
        // attach new child
        this.leftChild = lc;
        // update new child's parent
        if(lc != null)
            lc.setParent(this);
        return this.leftChild;
    }

    /**
     * Warning: The parent won't be aware of this new child.
     * @param parent
     * @return 
     */
    protected Node setParent(Node parent) {
        this.parent = parent;
        return this.parent;
    }

    protected Node setRightChild(Node rc) {
        if(this.rightChild != null)
            this.rightChild.setParent(null);
        this.rightChild = rc;
        if(rc != null)
            rc.setParent(this);
        return this.rightChild;
    }
    
    public Node add(Node n) {
        if(n==null)
            return this;
        // ordered insertion (binary search)
        int compareResult = this.compareTo(n);
        if( compareResult > 0) { // new value less than current node
            if(this.leftChild == null) {
                this.setLeftChild(n);
            } else {
                this.leftChild.add(n);
            }
            return this;
        } else if(compareResult <= 0) { // new value greater than or equal
            if(this.rightChild == null) {
                this.setRightChild(n);
            } else {
                this.rightChild.add(n);
            }
            return this;
        }
        throw new ArithmeticException("Not able to insert a new Node.");
    }
    
    @Override
    public int compareTo(Node n) {
        return this.value - n.getValue();
    }

    @Override
    public String toString() {
        return "[" + this.value + "]";
    }
    
    /**
     * Breadth first
     * 
     * @param indentLevel
     * @param parentNode
     * @return 
     */
    /* Incomplete
     * private String childrenToString(Queue<Node> q) {
        if(q.isEmpty())
            return "";
        Node currentNode = q.poll();
        Node currentLeftChild = currentNode.getLeftChild();
        Node currentRightChild = currentNode.getRightChild();
        boolean isCurrentNodeALeaf = 
                currentLeftChild == null && currentRightChild == null;
        boolean isRootRightSideDescendant = isRootRightSideDescendant(currentNode);
        if( !isCurrentNodeALeaf ) { 
            if(currentLeftChild == null)
                //q.add(new Node().setParent(currentNode));
             ;   //q.add(currentNode.setLeftChild(new Node()));
            else
                q.add(currentNode.getLeftChild());
            if(currentRightChild == null)
              ;  //q.add(new Node().setParent(currentNode));
                //q.add(currentNode.setRightChild(new Node()));
            else
                q.add(currentNode.getRightChild());
        }
        String lineBreak = isRootRightSideDescendant ? "\n" : " ";
        return currentNode.getValue() + lineBreak + 
               this.childrenToString(q);
    }*/
    
    boolean isRootRightSideDescendant() {
        if(this==null)
            return false;
        Node parent = this.getParent();
        if(parent==null ) // this is root
            return true;
        Node rightBrother = parent.getRightChild();
        if(rightBrother == null)
            return false;
        if(rightBrother.equals(this))
            return parent.isRootRightSideDescendant();
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        /*
         * Only the subtree.
         * if (!Objects.equals(this.parent, other.parent)) {
         *     return false;
         * }
         */
        if (!Objects.equals(this.leftChild, other.leftChild)) {
            return false;
        }
        if (!Objects.equals(this.rightChild, other.rightChild)) {
            return false;
        }
        if (this.value != other.value) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.parent);
        hash = 53 * hash + this.value;
        return hash;
    }
    
    public boolean isLeaf() {
        boolean noLeftChild = this.getLeftChild() == null;
        boolean noRightChild = this.getRightChild() == null;
        return noLeftChild && noRightChild;
    }
    
}














