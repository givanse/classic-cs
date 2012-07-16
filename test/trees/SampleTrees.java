/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author gsilvae
 */
public class SampleTrees {

    public static AVLTree getRootSingleNode() {
       AVLTree t = new AVLTree();
       t.setRoot(new AVLNode(42));
       return t;
    }

    public static AVLTree getRootOf3BalancedNodes() {
        AVLNode root = new AVLNode(500);
        root.setLeftChild(new AVLNode(253));
        root.setRightChild(new AVLNode(780));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }

    public static AVLTree getRootRight() {
        AVLNode r = new AVLNode(86);
        r.setRightChild(new AVLNode(123));
        AVLTree t = new AVLTree();
        t.setRoot(r);
        return t;
    }

    /* left-right */
    
    public static AVLTree getRootLeftRight() {
        AVLNode r = new AVLNode(5);
        r.setLeftChild(new AVLNode(3)).setRightChild(new AVLNode(4));
        AVLTree t = new AVLTree();
        t.setRoot(r);
        return t;
    }
    
    public static AVLTree getRootLeftRightBalanced() {
        AVLNode r = new AVLNode(5);
        r.setLeftChild(new AVLNode(4)).setLeftChild(new AVLNode(3));
        AVLTree t = new AVLTree();
        t.setRoot(r);
        return t;
    }
    
    /*public static AVLTree getRootLeftRightComplete() {
        AVLNode r = new AVLNode(7);
            Node l = r.setLeftChild(new AVLNode(3));
                l.setLeftChild(new AVLNode(2));
                Node lr = l.setRightChild(new AVLNode(5));
                    lr.setLeftChild(new AVLNode(4));
                    lr.setRightChild(new AVLNode(6));
        AVLTree t = new AVLTree();
        t.setRoot(r);
        return t;
    }*/
    
    /*public static AVLTree getRootLeftRightCompleteBalanced() {
        AVLNode r = new AVLNode(7);
            Node l = r.setLeftChild(new AVLNode(5));
                Node ll = l.setLeftChild(new AVLNode(3));
                    ll.setLeftChild(new AVLNode(2));
                    ll.setRightChild(new AVLNode(4));        
                l.setRightChild(new AVLNode(6));
        AVLTree t = new AVLTree();
        t.setRoot(r);
        return t;
    }*/
    
    /* right-left */
    
    public static AVLTree getRootRightLeft() {
        AVLNode r = new AVLNode(3);
        r.setRightChild(new AVLNode(5)).setLeftChild(new AVLNode(4));
        AVLTree t = new AVLTree();
        t.setRoot(r);
        return t;
    }
    
    public static AVLTree getRootRightLeftBalanced() {
        AVLNode r = new AVLNode(3);
        r.setRightChild(new AVLNode(4)).setRightChild(new AVLNode(5));
        AVLTree t = new AVLTree();
        t.setRoot(r);
        return t;
    }

    /*public static AVLTree getRootRightLeftComplete() {
        AVLNode root = new AVLNode(100);
            Node r = root.setRightChild(new AVLNode(200));
                r.setRightChild(new AVLNode(300));
                Node rl = r.setLeftChild(new AVLNode(150));
                    rl.setLeftChild(new AVLNode(125));
                    rl.setRightChild(new AVLNode(175));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }*/
    
    /*public static AVLTree getRootRightLeftCompleteBalanced() {
        AVLNode root = new AVLNode(100);
            Node r = root.setRightChild(new AVLNode(150));
                r.setLeftChild(new AVLNode(125));
            Node rr = r.setRightChild(new AVLNode(200));
                rr.setLeftChild(new AVLNode(175));
                rr.setRightChild(new AVLNode(300));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }*/

    /* left-left */
    
    public static AVLTree getRootLeftLeft() {
        AVLNode root = new AVLNode(5);
        root.setLeftChild(new AVLNode(4))
         .setLeftChild(new AVLNode(3));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }
    
    public static AVLTree getRootLeftLeftBalanced() {
        AVLNode root = new AVLNode(4);
        root.setLeftChild(new AVLNode(3));
        root.setRightChild(new AVLNode(5));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }
    
    /*public static AVLTree getRootLeftLeftComplete() {
        AVLNode root = new AVLNode(100);
        root.setRightChild(new AVLNode(150));
        Node l = root.setLeftChild(new AVLNode(50));
        l.setRightChild(new AVLNode(75));
        Node ll = l.setLeftChild(new AVLNode(25));
        ll.setLeftChild(new AVLNode(20));
        ll.setRightChild(new AVLNode(30));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }*/
    
    /*public static AVLTree getRootLeftLeftCompleteBalanced() {
        AVLNode root = new AVLNode(50);
        Node l = root.setLeftChild(new AVLNode(25));
        l.setLeftChild(new AVLNode(20));
        l.setRightChild(new AVLNode(30));
        Node r = root.setRightChild(new AVLNode(100));
        r.setLeftChild(new AVLNode(75));
        r.setRightChild(new AVLNode(150));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }*/

    /* right-right */
    
    public static AVLTree getRootRightRight() {
        AVLNode root = new AVLNode(3);
        root.setRightChild(new AVLNode(4)).setRightChild(new AVLNode(5));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }
    
    public static AVLTree getRootRightRightBalanced() {
        AVLNode root = new AVLNode(4);
        root.setLeftChild(new AVLNode(3));
        root.setRightChild(new AVLNode(5));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }
    
    /*public static AVLTree getRootRightRightComplete() {
        AVLNode root = new AVLNode(100);
        root.setLeftChild(new AVLNode(50));
        Node r = root.setRightChild(new AVLNode(150));
        r.setLeftChild(new AVLNode(125));
        Node rr = r.setRightChild(new AVLNode(200));
        rr.setLeftChild(new AVLNode(175));
        rr.setRightChild(new AVLNode(250));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }*/
    
    /*public static AVLTree getRootRightRightCompleteBalanced() {
        AVLNode root = new AVLNode(150);
        Node l = root.setLeftChild(new AVLNode(100));
        l.setLeftChild(new AVLNode(50));
        l.setRightChild(new AVLNode(125));
        Node r = root.setRightChild(new AVLNode(200));
        r.setLeftChild(new AVLNode(175));
        r.setRightChild(new AVLNode(250));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }*/
    
    /**
     * 
     * @return 
     */
    public static AVLTree getRootDiamond() {
        AVLNode root = new AVLNode(500);
        AVLNode l = root.setLeftChild(new AVLNode(250));
        l.setRightChild(new AVLNode(300));
        AVLNode ll = l.setLeftChild(new AVLNode(100));
        ll.setRightChild(new AVLNode(150)).setRightChild(new AVLNode(200));
        AVLNode r = root.setRightChild(new AVLNode(750));
        r.setLeftChild(new AVLNode(700));
        AVLNode rr = r.setRightChild(new AVLNode(1000));
        rr.setLeftChild(new AVLNode(950)).setLeftChild(new AVLNode(900));
        AVLTree t = new AVLTree();
        t.setRoot(root);
        return t;
    }
    
}
