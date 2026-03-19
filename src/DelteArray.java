import java.util.Scanner;


public class DelteArray {



    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("welcome to thr no.deletion of array");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("now enter no.you want to delete");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("here is your new array");
        ArrayUtility.displayArray(newArr);


    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = NoOfOccurance.occurences(numArr, numToDelete);

        if (occ == 0){
            return numArr;
        }

        int newSize = numArr.length - occ;
        int[] newArr = new  int[newSize];

        int i=0, j=0;
        while (i < numArr.length){
            if(numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
