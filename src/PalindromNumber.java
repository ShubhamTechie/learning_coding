import java.util.Scanner;

public class PalindromNumber {


    public static void main(String[] args) {


        System.out.println("enter your number to check");


        Scanner input = new Scanner(System.in);


        int number = input.nextInt();


        boolean isPalindrom = isPalindrom(number);
        if (isPalindrom) {
            System.out.println("number is palindrome nu,mvber");
        } else {
            System.out.println("number not a palindrome nu,mvber");
        }
    }


//method for checking palindrome number

    public static boolean isPalindrom(int number) {
        return number == revDigit(number);
    }

//   code for reverse a number
    public static int revDigit(int digit) {
        int newDigit = 0;
        while (digit > 0) {

            int num = digit % 10;
            newDigit = newDigit * 10 + num;
            digit = digit / 10;

        }
        return newDigit;
    }


}