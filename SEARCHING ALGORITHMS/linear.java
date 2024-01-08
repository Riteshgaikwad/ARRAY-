public class linear {
    public static int linearSearching(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int marks[]={2,4,6,8,10,12,14};
        int key=10;
        int index=linearSearching(marks, key);
        if(index>=0){
            System.out.println("Key found at index :"+index);
        }
        else{
            System.out .println("Key not fiund !");
        }
    }
    
}
