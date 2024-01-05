
public class spiral_metrix {
    public static void print_spiral(int[][] metrix){
        int start_row=0;
        int start_col=0;
        int end_row=metrix.length-1;
        int end_col=metrix[0].length-1;
        while (start_row<=end_row && start_col<=end_col) {
        //top
        for(int j=start_col;j<=end_col;j++){
            System.out.print(metrix[start_row][j]+" ");
        }
        //right
        for(int i=start_row+1;i<=end_row;i++){
            System.out.print(metrix[i][end_col]+" ");
        }
        //bottom
        for(int j=end_col-1;j>=start_col;j--){
            if(start_row==end_row){
                break;
            }
            System.out.print(metrix[end_row][j]+" ");
        }
        //left
        for(int i=end_row-1;i>=start_row+1;i--){
            if(start_col==end_col){
                break;
            }
            System.out.print(metrix[i][start_col]+" ");
        }
        start_col++;
        start_row++;
        end_col--;
        end_row--;
        }
        System.out.println();
    
    }
    public static void main(String args[]){
        int metrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        int m=metrix.length;
                        int  n=metrix[0].length;
                        for(int i=0;i<n;i++){
                            for(int j=0;j<m;j++){
                               System.out.print(metrix[i][j]+" ");
                            }
                            System.out.println();
                        }
        print_spiral(metrix);
    }    
}
