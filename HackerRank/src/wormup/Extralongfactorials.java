/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormup;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Chathuranga - Pamba
 */
public class Extralongfactorials {

    /**
     * @param args the command line arguments
     */
    public Extralongfactorials() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        BigInteger factrial = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            factrial = factrial.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(factrial.toString());

    }

    public static void main(String[] args) {
        new Extralongfactorials();
    }

}
