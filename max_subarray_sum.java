public class max_subarray_sum {
    // Brute force approach (More time complexity) o(n3)
    public static void sub_sum(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                cs=0;
                for(int k=start;k<=end;k++){
                    cs=cs+arr[k];
                }
                System.out.println(cs);
                 if(ms<cs){
                        ms=cs;
                 }
                
            }
        }
        System.out.println("The maximum subarray sum is :"+ms);
    }

    //Prefix sum approach having time complexity o(n2)
    public static void sum_preff(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                cs=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(ms<cs){
                    ms=cs;
                }
            }
        }
        System.out.println("The maximum sum is :"+ms);
    }

    public static void kadanes_algo(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            ms=Math.max(cs, ms);
            if(cs<0){
                cs=0;
            }
        }
        System.out.println("The maximum subarray sum is:"+ms);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        sub_sum(arr);
        sum_preff(arr);
        kadanes_algo(arr);
    }
}
