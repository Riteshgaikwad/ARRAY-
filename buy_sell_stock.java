public class buy_sell_stock {
    public static int price(int price[]){
        int buy_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<price.length;i++){
            if(buy_price<price[i]){
                int profit=price[i]-buy_price;
                 max_profit=Math.max(max_profit, profit);
            }
            else{
                buy_price=price[i];
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int price[]={7,1,5,6,4};
        System.out.println(price(price));

    }
}
