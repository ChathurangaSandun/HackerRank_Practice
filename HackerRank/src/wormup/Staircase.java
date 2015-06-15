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
public class Staircase {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    public Staircase() {
       Scanner inputs = new Scanner(System.in);

        int lines = inputs.nextInt();
        
        
        for (int i = 0; i < lines; i++) {
            int x = 1;
            for (int j = x; j < lines-i; j++) {
                System.out.print(" ");
                x++;
            }
            
            for (int j = x; j < lines+1; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        
    }

    
    
    
    
    
    public static void main(String[] args) {
       new Staircase();
    }
    
}
