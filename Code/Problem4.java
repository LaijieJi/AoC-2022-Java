import java.util.*;
public class Problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String line;
        String[] pairs = new String[2];
        String[] firstRange = new String[2];
        String[] secondRange = new String[2];
        int count = 0;
        int overlappedCount = 0;
        while (sc.hasNextLine()){
            line = sc.nextLine();
            if (line.equals("stop")){
                break;
            } else {
                pairs = line.split(",");
                System.out.println(pairs[0] + "," + pairs[1]);
                firstRange = pairs[0].toString().split("-");
                System.out.println("First pair is: " + firstRange[0] + "-" + firstRange[1]);
                secondRange = pairs[1].toString().split("-");
                System.out.println("Second pair is: " + secondRange[0] + "-" + secondRange[1]);
                if (checkContained(firstRange, secondRange)){
                    count++;
                }
                if (checkOverlap(firstRange, secondRange)){
                    overlappedCount++;
                }
            }
        }
        sc.close();
        System.out.printf("There are %d contained pairs \n", count);
        System.out.printf("There are %d overlapped pairs \n", overlappedCount);
    }

    public static boolean checkContained(String[] firstRange, String[] secondRange){
        int firstNum, secondNum, thirdNum, fourthNum;
        firstNum = Integer.valueOf(firstRange[0]);
        secondNum = Integer.valueOf(firstRange[1]);
        thirdNum = Integer.valueOf(secondRange[0]);
        fourthNum = Integer.valueOf(secondRange[1]);
        if (firstNum <= thirdNum && secondNum >= fourthNum){
            return true;
        } else if (firstNum >= thirdNum && secondNum <= fourthNum){
            return true;
        }
        return false;
    }

    public static boolean checkOverlap(String[] firstRange, String [] secondRange){
        int firstNum, secondNum, thirdNum, fourthNum;
        firstNum = Integer.valueOf(firstRange[0]);
        secondNum = Integer.valueOf(firstRange[1]);
        thirdNum = Integer.valueOf(secondRange[0]);
        fourthNum = Integer.valueOf(secondRange[1]);
        for (int i = firstNum; i <= secondNum; i++){
            for (int j = thirdNum; j <= fourthNum; j++){
                if (i == j){
                    return true;
                }
            }
        }
        return false;
    }
}
