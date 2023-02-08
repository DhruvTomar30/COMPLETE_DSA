public class DSA_02_Buysell {
    public static int buysell_stocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice; //todays profit
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];   // update
            }
        }
        return maxprofit;
    }

public static void main(String args[]){
    int prices[]={7,1,5,3,6,4};
    System.out.println(buysell_stocks(prices));

} 
}
