public class PalindromeArray {


    public static void main(String[] args) {
        System.out.println("welcome to palinsrom,e checker");

        int[] numArr = ArrayUtility.inputArray();


        boolean isPal = isPalindrome(numArr);

        if (isPal) {
            System.out.println("your no. is palindroem");
        } else {

            System.out.println("your no. is not palindroem");
        }

    }

    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        while (i < numArr.length / 2) {
            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                return false;
            }
            i++;
        }

        return true;
    }

}
