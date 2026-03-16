import java.util.Scanner;

public class PrintToNumber {


    public static void main(String[] args) {
        System.out.print("Enter Number = ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
//        System.out.println(printNumber(4,5));

       printTable(number);

    }

//    public static int printNumber(int a , int b){
//        int sum = a + b;
//        return sum;
//    }



    public static void printTable(int num){



        System.out.println("your table of " + num);
        int i=1;
        while ( i <= 10){
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

    }
}
