/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wormup;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chathuranga - Pamba
 */
public class CaesarCipher {

    /**
     * @param args the command line arguments
     */



    public CaesarCipher() {
        Scanner input = new Scanner(System.in);
        int charSize = input.nextInt();
        String string = input.next();
        int roundup = input.nextInt();
        
        ArrayList<Character>  letters = new ArrayList();
        
        for (int i = 0; i < charSize; i++) {
            char character = string.charAt(i);
            int ascii = character; 
            
            //System.out.println(character+ " " +ascii);
            char newCharacter=character;
            if(ascii>=65 && ascii<=90){
                //System.out.println("dddd");
                newCharacter = (char) (((ascii-65+roundup)%26)+65);
                
            }else if(ascii>=97 && ascii<=122){
                newCharacter = (char) (((ascii-97+roundup)%26)+97);
            }
            //System.out.println(newCharacter);
            letters.add(newCharacter);
        }
        
        for (Character character : letters) {
            System.out.print(character);
        }
        System.out.println("");

    }




    public static void main(String[] args) {
        CaesarCipher c = new CaesarCipher();
        
    }

}
