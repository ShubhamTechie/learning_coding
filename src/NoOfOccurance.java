import java.util.Scanner;

public class NoOfOccurance {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to find no of occurences");

       int[] numArr = ArrayUtility.inputArray();

        System.out.println("enter the number you want to know occurence");
        int num = input.nextInt();

        int occurences = occurences(numArr , num);

        System.out.println("occurence of " + num + " in array is : " + occurences);

    }

    public static int occurences(int[] numArr  , int num){

        int occ =0;
        int i=0;
        while (i < numArr.length){
            if (numArr[i] == num){
                occ++;
            }
            i++;
        }

        return occ;
    }
}
