public class trapping_rainwater {
    public static int trapped(int height[]){
        //finding left maximum
        int left_max[]=new int[height.length];
        left_max[0]=height[0];
        for(int i=1;i<height.length;i++){
            left_max[i]=Math.max(height[i], left_max[i-1]);
        }
        //finding right maximum
        int right_max[]=new int[height.length];
        right_max[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right_max[i]=Math.max(height[i], right_max[i+1]);
        }
        //final loop
        int trapped=0;
        for(int i=0;i<height.length;i++){
            int water_level=Math.min(right_max[i], left_max[i]);
            trapped+=water_level-height[i];
        }
        return trapped;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println("Trapped rain water is:"+trapped(height));
    }
}
