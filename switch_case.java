import java.util.*;
public class switch_case {
    public static void main(String args[]){
        // int number=2;
        // switch(number){
        //  case 1: System.out.println("samosa");
        //  break;
        //  case 2: System.out.println("burger");
        //  break;
        //  case 3: System.out.println("mango shake");
        //  break;
        //  default: System.out.println("we are dreaming");
        // }
            Scanner sc=new Scanner(System.in);
            System.out.println("enter week number(1-7): ");
            int week=sc.nextInt();

            switch(week){
                case 1: System.out.println("Monday");
                break;
                case 2: System.out.println("Tuesday");
                break;
                case 3: System.out.println("Wednesday");
                break;
                case 4: System.out.println("Thursday");
                break;
                case 5: System.out.println("Friday");
                break;
                case 6: System.out.println("Saturday");
                break;
                case 7: System.out.println("sunday");
                break;
                default : System.out.println("Not a week day");
        
            }
    }

}
