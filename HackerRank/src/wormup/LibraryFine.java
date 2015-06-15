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
public class LibraryFine {

    /**
     * @param args the command line arguments
     */
    public LibraryFine() {
        Scanner inputs = new Scanner(System.in);

        int returnDay = inputs.nextInt();
        int returnMonth = inputs.nextInt();
        int returnYear = inputs.nextInt();

        int expectDay = inputs.nextInt();
        int expectMonth = inputs.nextInt();
        int expectYear = inputs.nextInt();

        if (returnYear < expectYear) {
            System.out.println("0");
        } else if (returnYear == expectYear) {
            if (returnMonth == expectMonth) {
                System.out.println((returnDay - expectDay) * 15 < 0 ? 0 : ((returnDay - expectDay) * 15));
            } else {
                System.out.println(((returnMonth - expectMonth) * 500) < 0 ? 0 : ((returnMonth - expectMonth) * 500));
            }
        } else {
            System.out.println("10000");
        }

    }

    public static void main(String[] args) {
        new LibraryFine();
    }

}
