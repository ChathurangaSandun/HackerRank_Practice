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
public class DiagonalDifference {

    public DiagonalDifference() {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int matrix[][] = new int[N][N];

        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int number = input.nextInt();
                matrix[i][j] = number;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    firstDiagonal += matrix[i][j];
                }
            }

        }
        
        for (int i = 0; i < N; i++) {
            for (int j = N-1-i; j > -1; j--) {
                System.out.println(j);
                if (N-1-i == j) {
                    System.out.println("-"+matrix[i][j]);
                    secondDiagonal += matrix[i][j];
                }
            }

        }
        
        
        

        System.out.println(firstDiagonal + " " + secondDiagonal);

        int dif = firstDiagonal - secondDiagonal;
        System.out.println(dif < 0 ? -dif : dif);

    }

    public static void main(String[] args) {
        new DiagonalDifference();
    }

}
