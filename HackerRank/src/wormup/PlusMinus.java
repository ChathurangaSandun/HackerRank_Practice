/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormup;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Chathuranga - Pamba
 */
public class PlusMinus {

    public PlusMinus() {

        Scanner s = new Scanner(System.in);

        int negetive = 0;
        int zero = 0;
        int positive = 0;

        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            int number = s.nextInt();

            if (number == 0) {
                zero++;
            } else if (number < 0) {
                negetive++;
            } else {
                positive++;
            }
        }

        DecimalFormat df = new DecimalFormat("0.###");

        System.out.println(df.format((float) positive / N));
        System.out.println(df.format((float) negetive / N));
        System.out.println(df.format((float) zero / N));

    }

}
