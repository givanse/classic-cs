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
public class AVLNodeTest {
    
    public AVLNodeTest() {
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
     * Test of getBalanceFactor method, of class AVLNode.
     */
    @Test
    public void testGetBalanceFactor() {
        System.out.println("getBalanceFactor");
        AVLNode instance = SampleTrees.getRootSingleNode().getRoot();
        int expResult = 0;
        int result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // 0
        instance = SampleTrees.getRootRight().getRoot();
        expResult = -1;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // left-right
        instance = SampleTrees.getRootLeftRight().getRoot();
        expResult = 2;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // left-rigth left
        instance = (AVLNode) SampleTrees.getRootLeftRight()
                .getRoot().getLeftChild();
        expResult = -1;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // left-rigth left rigth
        instance = (AVLNode) SampleTrees.getRootLeftRight()
                .getRoot().getLeftChild().getRightChild();
        expResult = 0;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        
        // left-right (using add)
        instance = new AVLNode(5).add(new AVLNode(3)).add(new AVLNode(4));
        expResult = 2;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // left-rigth left (using add)
        instance = (AVLNode) instance.getLeftChild();
        expResult = -1;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // left-rigth left rigth (using add)
        instance = (AVLNode) instance.getRightChild();
        expResult = 0;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        
        // 2
        instance = SampleTrees.getRootLeftLeft().getRoot();
        expResult = 2;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // 3
        instance = SampleTrees.getRootRightLeft().getRoot();
        expResult = -2;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // 4
        instance = SampleTrees.getRootRightRight().getRoot();
        expResult = -2;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // 6
        instance = (AVLNode) SampleTrees.getRootLeftLeft()
                .getRoot().getLeftChild();
        expResult = 1;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // 7
        instance = (AVLNode) SampleTrees.getRootRightLeft()
                .getRoot().getRightChild();
        expResult = 1;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // 8
        instance = (AVLNode) SampleTrees.getRootRightRight()
                .getRoot().getRightChild();
        expResult = -1;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // 9
        /*instance = SampleTrees.getRootRightLeftComplete().getRoot();
        expResult = -3;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        */// Diamond
        instance = SampleTrees.getRootDiamond().getRoot();
        expResult = 0;
        result = instance.getBalanceFactor();
        assertEquals(expResult, result);
        // Diamond left
        expResult = 2;
        result = ((AVLNode) instance.getLeftChild()).getBalanceFactor();
        assertEquals(expResult, result);
        // Diamond right
        expResult = -2;
        result = ((AVLNode) instance.getRightChild()).getBalanceFactor();
        assertEquals(expResult, result);
        // Diamond left left
        expResult = -2;
        result = ((AVLNode) instance.getLeftChild().getLeftChild())
                .getBalanceFactor();
        assertEquals(expResult, result);
        // Diamond right right
        expResult = 2;
        result = ((AVLNode) instance.getRightChild().getRightChild())
                .getBalanceFactor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeepestDepth method, of class AVLNode.
     */
    @Test
    public void testGetDeepestDepth() {
        System.out.println("getDeepestDepth");
        AVLNode instance = SampleTrees.getRootSingleNode().getRoot();
        int expResult = 0;
        int result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // 0
        instance = SampleTrees.getRootRight().getRoot();
        expResult = 1;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // 3 balanced nodes
        instance = SampleTrees.getRootOf3BalancedNodes().getRoot();
        expResult = 1;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // right-left
        instance = SampleTrees.getRootRightLeft().getRoot();
        expResult = 2;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // right-left right
        instance = (AVLNode) SampleTrees.getRootRightLeft()
                .getRoot().getRightChild();
        expResult = 1;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // left-right
        instance = SampleTrees.getRootLeftRight().getRoot();
        expResult = 2;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // left-right left
        instance = (AVLNode) SampleTrees.getRootLeftRight()
                .getRoot().getLeftChild();
        expResult = 1;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // right-right
        instance = SampleTrees.getRootRightRight().getRoot();
        expResult = 2;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // left-left
        instance = SampleTrees.getRootLeftLeft().getRoot();
        expResult = 2;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // diamond
        instance = SampleTrees.getRootDiamond().getRoot();
        expResult = 4;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // diamond left child
        instance = (AVLNode) SampleTrees.getRootDiamond()
                .getRoot().getLeftChild();
        expResult = 3;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
        // diamond right child
        instance = (AVLNode) SampleTrees.getRootDiamond()
                .getRoot().getRightChild();
        expResult = 3;
        result = instance.getDeepestDepth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepth method, of class AVLNode.
     */
    @Test
    public void testGetDepth() {
        System.out.println("getDepth");
        AVLTree instance = SampleTrees.getRootSingleNode();
        int expResult = 0;
        int result = instance.getRoot().getDepth();
        assertEquals(expResult, result);
        // 1
        /*AVLNode node = (AVLNode) SampleTrees.getRootLeftRightComplete()
                .getRoot().getLeftChild();
        expResult = 1;
        result = node.getDepth();
        assertEquals(expResult, result);
        // 2
        node = (AVLNode) SampleTrees.getRootRightLeftComplete()
                .getRoot().getRightChild().getLeftChild().getLeftChild();
        expResult = 3;
        result = node.getDepth();
        assertEquals(expResult, result);
    */}
    
    /**
     * Test of setLeftChild method, of class AVLNode.
     */
    @Test
    public void testSetLeftChild() {
        System.out.println("setLeftChild");
        // +1 left node
        AVLNode instance = new AVLNode(999);
        assertEquals(0, instance.getBalanceFactor());
        AVLNode childL = new AVLNode(1000); /* intentional wrong value */
        instance.setLeftChild(childL);
        assertEquals(childL, instance.getLeftChild());
        assertEquals(instance, childL.getParent());
        assertEquals(1, instance.getBalanceFactor());
        // +2 left node
        AVLNode childLL = new AVLNode(1001); /* intentional wrong value */
        childL.setLeftChild(childLL);
        assertEquals(childLL, childL.getLeftChild());
        assertEquals(childL, childLL.getParent());
        assertEquals(2, instance.getBalanceFactor());
        assertEquals(1, childL.getBalanceFactor());
        // +3 left node
        AVLNode childLLL = new AVLNode(1002); /* intentional wrong value */
        childLL.setLeftChild(childLLL);
        assertEquals(childLLL, childLL.getLeftChild());
        assertEquals(childLL, childLLL.getParent());
        assertEquals(3, instance.getBalanceFactor());
        assertEquals(2, childL.getBalanceFactor());
        assertEquals(1, childLL.getBalanceFactor());
        // "chainned setting" should be equal to "per node setting"
        AVLNode otherL = new AVLNode(1000); /* intentional wrong values */
        AVLNode otherLL = new AVLNode(1001);
        AVLNode otherLLL = new AVLNode(1002);
        AVLNode other = new AVLNode(999);
        other
          .setLeftChild(otherL).setLeftChild(otherLL).setLeftChild(otherLLL);
        assertEquals(other, instance);
    }
    
    /**
     * Test of setRightChild method, of class AVLNode.
     */
    @Test
    public void testSetRightChild() {
        System.out.println("setRightChild");
        // +1 right node
        AVLNode instance = new AVLNode(80085);
        assertEquals(0, instance.getBalanceFactor());
        AVLNode childR = new AVLNode(80084); /* intentional wrong value */
        instance.setRightChild(childR);
        assertEquals(childR, instance.getRightChild());
        assertEquals(instance, childR.getParent());
        assertEquals(-1, instance.getBalanceFactor());
        assertEquals( 0, childR.getBalanceFactor());
        // +2 right node
        AVLNode childRR = new AVLNode(80083); /* intentional wrong value */
        childR.setRightChild(childRR);
        assertEquals(childRR, childR.getRightChild());
        assertEquals(childR, childRR.getParent());
        assertEquals(-2, instance.getBalanceFactor());
        assertEquals(-1, childR.getBalanceFactor());
        assertEquals( 0, childRR.getBalanceFactor());
        // +3 right node
        AVLNode childRRR = new AVLNode(80082); /* intentional wrong value */
        childRR.setRightChild(childRRR);
        assertEquals(childRRR, childRR.getRightChild());
        assertEquals(childRR, childRRR.getParent());
        assertEquals(-3, instance.getBalanceFactor());
        assertEquals(-2, childR.getBalanceFactor());
        assertEquals(-1, childRR.getBalanceFactor());
        assertEquals( 0, childRRR.getBalanceFactor());
        // "chainned setting" should be equal to "per node setting"
        AVLNode otherR = new AVLNode(80084); /* intentional wrong values */
        AVLNode otherRR = new AVLNode(80083);
        AVLNode otherRRR = new AVLNode(80082);
        AVLNode other = new AVLNode(80085);
        other
           .setRightChild(otherR).setRightChild(otherRR).setRightChild(otherRRR);
        assertEquals(other, instance);
    }
    
    /**
     * Test of setRightChild & setLeftChild methods, of class AVLNode.
     */
    @Test
    public void testSetRightAndLeftChilds() {
        System.out.println("setRightChild & setLeftChild");
        // right right right
        AVLNode childR = new AVLNode(80084); /* intentional wrong values */
        AVLNode childRR = new AVLNode(80083);
        AVLNode childRRR = new AVLNode(80082);
        AVLNode childRL = new AVLNode(8008135);
        AVLNode childRRL = new AVLNode(8008136);
        AVLNode childRRRL = new AVLNode(8008137);
        AVLNode rInstance = new AVLNode(80085);
        rInstance
          .setRightChild(childR).setRightChild(childRR).setRightChild(childRRR);
        // check everything is normal
        assertEquals(-3, rInstance.getBalanceFactor());
        assertEquals(-2, childR.getBalanceFactor());
        assertEquals(-1, childRR.getBalanceFactor());
        assertEquals( 0, childRRR.getBalanceFactor());
        // add left childs
        childR.setLeftChild(childRL);
        assertEquals(-3, rInstance.getBalanceFactor());
        assertEquals(-1, childR.getBalanceFactor());
        assertEquals(-1, childRR.getBalanceFactor());
        assertEquals( 0, childRRR.getBalanceFactor());
        childRR.setLeftChild(childRRL);
        assertEquals(-3, rInstance.getBalanceFactor());
        assertEquals(-1, childR.getBalanceFactor());
        assertEquals( 0, childRR.getBalanceFactor());
        assertEquals( 0, childRRR.getBalanceFactor());
        childRRR.setLeftChild(childRRRL);
        assertEquals(-4, rInstance.getBalanceFactor());
        assertEquals(-2, childR.getBalanceFactor());
        assertEquals(-1, childRR.getBalanceFactor());
        assertEquals( 1, childRRR.getBalanceFactor());
        // left left left
        AVLNode childL = new AVLNode(1000); /* intentional wrong values */
        AVLNode childLL = new AVLNode(1001);
        AVLNode childLLL = new AVLNode(1002);
        AVLNode childLR = new AVLNode(9999);
        AVLNode childLLR = new AVLNode(9998);
        AVLNode childLLLR = new AVLNode(9997);
        AVLNode lInstance = new AVLNode(999);
        lInstance
          .setLeftChild(childL).setLeftChild(childLL).setLeftChild(childLLL);
        // check everything is normal
        assertEquals(3, lInstance.getBalanceFactor());
        assertEquals(2, childL.getBalanceFactor());
        assertEquals(1, childLL.getBalanceFactor());
        assertEquals(0, childLLL.getBalanceFactor());
        // add left childs
        childL.setRightChild(childLR);
        assertEquals(3, lInstance.getBalanceFactor());
        assertEquals(1, childL.getBalanceFactor());
        assertEquals(1, childLL.getBalanceFactor());
        assertEquals(0, childLLL.getBalanceFactor());
        childLL.setRightChild(childLLR);
        assertEquals(3, lInstance.getBalanceFactor());
        assertEquals(1, childL.getBalanceFactor());
        assertEquals(0, childLL.getBalanceFactor());
        assertEquals(0, childLLL.getBalanceFactor());
        childLLL.setRightChild(childLLLR);
        assertEquals( 4, lInstance.getBalanceFactor());
        assertEquals( 2, childL.getBalanceFactor());
        assertEquals( 1, childLL.getBalanceFactor());
        assertEquals(-1, childLLL.getBalanceFactor());
    }
    
}
