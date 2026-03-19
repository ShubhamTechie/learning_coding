import java.util.Scanner;

public class ArrayUtility {


    public static int[] inputArray() {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int size = input.nextInt();
        int[] myArr = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("please enter your number " + (i + 1) + ":");
            myArr[i] = input.nextInt();
            i++;
        }


        return myArr;

    }


    public static void displayArray(int[] numArr) {
        int i = 0;
        while (i < numArr.length) {
            System.out.println(numArr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
