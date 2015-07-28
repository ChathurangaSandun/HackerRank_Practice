/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EpicCodeCodeSprint;

import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Chathuranga - Pamba
 */
public class PerfectHiring {

    /**
     * @param args the command line arguments
     */
    
    
    HashMap<Integer, Integer> mamp = new LinkedHashMap<>();
    
    public PerfectHiring() {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int P = input.nextInt();
        int X = input.nextInt();
        
        
        
        
        for (int i = 0; i < N; i++) {
            int next = input.nextInt();            
            int value = P * next;
            mamp.put(i+1, value);
            P-= X;
        }
        
        int maxValueInMap=(Collections.max(mamp.values()));  // This will return max value in the Hashmap
        for (Entry<Integer, Integer> entry : mamp.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }
        
        
    }

    
    
    
    
    public static void main(String[] args) {
        new PerfectHiring();
    }
    
}
