package Matrix;

public class PrintDiagonalTopRighttoBottomLeft {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,2,5},{5,7,9}};
        int row = arr.length;
        int col = arr[1].length;

        for(int r=0; r<row; r++){
            System.out.print(arr[r][row-r-1] + " ");
        }
    }
}
