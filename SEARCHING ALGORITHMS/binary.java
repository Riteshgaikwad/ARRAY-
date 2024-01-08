public class binary {
    public static int binary_searching(int num[],int key){
        int start=0;
        int end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if (num[mid]<key) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,14};
       int index= binary_searching(num, 10);
       if(index>=0){
        System.out.println("Key found at index :"+index);
       }
       else{
        System.out.println("Key not found !");
       }
    }
}
