package Matrix;

public class FindValue {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int row = mat.length;
        int col = mat[0].length;
        int v = 10;

        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                if(mat[r][c] == v){
                    System.out.println("Value is present.");
                    return ;
                }
            }
        }
        System.out.println("Value Is Not present.");
    }
}
