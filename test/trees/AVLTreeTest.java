/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author gsilvae
 */
public class AVLTreeTest {
    
    SampleTrees st;

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
     * Test of toString method, of class AVLNode.
     */
    @Test
    public void testToStringPreorder() {
        System.out.println("toString");
        AVLTree instance;
        // 1 node
        instance = SampleTrees.getRootSingleNode();
        String expResult = "[42]\n";
        String result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // 3 nodes
        instance = SampleTrees.getRootOf3BalancedNodes();
        expResult = "[500]\n" +
                           "   [253]\n" +
                           "   [780]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // right
        instance = SampleTrees.getRootRight();
        expResult = "[86]\n" +
                           "   [nil]\n" +
                           "   [123]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // left right
        instance = SampleTrees.getRootLeftRight();
        expResult = "[5]\n" +
                    "   [3]\n" +
                    "      [nil]\n" +
                    "      [4]\n" +
                    "   [nil]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // left right balanced
        instance = SampleTrees.getRootLeftRightBalanced();
        expResult = "[5]\n" +
                    "   [4]\n" +
                    "      [3]\n" +
                    "      [nil]\n" +
                    "   [nil]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // right left case
        instance = SampleTrees.getRootRightLeft();
        expResult = "[3]\n" +
                    "   [nil]\n" +
                    "   [5]\n" +
                    "      [4]\n" +
                    "      [nil]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // left left
        instance = SampleTrees.getRootLeftLeft();
        expResult = "[5]\n" +
                    "   [4]\n" +
                    "      [3]\n" +
                    "      [nil]\n" +
                    "   [nil]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // right right
        instance = SampleTrees.getRootRightRight();
        expResult = "[3]\n" +
                    "   [nil]\n" +
                    "   [4]\n" +
                    "      [nil]\n" +
                    "      [5]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // left-right complete
        /*instance = SampleTrees.getRootLeftRightComplete();
        expResult = "[7]\n" +
                    "   [3]\n" +
                    "      [2]\n" +
                    "      [5]\n" +
                    "         [4]\n" +
                    "         [6]\n" +
                    "   [nil]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // left-right complete and balanced
        instance = SampleTrees.getRootLeftRightCompleteBalanced();
        expResult = "[7]\n" +
                    "   [5]\n" +
                    "      [3]\n" +
                    "         [2]\n" +
                    "         [4]\n" +
                    "      [6]\n" +
                    "   [nil]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // right-left complete
        instance = SampleTrees.getRootRightLeftComplete();
        expResult = "[100]\n" +
                    "   [nil]\n" +
                    "   [200]\n" +
                    "      [150]\n" +
                    "         [125]\n" +
                    "         [175]\n" +
                    "      [300]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // right-left complete and balanced
        instance = SampleTrees.getRootRightLeftCompleteBalanced();
        expResult = "[100]\n" +
                    "   [nil]\n" +
                    "   [150]\n" +
                    "      [125]\n" +
                    "      [200]\n" +
                    "         [175]\n" +
                    "         [300]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // left-left complete
        instance = SampleTrees.getRootLeftLeftComplete();
        expResult = "[100]\n" +
                    "   [50]\n" +
                    "      [25]\n" +
                    "         [20]\n" +
                    "         [30]\n" +
                    "      [75]\n" +
                    "   [150]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // left-left complete balanced
        instance = SampleTrees.getRootLeftLeftCompleteBalanced();
        expResult = "[50]\n" +
                    "   [25]\n" +
                    "      [20]\n" +
                    "      [30]\n" +
                    "   [100]\n" +
                    "      [75]\n" +
                    "      [150]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // right-right complete
        instance = SampleTrees.getRootRightRightComplete();
        expResult = "[100]\n" +
                    "   [50]\n" +
                    "   [150]\n" +
                    "      [125]\n" +
                    "      [200]\n" +
                    "         [175]\n" +
                    "         [250]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // right-right complete balanced
        instance = SampleTrees.getRootRightRightCompleteBalanced();
        expResult = "[150]\n" +
                    "   [100]\n" +
                    "      [50]\n" +
                    "      [125]\n" +
                    "   [200]\n" +
                    "      [175]\n" +
                    "      [250]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        */// diamond
        instance = SampleTrees.getRootDiamond();
        expResult = "[500]\n" +
                    "   [250]\n" +
                    "      [100]\n" +
                    "         [nil]\n" +
                    "         [150]\n" +
                    "            [nil]\n" +
                    "            [200]\n" +
                    "      [300]\n" +
                    "   [750]\n" +
                    "      [700]\n" +
                    "      [1000]\n" +
                    "         [950]\n" +
                    "            [900]\n" +
                    "            [nil]\n" +
                    "         [nil]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // left-right (using add)
        instance  = new AVLTree(5).add(new AVLNode(3)).add(new AVLNode(4));
        expResult = "[4]\n" +
                    "   [3]\n" +
                    "   [5]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
        // exercise 5
        instance = Exercises.getAnswer5();
        expResult = "[38]\n" +
                    "   [20]\n" +
                    "      [9]\n" +
                    "         [5]\n" +
                    "         [14]\n" +
                    "            [12]\n" +
                    "            [16]\n" +
                    "      [31]\n" +
                    "         [25]\n" +
                    "         [nil]\n" +
                    "   [49]\n" +
                    "      [41]\n" +
                    "      [51]\n" +
                    "         [nil]\n" +
                    "         [56]\n";
        result = instance.toStringPreorder();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of balanceLeftRight method, of class AVLNode.
     */
    @Test
    public void testBalanceLeftRight() {
        System.out.println("balanceLeftRight");
        AVLTree instance = SampleTrees.getRootLeftRight();
        instance.balanceLeftRight(instance.getRoot());
        AVLTree expResult = SampleTrees.getRootLeftRightBalanced();
        AVLTree result = instance;
        assertEquals(expResult, result);
        // 1
        /*instance = SampleTrees.getRootLeftRightComplete();
        instance.balanceLeftRight(instance.getRoot());
        expResult = SampleTrees.getRootLeftRightCompleteBalanced();
        result = instance;
        assertEquals(expResult, result);
    */}
    
    /**
     * Test of balanceRightLeft method, of class AVLNode.
     */
    @Test
    public void testBalanceRightLeft() {
        System.out.println("balanceRightLeft");
        AVLTree instance = SampleTrees.getRootRightLeft();
        instance.balanceRightLeft(instance.getRoot());
        AVLTree expResult = SampleTrees.getRootRightLeftBalanced();
        AVLTree result = instance;
        assertEquals(expResult, result);
        // 1
        /*instance = SampleTrees.getRootRightLeftComplete();
        expResult = SampleTrees.getRootRightLeftCompleteBalanced();
        instance.balanceRightLeft(instance.getRoot());
        result = instance;
        assertEquals(expResult, result);
    */}
    
    /**
     * Test of balanceLeftLeft method, of class AVLNode.
     */
    @Test
    public void testBalanceLeftLeft() {
        System.out.println("balanceLeftLeft");
        AVLTree instance = SampleTrees.getRootLeftLeft();
        instance.balanceLeftLeft(instance.getRoot());
        AVLTree expResult = SampleTrees.getRootLeftLeftBalanced();
        AVLTree result = instance;
        assertEquals(expResult, result);
    }
    
    /**
     * Test of balanceRightRight method, of class AVLNode.
     */
    @Test
    public void testBalanceRightRight() {
        System.out.println("balanceRightRight");
        AVLTree instance  = SampleTrees.getRootRightRight();
        instance.balanceRightRight(instance.getRoot());
        AVLTree expResult = SampleTrees.getRootRightRightBalanced();
        AVLTree result = instance;
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class AVLNode.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        // 1
        AVLTree instance  = new AVLTree(5).add(new AVLNode(3));
        AVLTree expResult = new AVLTree();
        expResult.setRoot(new AVLNode(5)).setLeftChild(new AVLNode(3));
        assertEquals(expResult, instance);
        // 2
        instance  = new AVLTree(5).add(new AVLNode(6));
        expResult = new AVLTree();
        expResult.setRoot(new AVLNode(5)).setRightChild(new AVLNode(6));
        assertEquals(expResult, instance);
        // 3
        instance  = new AVLTree(5).add(new AVLNode(4)).add(new AVLNode(6));
        expResult = new AVLTree();
        Node r = expResult.setRoot(new AVLNode(5));
        r.setLeftChild(new AVLNode(4));
        r.setRightChild(new AVLNode(6));
        assertEquals(expResult, instance);
        // 4
        instance  = new AVLTree(180);
        expResult = instance.add(new AVLNode(190));
        assertEquals(expResult, instance);
        // left-right (using add)
        instance  = new AVLTree(5).add(new AVLNode(3)).add(new AVLNode(4));
        expResult = SampleTrees.getRootLeftLeftBalanced();
        assertEquals(expResult, instance);
        // right-left (using add)
        instance  = new AVLTree(3).add(new AVLNode(5)).add(new AVLNode(4));
        expResult = SampleTrees.getRootRightRightBalanced();
        assertEquals(expResult, instance);
    }
    
    /**
     * Build and test well formed AVL trees.
     */
    @Test
    public void testExercises() {
        System.out.println("Exercises");
        // 1 does not need balancing
        AVLTree instance  = new AVLTree(11);
        instance.add(8).add(20).add(4);
        AVLTree expResult = Exercises.getAnswer1();
        assertEquals(expResult, instance);
        // 2 does not need balancing
        instance  = new AVLTree(11);
        instance.add(8).add(20).add(4).add(27).add(16);
        expResult = Exercises.getAnswer2();
        assertEquals(expResult, instance);
        // 3
        instance  = new AVLTree(11);
        instance.add(8).add(20).add(4).add(27).add(16).add(3);
        expResult = Exercises.getAnswer3();
        assertEquals(expResult, instance);
        // 4
        instance  = new AVLTree(11);
        instance.add(8).add(20).add(4).add(27).add(16).add(5);
        expResult = Exercises.getAnswer4();
        assertEquals(expResult, instance);
        // 5
        instance  = new AVLTree(38);
        instance.add(20).add(49).add(9).add(31).add(41).add(51).add(5)
                .add(16).add(25).add(56).add(12).add(14);
        expResult = Exercises.getAnswer5();
        assertEquals(expResult, instance);
    }
    
}