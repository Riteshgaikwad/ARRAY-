public class reverse_array {
    public static void reverse(int num[]){
        int first=0;
        int last=num.length-1;
        while(first<=last){
            int temp=num[first];
            num[first]=num[last];
            num[last]=temp;
            first++;
            last--;
        }
    }
    public static void print_array(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        reverse(num);
        print_array(num);
    }
    
}
