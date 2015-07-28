/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Chathuranga - Pamba
 */
public class JavaStdinandStdout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int integer = Integer.parseInt(in.readLine());
        
        
        
        double doubleNumber = Double.parseDouble(in.readLine());
        String string  = in.readLine();
        
        System.out.println("String: "+string);
        System.out.println("Double: "+doubleNumber);
        System.out.println("Int: "+integer);
        
        
    }
    
}
