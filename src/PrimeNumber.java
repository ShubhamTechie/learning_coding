import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();

       boolean isPrime =  isPrime(number);
        if (isPrime){
            System.out.println("your  number is prime");
        }else {
            System.out.println("your number is not a p;rime number");
        }
    }



    public static boolean isPrime(int number){

        int i=2;
        while (i < number){
            if (number % i == 0){
                return false;

            }
            i++;

        }
return true;
    }
}
