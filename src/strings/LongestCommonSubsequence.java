/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * 
 * @author gsilvae
 */
public class LongestCommonSubsequence {
    
    public int getLCSLengthRecursive(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        
        if(s1Length == 0 || s2Length == 0)
            return 0;
        
        int s1LastCharIndex = s1Length-1;
        int s2LastCharIndex = s2Length-1;
        String s1MinusLastChar = s1.substring(0, s1LastCharIndex);    
        String s2MinusLastChar = s2.substring(0, s2LastCharIndex);
        char s1LastChar = s1.charAt(s1LastCharIndex);
        char s2LastChar = s2.charAt(s2LastCharIndex);
        
        if( s1LastChar == s2LastChar) {  
            return this.getLCSLengthRecursive(s1MinusLastChar, s2MinusLastChar) + 1;
        } else {
            int a = getLCSLengthRecursive(s1MinusLastChar, s2);
            int b = getLCSLengthRecursive(s1, s2MinusLastChar);
            return a > b ? a : b;
        }
    }
    
    public int getLCSLengthDynamicProgramming(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        
        int count[][] = new int[s1Length][s2Length];
        
        // init count array
        for(int i=0; i<s1Length; i++)
            count[i][0] = 0;
        for(int j=0; j<s2Length; j++)
            count[0][j] = 0;
        
        for(int i=0; i<s1Length; i++)     // iterate through s1
            for(int j=0; j<s2Length; j++) // iterate through s2
                if(s1.charAt(i) == s2.charAt(j)) {
                    int u = i == 0 ? i : i-1;
                    int v = j == 0 ? j : j-1;
                    count[i][j] = count[u][v] + 1;
                } else {
                    int upperBox  = i == 0 ? count[i][j] : count[i-1][j];
                    int leftBox   = j == 0 ? count[i][j] : count[i][j-1];
                    count[i][j] = Math.max(upperBox, leftBox);
                }
        return count[s1Length-1][s2Length-1];
    }
    
}
