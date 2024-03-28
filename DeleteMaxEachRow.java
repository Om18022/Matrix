package Matrix;

public class DeleteMaxEachRow {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,2,5},{5,7,9}};
        int row = arr.length;
        int col = arr[1].length;

        for(int r=0; r<row; r++){
            int max = 0;
            for(int c=0; c<col; c++) {
                if (arr[r][max] < arr[r][c]) {
                    max = c;
                }
            }
            for (int i = max; i < col - 1; i++) {
                arr[r][i] = arr[r][i + 1];
            }
        }
        col--;
        for(int r=0; r<row; r++){
            for(int c=0;c<col;c++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}
