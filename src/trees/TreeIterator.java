/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author gsilvae
 */
public class TreeIterator {

    public enum SearchStrategy {DEPTH, BREADTH};
    /**
     * pre-orden  root, left subtree, right subtree
     * en-orden   left subtree, root, right subtree
     * post-orden left subtree, right subtree, root
     */
    public enum Order {PRE, IN, POST};
    
    public void traverse(Node root, SearchStrategy searchStrategy, Order order) {
        switch(searchStrategy) {
            case BREADTH:
                this.traverseBreadthFirst(root); break;
            case DEPTH:
                this.traverseDepthFirst(root, order); break;
        }
    }
    
    private void traverseBreadthFirst(Node root) {
        
    }
    
    private void traverseDepthFirst(Node root, Order order) {
        switch(order) {
            case PRE:
                this.traversePreOrder(root); break;
            case IN:
                this.traverseInOrder(root); break;
            case POST:
                this.traversePostOrder(root); break;
        }
    }
    
    private void traversePreOrder(Node root) {
        
    }
    
    private void traverseInOrder(Node root) {
        
    }
    
    private void traversePostOrder(Node root) {
        
    }
}
