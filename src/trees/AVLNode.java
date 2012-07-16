/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author gsilvae
 */
public class AVLNode extends Node {

    private static final int STALE_DEPTH = -80085;
    private static final int DEFAULT_BALANCE_FACTOR = 0;
    private int depth = AVLNode.STALE_DEPTH;
    private int balanceFactor = AVLNode.DEFAULT_BALANCE_FACTOR;
    
    public AVLNode(int value) {
        super(value);
    }

    public AVLNode add(int value) {
        return this.add(new AVLNode(value));
    }
    
    public AVLNode add(AVLNode n) {
        super.add(n);
        n.updateBalanceFactor();
        return this;
    }
    
    public AVLNode setLeftChild(int value) {
        return this.setLeftChild(new AVLNode(value));
    }
    
    public AVLNode setRightChild(int value) {
        return this.setRightChild(new AVLNode(value));
    }
    
    public AVLNode setLeftChild(AVLNode node) {
        super.setLeftChild((Node) node);
        if(node != null)
            node.updateBalanceFactor();
        return node;
    }
    
    public AVLNode setRightChild(AVLNode node) {
        super.setRightChild((Node) node);
        if(node != null)
            node.updateBalanceFactor();
        return node;
    }
    
    /**
     * Propagates to every node, upwards only.
     */
    public void updateBalanceFactor() {
        AVLNode leftC = (AVLNode) this.getLeftChild();
        AVLNode rightC = (AVLNode) this.getRightChild();
        int lBF = 0; int rBF = 0;
        if(leftC != null) {
            lBF = 1 + leftC.getDeepestDepth();
        }
        if(rightC != null) {
            rBF = 1 + rightC.getDeepestDepth();
        }
        this.balanceFactor = lBF - rBF;
        // work upwards
        AVLNode p = (AVLNode) this.getParent();
        if(p!=null)
            p.updateBalanceFactor();
    }
    
    public int getBalanceFactor() {
        return this.balanceFactor;
    }
    
    /**
     * 
     * @param node
     * @return Tallest height (absolute value)
     */
    public int getDeepestDepth() {
        if(this.isLeaf()) {
            return 0;
        } else {
            AVLNode leftNode = (AVLNode) this.getLeftChild();
            AVLNode rightNode = (AVLNode) this.getRightChild();
            int leftDepth  = leftNode == null ? 0 :
                    1 + leftNode.getDeepestDepth();
            int rightDepth = rightNode == null ? 0 :
                    1 + rightNode.getDeepestDepth();
            /**
             * if leftDepth == rightDepth
             * The tree is balanced and it won't make a difference 
             * which is returned. It returns absolute values anyway.
             */
            return leftDepth > rightDepth ? leftDepth : rightDepth;
        }
    }
    
    public int getDepth() {
        if(this.depth == AVLNode.STALE_DEPTH)
            this.calculateDepth();
        return this.depth;
    }
    
    private int calculateDepth() {
        AVLNode p = (AVLNode) this.getParent();
        if(p == null) {
            this.depth = 0;
        } else {
            this.depth = p.getDepth() + 1;
        }
        return this.depth;
    }
    
}

