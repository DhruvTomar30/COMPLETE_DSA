public class Reverse_of_number {
    public static void main(String args[]){
        int n=10899;
        // while(n>0){
        //     int lastdigit=n%10;
        //     // System.out.print(lastdigit);
        //     n=n/10;
        //     System.out.print(lastdigit);
        // }

        // Reverse of a number...
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
            System.out.println();
        }
    }
}
