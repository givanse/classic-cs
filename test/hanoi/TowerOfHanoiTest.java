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
    
    private int discs3[] = {1, 2, 3};
    
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
    }
}
