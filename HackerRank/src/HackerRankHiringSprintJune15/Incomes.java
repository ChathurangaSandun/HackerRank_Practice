/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HackerRankHiringSprintJune15;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Chathuranga - Pamba
 */
public class Incomes {

    public Incomes() {
        Scanner input = new Scanner(System.in);
        int employees = input.nextInt();
        
        int S[] =new int[employees];
        for (int i = 0; i < employees; i++) {
            S[i] = input.nextInt();
        }
        Arrays.sort(S);
        
        int query = input.nextInt();
        
        int Q[] =new int[query];
        for (int i = 0; i < query; i++) {
            Q[i] = input.nextInt();
        }
        Arrays.sort(Q);
        
        int parraralQuary[] = new int[Q.length];
        
        
        L1:for (int i = 0; i <Q.length-1 ; i++) {
            L2:for (int j = 0; j < S.length; j++) {
                if(Q[i]>S[j]){
                    parraralQuary[i]++;
                }else{
                    
                    parraralQuary[i+1]=parraralQuary[i];
                    System.out.println("pp"+parraralQuary[i]);
                    break L2;
                }
            }
        }
        
        parraralQuary[parraralQuary.length-1]=employees;
        
        
        for (int i : parraralQuary) {
            System.out.println(i);
        }
        
        
    }
    
    public static void main(String[] args) {
        new Incomes();
    }
    
    
    
    
}
