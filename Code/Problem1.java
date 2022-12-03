package AoC;

import java.util.*;
public class Problem1 {
    /*The following code solves both problems of day 1, for the first part execute printAns method once instead of 3 times */
    public static void main(String [] args){
        int [] elfos = new int[10000];
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int suma = 0;
        int i = 1;
        String linea = "";
        while(sc.hasNextLine()){
            linea = sc.nextLine();
            if (linea.equals("")){
                elfos[i] = suma;
                suma = 0;
                i++;
                System.out.println("Guardado elfo num " + i);
            } else if (linea.equals("a")){
                printAns(elfos);
                printAns(elfos);
                printAns(elfos);
            } else {
            suma += Integer.valueOf(linea);
            }
        }
        sc.close();
    }
    public static void printAns(int [] elfos){
        int mayor = 0;
        int numElfo = 0;
        for (int j = 0; j < elfos.length; j++){
            if (elfos[j] > mayor){
                mayor = elfos[j];
                numElfo = j;
            }
        }
        System.out.println(numElfo);
        System.out.println(mayor);
        elfos[numElfo] = 0;
        numElfo = 0;
        mayor = 0;
    }
}

