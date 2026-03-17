import java.util.Scanner;

public class RevweseTheDigit {


    public static void main(String[] args) {
        System.out.println("enter your number");

        Scanner input = new Scanner(System.in);

        int digit = input.nextInt();


        int rev = revDigit(digit);

        System.out.println("reverse of number is = " + rev);


    }





    public  static int revDigit(int digit){
        int newDigit = 0;
        while (digit > 0 ){

            int num = digit % 10;
            newDigit = newDigit * 10 + num ;
            digit = digit / 10;

        }


        return newDigit;
    }
}

