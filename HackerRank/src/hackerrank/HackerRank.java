/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chathuranga - Pamba
 */
public class HackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    List<String> list = perms("codes");
        for (String string : list) {
            System.out.println(string);
        }
}

public static List<String> perms(String string) {

    List<String> result = new ArrayList<String>();
    char[] values = string.toCharArray();
    for (int width = 1; width <= values.length; width++) { // for every length
        int stack[] = new int[width];
        for (int i = 0; i < stack.length; i++) { // start from a specific point without duplicates
            stack[i] = stack.length - i - 1;
        }
        int position = 0;
        while (position < width) {

            position = 0;
            StringBuilder sb = new StringBuilder();
            while (position < width) { // build the string
                sb.append(values[stack[position]]);
                position++;
            }
            result.add(sb.toString());
            position = 0;
            while (position < width) {
                if (stack[position] < values.length - 1) {
                    stack[position]++;
                    if (containsDuplicate(stack) == false)
                        break;
                    else
                        position = 0;
                } else {
                    stack[position] = 0;
                    position++;
                }
            }
        }
    }
    return result;
}

private static boolean containsDuplicate(int[] stack) {
    for (int i = 0; i < stack.length; i++) {
        for (int j = 0; j < stack.length; j++) {
            if (stack[i] == stack[j] && i != j) {
                return true;
            }
        }
    }
    return false;
}

}
