package Matrix;

public class FindFromSortedMatrix_BinerySearch_log_r_log_c {
    public static void main(String[] args) {
        int mat[][] = {
                {1,5,7,9},
                {11,13,18,22},
                {25,29,30,34},
                {38,40,45,50}
        };
        int value = 35;
        int row = mat.length;;
        int col = mat[0].length;
        int top = 0;
        int bottom = col-1;
        int rowtobesearched = -1;

        while(top <= bottom){
            int mid = (top+bottom) / 2;
            if(value >= mat[mid][0] && value < mat[mid][col-1]){
                rowtobesearched = mid;
                break;
            }else if(value < mat[mid][0]){
                bottom = mid-1;
            }else{
                top = mid+1;
            }
        }
        if(rowtobesearched == -1){
            System.out.println("Not Present");
            return;
        }

        int left = 0;
        int right = col-1;
        while(left <= right){
            int mid = (left+right) / 2;
            if(value == mat[rowtobesearched][mid]){
                System.out.println("is present");
                return;
            }else if(value < mat[rowtobesearched][mid]){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println("Is not present");
    }
}
