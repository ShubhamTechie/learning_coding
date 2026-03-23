import java.util.Scanner;

public class MergeSoretdArray {


    public static void main(String[] args) {


        System.out.println("welcome to merge two sorted array");

        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergeArr =merge(arr1,arr2);


    }


}
