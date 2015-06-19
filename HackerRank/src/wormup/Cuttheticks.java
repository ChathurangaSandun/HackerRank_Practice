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
public class Cuttheticks {

    public Cuttheticks() {

        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();

        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = stdin.nextInt();
        }

        
        while (true) {
            int stick=0;
            for (int i = 0; i < array.length; i++) {
                if(array[i]/2>0){
                    stick++;
                    array[i]=array[i]/2;
                }
            }
            
            
            if(stick==0){
                break;
            }else{
                System.out.println(stick);
                stick=0;
            }
            
            
        }

    }
    
    
}
