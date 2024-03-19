public class findprofit {
    public static int payandsellstocks(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprice=0;
        for(int i=0;i<price.length;i++){
            if(buyprice<price[i]){
                int profit=price[i]-buyprice;
                maxprice=Math.max(maxprice, profit);
            }
            else{
                buyprice=price[i];
                System.out.println(buyprice);
            }
        }
        return maxprice;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(payandsellstocks(price));
    }
}
