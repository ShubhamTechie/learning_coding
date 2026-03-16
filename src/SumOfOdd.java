import java.util.Scanner;

public class SumOfOdd {


    public static void main(String[] args) {
        System.out.print("Enter Number = ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
//        int sum = sumAllOdd(number);
//        System.out.println("odd num till  " + number + "is " + sum);
//
//        long fac = factorial(number);
//        System.out.println("the factorial of  " + number  + " is " + fac);
        int sum = sumOfDigit(number);

        System.out.println(sum);
    }


//    public static int sumAllOdd(int number) {
//
//
//        int i = 1;
//        int sum = 0;
//        while (i <= number) {
//            sum += i;
//            i+=2;
//
//        }
//        return sum;
//    }
//
//
//
//
//
//
//
//    public static long factorial(int num){
//
//        int i=2;
//        long fac=1;
//        while (i<=num){
//
//            fac= fac *i;
//            i++;
//        }
//
//        return fac;
//    }


    public static int sumOfDigit(int number) {
        int sum = 0;

        while ( number>0){
        int rem = number % 10;
        sum+=rem;
        number = number/10;


        }
        return sum;
    }
}
