public class SumAndAvg2DArray {


    public static void main(String[] args) {

        System.out.println("welcome to some and average of 2d aaray");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double avg = avg(numArr);

        System.out.println("sum of 2d arr  is  " + sum);
        System.out.println("average of 2d arr  is  " + avg);

    }

    public static long sum(int[][] numArr) {

        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                sum = sum + numArr[i][j];
                j++;
            }
            i++;
        }

        return sum;
    }

    public static double avg(int[][] numArr) {

        if (numArr.length == 0) {
            return 0;

        }


        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols;
        return sum(numArr) / (rows * cols);

    }
}