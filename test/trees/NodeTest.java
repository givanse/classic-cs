/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author gsilvae
 */
public class NodeTest {
    
    SampleTrees st;
    
    public NodeTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLeftChild method, of class Node.
     */
    @Test
    public void testGetLeftChild() {
        System.out.println("getLeftChild");
        Node instance = SampleTrees.getRootSingleNode().getRoot();
        Node expResult = null;
        Node result = instance.getLeftChild();
        assertEquals(expResult, result);
        // 1
        Node parent = new Node(74);
        Node child = new Node(73);
        parent.add(child);
        expResult = child;
        result = parent.getLeftChild();
        assertEquals(expResult, result);
        // 2
        parent = new Node(74);
        child = new Node(-1);
        parent.add(child);
        expResult = child;
        result = parent.getLeftChild();
        assertEquals(expResult, result);
    }

    /**
     * Test of getParent method, of class Node.
     */
    @Test
    public void testGetParent() {
        System.out.println("getParent");
        Node instance = SampleTrees.getRootSingleNode().getRoot();
        Node expResult = null;
        Node result = instance.getParent();
        assertEquals(expResult, result);
        // 1
        Node parent = new Node(84);
        Node child = new Node(83);
        parent.add(child);
        expResult = parent;
        result = child.getParent();
        assertEquals(expResult, result);
        // 2
        parent = new Node(84);
        child = new Node(85);
        parent.add(child);
        expResult = parent;
        result = child.getParent();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRightChild method, of class Node.
     */
    @Test
    public void testGetRightChild() {
        System.out.println("getRightChild");
        Node instance = SampleTrees.getRootSingleNode().getRoot();
        Node expResult = null;
        Node result = instance.getRightChild();
        assertEquals(expResult, result);
        // 1
        Node parent = new Node(94);
        Node child = new Node(94);
        parent.add(child);
        expResult = child;
        result = parent.getRightChild();
        assertEquals(expResult, result);
        // 1
        parent = new Node(94);
        child = new Node(95);
        parent.add(child);
        expResult = child;
        result = parent.getRightChild();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValue method, of class Node.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Node instance = SampleTrees.getRootSingleNode().getRoot();
        int expResult = 42;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // 1
        instance = new Node(-5);
        expResult = -5;
        result = instance.getValue();
        assertEquals(expResult, result);
        // 2
        instance = SampleTrees.getRootOf3BalancedNodes().getRoot();
        expResult = 500;
        result = instance.getRightChild().getParent().getValue();
        assertEquals(expResult, result);
        // 3
        instance = SampleTrees.getRootLeftRight().getRoot();
        expResult = 3;
        result = instance.getLeftChild().getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Node.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        AVLNode instance = SampleTrees.getRootSingleNode().getRoot();
        boolean result = instance.equals(new AVLNode(42));
        boolean expResult = true;
        assertEquals(expResult, result);
        // 1
        instance = SampleTrees.getRootSingleNode().getRoot();
        instance.add(new AVLNode(43));
        AVLNode other = SampleTrees.getRootSingleNode().getRoot();
        other.add(new Node(43));
        result = instance.equals(other);
        expResult = false;
        assertEquals(expResult, result);
        // 2
        instance = (AVLNode) SampleTrees.getRootSingleNode()
                .getRoot().add(new Node(0));
        other = new AVLNode(42);
        other.setLeftChild(new Node(0));
        result = instance.equals(other);
        expResult = true;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of compareTo method, of class Node.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Node n = new Node(42);
        Node instance = st.getRootSingleNode().getRoot();
        int expResult = 0;
        int result = instance.compareTo(n);
        assertEquals(expResult, result);
        // 1
        n = new Node(12);
        instance = st.getRootSingleNode().getRoot();
        expResult = 30;
        result = instance.compareTo(n);
        assertEquals(expResult, result);
        // 2
        n = new Node(72);
        instance = st.getRootSingleNode().getRoot();
        expResult = -30;
        result = instance.compareTo(n);
        assertEquals(expResult, result);
        // 3
        n = new Node(2);
        instance = st.getRootSingleNode().getRoot();
        expResult = -40;
        result = n.compareTo(instance);
        assertEquals(expResult, result);
        // 4
        n = new Node(82);
        instance = st.getRootSingleNode().getRoot();
        expResult = 40;
        result = n.compareTo(instance);
        assertEquals(expResult, result);
        // 5
        n = new Node(-52);
        instance = st.getRootSingleNode().getRoot();
        expResult = 94;
        result = instance.compareTo(n);
        assertEquals(expResult, result);
        // 6
        n = new Node(0);
        instance = SampleTrees.getRootSingleNode().getRoot();
        expResult = 42;
        result = instance.compareTo(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Node.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Node instance = SampleTrees.getRootSingleNode().getRoot();
        String expResult = "[42]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // 1
        System.out.println("toString");
        instance = SampleTrees.getRootOf3BalancedNodes().getRoot();
        expResult = "[500]";
        result = instance.toString();
        assertEquals(expResult, result);
        // 2
        System.out.println("toString");
        instance = SampleTrees.getRootRight()
                .getRoot().getRightChild();
        expResult = "[123]";
        result = instance.toString();
        assertEquals(expResult, result);
        // 3
        System.out.println("toString");
        instance = SampleTrees.getRootLeftRight()
                .getRoot().getLeftChild().getParent();
        expResult = "[5]";
        result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of isRootRightSideDescendant method, of class Node.
     */
    @Test
    public void testIsRootRightSideDescendant() {
        System.out.println("isRootRightSideDescendant");
        Node instance = SampleTrees.getRootSingleNode().getRoot();
        boolean expResult = true;
        boolean result = instance.isRootRightSideDescendant();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Node.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        AVLNode other = new AVLNode(42);
        AVLNode instance = SampleTrees.getRootSingleNode().getRoot();
        boolean expResult = true;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // 1
        other = SampleTrees.getRootLeftRight().getRoot();
        instance = (AVLNode) new AVLNode(5);
        instance.setLeftChild(new AVLNode(3)).setRightChild(new AVLNode(4));
        expResult = true;
        result = instance.equals(other);
        assertEquals(expResult, result);
        // 2
        instance = new AVLNode(5);
        expResult = false;
        result = instance.equals(new Node(4));
        assertEquals(expResult, result);
        // 3
        instance = new AVLNode(10);
        instance.setLeftChild(new AVLNode(9));
        instance.setRightChild(new AVLNode(11));
        other = new AVLNode(10);
        other.setLeftChild(new AVLNode(9));
        other.setRightChild(new AVLNode(12));
        expResult = false;
        result = instance.equals(other);
        assertEquals(expResult, result);
    }
}
