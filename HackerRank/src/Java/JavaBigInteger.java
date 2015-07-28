/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Chathuranga - Pamba
 */
public class JavaBigInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String num1 = in.next();
        String num2 = in.next();
        
        BigInteger numOne = new BigInteger(num1);
        BigInteger numTwo = new BigInteger(num2);
        
        System.out.println(numOne.add(numTwo));
        System.out.println(numOne.multiply(numTwo));
        
        
        
        
    }
    
}
