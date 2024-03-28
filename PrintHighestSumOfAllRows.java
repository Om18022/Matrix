package Matrix;

public class PrintHighestSumOfAllRows {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,2,5},{5,7,9}};
        int row = arr.length;
        int col = arr[1].length;

        int max = Integer.MIN_VALUE;

        for(int r = 0; r<row; r++){
            int sum = 0;
            for(int c = 0; c<col; c++){
                sum += arr[r][c];
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println("Highest Sum of row is : " + max);
    }
}
