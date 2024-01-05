
public class digonal_sum {

    public static int diag_sum(int metrix[][]){
        int sum=0;
         for(int i=0;i<metrix.length;i++){
            for(int j=0;j<metrix[0].length;j++){
                if(i==j){
                    sum+=metrix[i][j];
                }
                else if(i+j==metrix.length-1){
                    sum+=metrix[i][j];
                }
            }
         }
         return sum;
    }
    public static void main(String args[]){
        int metrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println("The sum of diagonal is"+diag_sum(metrix));
    }    
}
