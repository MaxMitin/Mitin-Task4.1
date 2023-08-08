import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        try
        {
            Scanner input = new Scanner(new File("numbers.txt"));
        int n = input.nextInt();
            double[] num = new double[n];
            for (int i = 0; i < num.length; i++) {num[i] = input.nextDouble(); System.out.println(num[i]);}

            Arrays.sort(num);
            double median;
            if (num.length % 2 == 0)
                median = ((double)num[num.length/2] + (double)num[num.length/2 - 1])/2;
            else
                median = (double) num[num.length/2];

            System.out.println(" ");
            System.out.println("Медианное значение вышеперечисленных чисел: " + median);
        }

        catch (InputMismatchException e) {System.out.println("Ой!");}
        catch (FileNotFoundException e) {System.out.println("Ой-ой-ой!");}

        }


    }




























