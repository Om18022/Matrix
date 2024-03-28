package Matrix;

public class PrintHighestSumOfColumn {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,2,5},{5,7,9}};
        int row = arr.length;
        int col = arr[1].length;

        int max = Integer.MIN_VALUE;

        for(int r = 0; r<col; r++){
            int sum = 0;
            for(int c = 0; c<row; c++){
                sum += arr[c][r];
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println("Highest Sum of col is : " + max);
    }
}
