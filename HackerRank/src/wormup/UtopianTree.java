/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormup;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chathuranga - Pamba
 */
public class UtopianTree {

    public UtopianTree() {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for (int i = 0; i < T; i++) {
            int number = input.nextInt();

            int tree = 1;
            for (int k = 1; k <number+1; k++) {
                if (k % 2 == 0) {
                    tree+=1;

                } else {
                    tree *= 2;
                }
            }
            
            System.out.println(tree);
        }

        

    }
    
    
    public static void main(String[] args) {
        new UtopianTree();
    }

}
