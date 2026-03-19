import java.util.Arrays;
import java.util.Scanner;

public class ArrayList {

    public static void main(String[] args) {


        System.out.println("welcome to array input sum and average of numbers");

        int[] numArr = ArrayUtility.inputArray();
        long sum =sum(numArr);
        double avg = average(numArr);
        System.out.println("sum of num is  "  + sum);
        System.out.println("avg of num is  "  + avg);
    }

    public static long sum(int[] numArr){
        long sum =0;
        int i =0;
        while (i < numArr.length){
            sum = sum + numArr[i];
            i++;
        }
        return sum;
    }
     public static double average(int[] numArr){

        double sum =sum(numArr);

    return sum/numArr.length;
    }



}
