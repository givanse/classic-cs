/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author gsilvae
 */
public class Exercises {
    
    public static AVLTree getAnswer1() {
        AVLNode root = new AVLNode(11);
        root.setLeftChild(8).setLeftChild(4);
        root.setRightChild(20);
        // attach to tree
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }
    
    public static AVLTree getAnswer2() {
        AVLNode root = new AVLNode(11);
        root.setLeftChild(8).setLeftChild(4);
        AVLNode r = root.setRightChild(20);
        r.setLeftChild(16);
        r.setRightChild(27);
        // attach to tree
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }
    
    public static AVLTree getAnswer3() {
        AVLNode root = new AVLNode(11);
        AVLNode l = root.setLeftChild(4);
        l.setLeftChild(3);
        l.setRightChild(8);
        AVLNode r = root.setRightChild(20);
        r.setLeftChild(16);
        r.setRightChild(27);
        // attach to tree
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }
    
    public static AVLTree getAnswer4() {
        AVLNode root = new AVLNode(11);
        AVLNode l = root.setLeftChild(5);
        l.setLeftChild(4);
        l.setRightChild(8);
        AVLNode r = root.setRightChild(20);
        r.setLeftChild(16);
        r.setRightChild(27);
        // attach to tree
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }
    
    public static AVLTree getAnswer5() {
        AVLNode root = new AVLNode(38);
        AVLNode l = root.setLeftChild(20);
        AVLNode ll = l.setLeftChild(9);
        ll.setLeftChild(5);
        AVLNode llr = ll.setRightChild(14);
        llr.setLeftChild(12);
        llr.setRightChild(16);
        l.setRightChild(31).setLeftChild(25);
        AVLNode r = root.setRightChild(49);
        r.setLeftChild(41);
        r.setRightChild(51).setRightChild(56);
        // attach to tree
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }

}
