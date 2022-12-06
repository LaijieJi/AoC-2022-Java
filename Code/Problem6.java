import java.util.*;
public class Problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        char [] inputStream = new char[4095];//Amount of characters of the input
        char firstChar, secondChar, thirdChar, fourthChar;
        String line;
        line = sc.nextLine();
        for (int i = 0; i < line.length(); i++){
            inputStream[i] = line.charAt(i);
        }
        for (int i = 0; i < line.length() - 3; i++){
            firstChar = inputStream[i];
            secondChar = inputStream[i + 1];
            thirdChar = inputStream[i + 2];
            fourthChar = inputStream[i + 3];
            if (checkIfRepeated(firstChar, secondChar, thirdChar, fourthChar, i)){
                System.out.println("Unrepeated character pattern for i = " + i + 4);
                break;
            }
        }
        System.out.println("Checking for last four characters");
        if (checkIfRepeated(inputStream[inputStream.length - 4], inputStream[inputStream.length - 3], inputStream[inputStream.length- 2], 
        inputStream[inputStream.length - 1], inputStream.length - 1)){
            System.out.println("Unrepeated character pattern for character num " + (inputStream.length - 1));
        }
        sc.close();
    }

    public static boolean checkIfRepeated(char first, char second, char third, char fourth, int i){
        if (first != second && second != third && third != fourth && first != third && first != fourth && second != fourth){
            return true;
        }
        return false;
    }
}