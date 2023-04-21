// 01... find all the occurences of an element in the arrray...
public class pdf_09_Recursion {
    public static void FindOccureneces(int arr[], int key,int i){
        // base case
        if(i==arr.length){
            return;
        }
        //kaam 
        if(arr[i]==key){
            System.out.print(i);
        }
        // recursion
        FindOccureneces(arr, key, i+1);
    }

// 02.  convert the given number into a String in english......
    static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printdigits(int n){
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        printdigits(n/10);
        System.out.print(digit[lastdigit]+" ");
    }

    // 03. find length of a String....
    public static void stringLength(String str, int i,int count){
        // base case
        if(i==str.length()){
            System.out.print(count);
            return;
        }
        // kaam
        stringLength(str, i+1, count+1);
    }

// 04. find the count of all contiguous substrings starting and ending with the same character..
public static int countSubstrs(String str,int i,int j,int n) {
    if(n==1){
     return 1;
    }if(n<=0){
        return 0;
    } 
    int res=countSubstrs(str,i+1,j,n-1)+
            countSubstrs(str,i,j-1,n-1)-
            countSubstrs(str,i+1,j-1,n-2);

    if(str.charAt(i) ==str.charAt(j)){
        res++;
    }
    return res;
}


// 05.  <----------------- TOWER OF HANOI ------------------------->
    public static void towerofHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest );
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'.
        towerofHanoi(n-1, src, dest, helper);

        // transfer nth from src to dest
        System.out.println("transfer disk " + n+ " from " + src+ " to "+ helper );

        // transfer n-1 from helper to dest using src as 'helper'.
        towerofHanoi(n-1,helper,src,dest);
    }


static int count=0;
public static void main(String args[]){
        // int arr[]={3,2,4,5,6,2,7,2,2};
        // FindOccureneces(arr, 2, 0);

        // 02. second code
        // printdigits(2019);

        // 03. length of a string...
        // stringLength("shashwat", 0, 0);

        // 04.. question 
        // String str="abcab";
        // int n=str.length();
        // System.out.print(countSubstrs(str,0,n-1,n));

        // 05. .. Tower of Hanoi ..
        int n=4;
        towerofHanoi(n, "A", "B", "C");

    }
}
