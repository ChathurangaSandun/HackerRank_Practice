/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wormup;

import java.util.Scanner;

/**
 *
 * @author Chathuranga - Pamba
 */
public class AVeryBigSum {

    public AVeryBigSum() {
        Scanner input = new Scanner (System.in);
        long N = input.nextLong();
        
        long total= 0;
        
        
        for (int i = 0; i < N; i++) {
            total += input.nextLong();
        }
        
        System.out.println(total);
    
    }
    
    public static void main(String[] args) {
        new AVeryBigSum();
    }
    
    
    
}
