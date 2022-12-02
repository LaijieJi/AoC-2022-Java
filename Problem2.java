package AoC;
import java.util.*;

public class Problem2 {
/*The following code solves the second part of the problem of the day 2, the first part can be solved
 * using the same code, but changing the values of the method checkMove to the correct ones
*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String[] jugadas = new String[2]; 
        String linea = "";
        String first = "";
        String second = "";
        int res = 0;
        while(sc.hasNextLine()){
            linea = sc.nextLine();
            if (linea.equals("count")){
                break;
            }
            jugadas = linea.split(" ");
            first = jugadas[0];
            second = jugadas[1];
            res += checkMove(first, second);
        }
        System.out.println(res);
        sc.close();
    }

    public static int checkMove(String first, String second){
        int sum = 0;
        if(first.equals("A")){
            switch (second){
                case "X":
                    sum += 3;
                    break;
                case "Y":
                    sum += 4;
                    break;
                case "Z":
                    sum += 8;
            }
        } else if (first.equals("B")){
            switch (second){
                case "X":
                    sum += 1;
                    break;
                case "Y":
                    sum += 5;
                    break;
                case "Z":
                    sum += 9;
            }
        } else {
            switch (second){
                case "X":
                    sum += 2;
                    break;
                case "Y":
                    sum += 6;
                    break;
                case "Z":
                    sum += 7;
            }
        } 
        return sum;
    }
}
