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

                if (i == j) {
                    firstDiagonal += number;
                } else if ((N - 1 - i) == j) {
                    secondDiagonal += number;
                    System.out.println(number);
                }

            }
        }

        System.out.println(firstDiagonal+" "+secondDiagonal);
        
        int dif = firstDiagonal - secondDiagonal;
        System.out.println(dif < 0 ? -dif : dif);

    }

}
