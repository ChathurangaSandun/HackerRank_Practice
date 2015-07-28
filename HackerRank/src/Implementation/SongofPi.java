/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Chathuranga - Pamba
 */
public class SongofPi {

    /**
     * @param args the command line arguments
     */
    public SongofPi() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        for (int i = 0; i < n; i++) {
            String song = in.readLine();
            String piSongString = piSong(song);
            if(isSongPi(piSongString)){
                System.out.println("It's a pi song.");
            }else{
                System.out.println("It's not a pi song.");
            }

        }

    }

    public static void main(String[] args) throws IOException {
        new SongofPi();
    }

    private String piSong(String song) {

        String wordNumbers = "";

        String[] split = song.split(" ");
        for (String string : split) {
            wordNumbers += String.valueOf(string.length());
        }

        return wordNumbers;
    }

    private boolean isSongPi(String piSongString) {
        final String pi = "31415926535897932384626433833";
        
        boolean isPiSong  = true;
        
        for (int i = 0; i < piSongString.length(); i++) {
            if(piSongString.charAt(i) != pi.charAt(i)){
                isPiSong = false;
                break;
            }
        }
        return isPiSong;
    }

}
