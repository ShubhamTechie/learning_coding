import java.util.Scanner;

public class OddEvenCl {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the odd even cal :  ");


        System.out.print("Enter a number : =  ");
        int num = sc.nextInt();

        if (num % 2 ==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }


    }
}
