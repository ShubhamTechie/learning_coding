import java.util.Scanner;

public class Lcm {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1ST Number = ");
        int firstNumber = input.nextInt();

        System.out.print("Enter 2ND Number = ");
        int secondNumber = input.nextInt();

        int l = lcmOfNumbers(15,20);
        System.out.println("lcm of this two number is =  " + l);
    }




    public  static int lcmOfNumbers(int first , int second){

        int i =1;
        while (i < second){
        int factor = first * i;
        if (factor % second ==0){
            return factor;
        }

            i++;
        }

        return 0;
    }
}
