package Matrix;

public class SearchRowWiseColumnWiseSorted {
    public static void main(String[] args){
        int[][] mat = {
                {1,5,9},
                {2,7,10},
                {4,12,18}
        };
        int row = mat.length;
        int col = mat[0].length;
        int r=0, c=col-1;
        int value = 6;

        while(r<row && c>=0){
            if(value==mat[r][c]){
                System.out.println("present.");
                return;
            }else if(value<mat[r][c]){
                c--;
            }else{
                r++;
            }
        }
        System.out.println("not present.");
    }
}
