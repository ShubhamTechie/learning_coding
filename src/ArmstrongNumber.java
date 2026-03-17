import java.util.Scanner;

public class ArmstrongNumber {


    public static void main(String[] args) {

        System.out.println("enter your number");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        boolean isArmstrong = isArmstrong(num);

        if (isArmstrong) {
            System.out.println("your number is a armstrong number");
        } else {
            System.out.println("not a armstrong number");
        }

    }


    public static boolean isArmstrong(int num) {
        int noOfDigits = noOfDigits(num);

        int noCopy= num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /=10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return finalNumber == noCopy;
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}
