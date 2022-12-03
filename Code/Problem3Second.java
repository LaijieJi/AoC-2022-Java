package AoC;
import java.util.*;
public class Problem3Second{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String line1;
        String line2;
        String line3;
        char[] firstLine = new char[100];
        char[] secondLine = new char[100];
        char[] thirdLine = new char[100];
        int res = 0;
        char blank = 255;
        while (sc.hasNextLine()){
            line1 = sc.nextLine();
            if (line1.equals("stop")){
                break;
            } else {
                line2 = sc.nextLine();
                line3 = sc.nextLine();
                storeChars(line1, line2, line3, firstLine, secondLine, thirdLine);
                res += obtainSum(obtainRep(firstLine, secondLine, thirdLine));
                for(int i = 0; i < firstLine.length; i++){
                    firstLine[i] = blank;
                }
                for (int i = 0;i < secondLine.length; i++){
                    secondLine[i] = blank;
                }
                for(int i = 0; i < thirdLine.length; i++){
                    thirdLine[i] = blank;
                }
            }
        }
        System.out.println(res);
        sc.close();
    }

    public static String obtainRep(char[] firstLine, char[] secondLine, char[] thirdLine){
        for(int i = 0; i < firstLine.length;i++){
            for(int j = 0; j < secondLine.length; j++){
                for( int k = 0; k < thirdLine.length; k++){
                    if (firstLine[i] == secondLine [j] && secondLine[j] == thirdLine[k]){
                        return String.valueOf(firstLine[i]);
                    }
                }
            }
        }
        return "";
    }

    public static void storeChars(String line1, String line2, String line3, char[] firstLine, char[] secondLine, char[] thirdLine){
        for (int i = 0;i < line1.length(); i++){
            firstLine[i] = line1.charAt(i);
        }
        for (int i = 0;i < line2.length(); i++){
            secondLine[i] = line2.charAt(i);
        }
        for (int i = 0;i < line3.length(); i++){
            thirdLine[i] = line3.charAt(i);
        }
    }

    public static int obtainSum(String letter){
        switch (letter){
            case "a":
                return 1;
            case "b":
                return 2;
            case "c":
                return 3;
            case "d":
                return 4;
            case "e":
                return 5;
            case "f":
                return 6;
            case "g":
                return 7;
            case "h":
                return 8;
            case "i":
                return 9;
            case "j":
                return 10;
            case "k":
                return 11;
            case "l":
                return 12;
            case "m":
                return 13;
            case "n":
                return 14;
            case "o":
                return 15;
            case "p":
                return 16;
            case "q":
                return 17;
            case "r":
                return 18;
            case "s":
                return 19;
            case "t":
                return 20;
            case "u":
                return 21;
            case "v":
                return 22;
            case "w":
                return 23;
            case "x":
                return 24;
            case "y":
                return 25;
            case "z":
                return 26;
            case "A":
                return 27;
            case "B":
                return 28;
            case "C":
                return 29;
            case "D":
                return 30;
            case "E":
                return 31;
            case "F":
                return 32;
            case "G":
                return 33;
            case "H":
                return 34;
            case "I":
                return 35;
            case "J":
                return 36;
            case "K":
                return 37;
            case "L":
                return 38;
            case "M":
                return 39;
            case "N":
                return 40;
            case "O":
                return 41;
            case "P":
                return 42;
            case "Q":
                return 43;
            case "R":
                return 44;
            case "S":
                return 45;
            case "T":
                return 46;
            case "U":
                return 47;
            case "V":
                return 48;
            case "W":
                return 49;
            case "X":
                return 50;
            case "Y":
                return 51;
            case "Z":
                return 52;
        }
        return 0;
    }
}
