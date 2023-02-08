// Convert Binary TO decimal number....
public class Conversions {
    public static void BinToDec(int BinNum){
        int pow=0;
        int decNum=0;
        int myNum=BinNum;
        while(BinNum>0){
            int lastDigit=BinNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            BinNum=BinNum/10;
        }
            System.out.println("Decimal of "+ myNum+ " = " + decNum);
      
    }
    //    public static void main(String args[]){
        //     BinToDec(1001);
        // }

// Convert Decimal to binary number.....
public static void decToBin(int n){
    int pow=0;
    int binNum=0;
    int myNew=n;
    while(n>0){
        int rem=n%2;    // remainder find
        binNum=binNum + (rem * (int)Math.pow(10,pow));
        pow++;
        n=n/2;

    }

System.out.println("Binary form of "+ myNew + " = " + binNum);

}
public static void main(String args[]){
    decToBin(34);
}
}