import java.util.*;
public class table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int i;
        int number=sc.nextInt();
        for( i=1;i<=10;i++){
            number=number*i;
        }
        System.out.print(number+"*"+ i +"="+ number);
    }
}
