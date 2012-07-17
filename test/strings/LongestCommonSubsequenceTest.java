/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author gsilvae
 */
public class LongestCommonSubsequenceTest {
    
    private String s11 = "abc";
    private String s12 = "acb";
    
    private String s21 = "a1b2c3d4e";
    private String s22 = "zz1yy2xx3ww4vv";
    
    private String s31 = "abcdgh";
    private String s32 = "aedfhr";
    
    private String s41 = "abcdefghijklmnopqrstuvwxyz";
    private String s42 = "a0b0c0d0e0f0g0h0i0j0k0l0m0n0o0p0q0r0s0t0u0v0w0x0y0z0";
    
    private String s51 = "abcdefghijklmnzyxwvutsrqpo";
    private String s52 = "opqrstuvwxyzabcdefghijklmn";
    
    public LongestCommonSubsequenceTest() {
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
     * Test of lcsLengthRecursive method, of class LongestCommonSubsequence.
     */
    @Test
    public void testLcsLengthRecursive() {
        System.out.println("lcsLengthRecursive");
        LongestCommonSubsequence instance = new LongestCommonSubsequence();
        int result = instance.getLCSLengthRecursive(this.s11, this.s12);
        int expResult = 2;
        assertEquals(expResult, result);
        result = instance.getLCSLengthRecursive(this.s21, this.s22);
        expResult = 4;
        assertEquals(expResult, result);
        result = instance.getLCSLengthRecursive(this.s31, this.s32);
        expResult = 3;
        assertEquals(expResult, result);
        result = instance.getLCSLengthRecursive(this.s41, this.s42);
        expResult = 26;
        assertEquals(expResult, result);
        result = instance.getLCSLengthRecursive(this.s51, this.s52);
        expResult = 14;
        assertEquals(expResult, result);
    }

    /**
     * Test of lcsLengthDynamicProgramming method, of class LongestCommonSubsequence.
     */
    @Test
    public void testLcsLengthDynamicProgramming() {
        System.out.println("lcsLengthDynamicProgramming");
        LongestCommonSubsequence instance = new LongestCommonSubsequence();
        int result = instance.getLCSLengthDynamicProgramming(this.s11, this.s12);
        int expResult = 2;
        assertEquals(expResult, result);
        result = instance.getLCSLengthDynamicProgramming(this.s21, this.s22);
        expResult = 4;
        assertEquals(expResult, result);
        result = instance.getLCSLengthDynamicProgramming(this.s31, this.s32);
        expResult = 3;
        assertEquals(expResult, result);
        result = instance.getLCSLengthDynamicProgramming(this.s41, this.s42);
        expResult = 26;
        assertEquals(expResult, result);
        result = instance.getLCSLengthDynamicProgramming(this.s51, this.s52);
        expResult = 14;
        assertEquals(expResult, result);
    }
}
