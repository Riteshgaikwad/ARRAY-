

public class search_in_sorted {

    public static boolean search(int metrix[][],int key){
        int row=0;
        int col=metrix[0].length-1;
        while(row<metrix.length && col>=0){
            if(metrix[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key<metrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found !");
        return false;
    }

 public static void main(String args[]){
    int metrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
    
    search(metrix,15);
 }    
}
