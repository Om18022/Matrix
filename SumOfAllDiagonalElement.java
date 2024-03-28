package Matrix;

public class SumOfAllDiagonalElement {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,2,5},{5,7,9}};
        int row = arr.length;
        int col = arr[1].length;
        int sum = 0;
        for(int r=0; r<row; r++){
            sum += arr[r][r];
            if(r==row-r-1){
                continue;
            }
            sum += arr[r][row-r-1];
        }
        System.out.println(sum);
    }
}
