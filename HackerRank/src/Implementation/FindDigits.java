/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import java.util.Scanner;

/**
 *
 * @author Chathuranga - Pamba
 */
public class FindDigits {

    public FindDigits() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int number = scanner.nextInt();
            int findDigits = findDigits(number);
            System.out.println(findDigits);
        }

    }

    public static void main(String[] args) {
        new FindDigits();
    }

    private int findDigits(int number) {
        int count = 0;
        
        String Number = String.valueOf(number);
        
        for (int i = 0; i < Number.length(); i++) {
            int digit =((int) Number.charAt(i))-48;
            
                if(digit != 0){
                    if(number%digit == 0){
                        
                        count++;
                    }
                }
            
            
        }
        return count;
        
        
        
    }

}
