class Large_number{

    public static int largest_num(int num[]){
         int largest=Integer.MIN_VALUE;
       for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
       }
       return largest;
    }

    public static int Smallest_num(int num[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
      int num[]={2,5,15,88,67,77};
      System.out.println(largest_num(num));
      System.out.println(Smallest_num(num));
    }

}