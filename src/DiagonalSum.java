public class DiagonalSum {


    public static void main(String[] args) {

        System.out.println("welcome to diagonal sum");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonal(numArr);
        System.out.println("sum  " + sum);
        
    }


    public static long sumOfDiagonal(int[][] numArr) {
        long leftSum = sumOfLeftDiagonal(numArr);
        long rightSum = sumOfRightDiagonal(numArr);
        long sum = leftSum + rightSum;
        if (numArr.length % 2 != 0) {

            int ind = numArr.length / 2;
            sum = sum - numArr[ind][ind];

        }
        return sum;
    }

    public static long sumOfLeftDiagonal(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            sum += numArr[i][i];
            i++;
        }
        return sum;

    }


    public static long sumOfRightDiagonal(int[][] numArr) {
           long sum =0;
           int i = 0;
           while (i < numArr.length){
               int col = numArr.length - 1 - i;
               sum+= numArr[i][col];
               i++;
               
           }


        return sum;
    }
}