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
public class TimeConversion {

    /**
     * @param args the command line arguments
     */
    public TimeConversion() {
        Scanner input = new Scanner(System.in);
        String timeCassic = input.next();

        String hour = timeCassic.substring(0, 2);
        String min = timeCassic.substring(3, 5);
        String second = timeCassic.substring(6, 8);
        String zone = timeCassic.substring(8, 10);

        if ("AM".equals(zone)) {
            int hourInt = Integer.parseInt(hour);
            if (hourInt == 12) {
                System.out.println("00" + ":" + min + ":" + second);
            } else {

                System.out.println(hour + ":" + min + ":" + second);
            }
        } else {
            int hourInt = Integer.parseInt(hour);
            
            if (hourInt == 12) {
                System.out.println("12" + ":" + min + ":" + second);
            } else {

                System.out.println((hourInt+12) + ":" + min + ":" + second);
            }

        }

    }

    public static void main(String[] args) {
        new TimeConversion();
    }

}
