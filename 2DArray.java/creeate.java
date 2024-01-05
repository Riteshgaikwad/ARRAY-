import java.util.Scanner;
public class creeate {

    public static boolean search_array(int[][] metrix ,int key){
        for(int i=0;i<metrix.length;i++){
            for(int j=0;j<metrix[0].length;j++){
                if(metrix[i][j]==key){
                    System.out.println("Found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println(("Key not found !"));
        return false;
    }
    public static int largest(int[][] metrix){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<metrix.length;i++){
            for(int j=0;j<metrix[0].length;j++){
                if(metrix[i][j]>largest){
                    largest=metrix[i][j];
                }
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int metrix[][]=new int [3][3];
        Scanner sc=new Scanner(System.in);
        int n=metrix.length;
        int m=metrix[0].length;
        
        // input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                metrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(metrix[i][j]+" ");
            }
            System.out.println();
        }

        search_array(metrix, 9);
       System.out.println( largest(metrix));
    }
}
