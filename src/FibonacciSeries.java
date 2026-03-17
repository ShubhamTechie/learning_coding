import java.util.Scanner;

public class FibonacciSeries {


    public static void main(String[] args) {


        System.out.println("enter your number");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();


        printFibo(num);

    }

    public static void printFibo(int num) {

        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;

        while (first + second <= num) {

            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }


}
