package Matrix;

public class DeleteMaxEachColumn {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,9},
                {4,7,6},
                {5,3,1}
        };
        int row = arr.length;
        int col = arr[1].length;

        for(int r=0; r<col; r++){
            int max = 0;
            for(int c=1; c<row; c++) {
                if (arr[max][r] < arr[c][r]) {
                    max = c;
                }
            }
            for (int i = max; i < row - 1; i++) {
                arr[i][r] = arr[i+1][r];
            }
        }
        row--;
        for(int r=0; r<row; r++){
            for(int c=0;c<col;c++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}
