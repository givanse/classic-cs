/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author gsilvae
 */
public class TowerOfHanoiTest {
    
    private int discs3[] = {3, 2, 1};
    private int discs4[] = {4, 3, 2, 1};
    private int discs5[] = {5, 4, 3, 2, 1};
    private int discs10[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    
    public TowerOfHanoiTest() {
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
     * Test of toString method, of class TowerOfHanoi.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TowerOfHanoi instance = new TowerOfHanoi(this.discs3);
        String expResult = "[3, 2, 1]\n" +
                           "[]\n" +
                           "[]\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        // 5 discs
        instance = new TowerOfHanoi(this.discs5);
        expResult = "[5, 4, 3, 2, 1]\n" +
                    "[]\n" +
                    "[]\n";
        result = instance.toString();
        assertEquals(expResult, result);
        // 5 discs, last tower
        instance = new TowerOfHanoi(new int[]{});
        instance.setTower2(this.discs5);
        expResult = "[]\n" +
                    "[]\n" +
                    "[5, 4, 3, 2, 1]\n";
        result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of moveFromXToY method, of class TowerOfHanoi.
     */
    @Test
    public void testMoveLeftToRight() {
        System.out.println("moveFromXToY");
        TowerOfHanoi instance = new TowerOfHanoi(this.discs3);
        instance.moveFromXToY(0, 1);
        TowerOfHanoi expResult = new TowerOfHanoi(new int[]{3, 2});
        expResult.setTower1(new int[]{1});
        assertEquals(expResult, instance);
        //
        instance = new TowerOfHanoi(this.discs3);
        instance.moveFromXToY(0, 1);
        instance.moveFromXToY(0, 2);
        instance.moveFromXToY(1, 0);
        expResult = new TowerOfHanoi(new int[]{3, 1});
        expResult.setTower2(new int[]{2});
        assertEquals(expResult, instance);
    }
    
    /**
     * Test of legalMove method, of class TowerOfHanoi.
     */
    @Test
    public void testLegalMove() {
        System.out.println("legalMove");
        // a -> c
        TowerOfHanoi instance = new TowerOfHanoi(this.discs3);
        instance.legalMove(0, 2);
        TowerOfHanoi expResult = new TowerOfHanoi(new int[]{3, 2});
        expResult.setTower2(new int[]{1});
        assertEquals(expResult, instance);
        // a -> b
        instance.legalMove(0, 1);
        expResult.setTower0(new int[]{3});
        expResult.setTower1(new int[]{2});
        assertEquals(expResult, instance);
        // b <- c
        instance.legalMove(1, 2);
        expResult.setTower1(new int[]{2, 1});
        expResult.setTower2(new int[]{});
        assertEquals(expResult, instance);
    }
    
    /**
     * Test of solve method, of class TowerOfHanoi.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        // 3 discs
        TowerOfHanoi instance = new TowerOfHanoi(this.discs3);
        instance.solve();
        TowerOfHanoi expResult = new TowerOfHanoi(new int[]{});
        expResult.setTower2(this.discs3);
        assertEquals(expResult, instance);
        // 4 discs
        instance = new TowerOfHanoi(this.discs4);
        instance.solve();
        expResult = new TowerOfHanoi(new int[]{});
        expResult.setTower2(this.discs4);
        assertEquals(expResult, instance);
        // 5 discs
        instance = new TowerOfHanoi(this.discs5);
        instance.solve();
        expResult = new TowerOfHanoi(new int[]{});
        expResult.setTower2(this.discs5);
        assertEquals(expResult, instance);
        // 10 discs
        instance = new TowerOfHanoi(this.discs10);
        instance.solve();
        expResult = new TowerOfHanoi(new int[]{});
        expResult.setTower2(this.discs10);
        assertEquals(expResult, instance);
    }
    
}
