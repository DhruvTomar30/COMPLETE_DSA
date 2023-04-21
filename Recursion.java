public class Recursion {
    // 01. print Numbers from n to 1 (Decreasing order)...
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
            System.out.print(n+" ");
            printDec(n-1);
        }

    // 02. print Numbers from n to 1 (increasing order)....
    public static void printInc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n +" ");
    }

    // 03. Print factorial of a number n.....
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n * fact(n-1);
        return fn;
    }

    // 04. Print sum of first n natural numbers....
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int Snm1=calSum(n-1);
        int Sn=n + Snm1;
        return Sn;
    }

    // 05. print Nth Fabonacci Number......
    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1=Fib(n-1);
        int f2=Fib(n-2);
        int fn=f1+f2;
        return fn;
    }

    // 06. Check if a given array is sorted or not....
    public static Boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    // 07.  WAF to find the first occurence of an element in an Array....
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    // 08. WAF to find the last occurence of an element in an Array....
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    // 09. Print X^n ....
    public static int Power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=Power(x, n-1);
        int xn=x*xnm1;
        return xn;

        // return x * Power(x, n-1);       //more easy...
    }

    // 10... print x^n in O(logn).....     more optimized...
    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        // int halfPowerSq=optimizedPower(x, n/2)*optimizedPower(x, n/2);  
        int halfPower=optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd.
        if(n%2!=0){
            halfPowerSq=x*halfPowerSq;
        }
        return halfPowerSq;
    }

    // 11... Tiling Problem Important ******* 
    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        // vertical choice
        int fnm1=tilingProblem(n-1);

        // horizontal choice
        int fnm2=tilingProblem(n-2);

        int totWays= fnm1+fnm2;
        return totWays;

    }

    // 12.. Remove Duplicates in A String....
    public static void removeDuplicates(String str,int idx,StringBuilder newstr, boolean map[]){
        if(idx==str.length()){
            System.out.print(newstr);
            return;
        }
        //kaam 
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeDuplicates(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currchar), map);
        }
    }

    // 13. Friends Pairing Problem ..... 
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        // return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
        // choice
        //single
        int fnm1=friendsPairing(n-1);
        //pair
        int fnm2=friendsPairing(n-2);
        int PairWays=(n-1)*fnm2;
        // totalways
        int totalways=fnm1+PairWays;
        return totalways;
    }

    // 14.  Binary Search Problem ....
    // print all binary strings of size N without consecutive ones...

    public static void printBinSearch(int n,int lastplace,String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // kaam
        printBinSearch(n-1,0, str+"0");
        if(lastplace==0){
            printBinSearch(n-1,1, str+"1");
        }
    }

    public static void main(String args[]){
       // question 1..
        // int n=10;
        // printDec(n);

        // question 2..
        // int n=10;
        // printInc(n);

        // question 3....
        // int n=5;
        // System.out.print(fact(n));

        // Question 4.... 
        // int n=5;
        // System.out.print(calSum(n));

        // question 5.... 
        // int n=5;
        // System.out.print(Fib(n));

        // question 6.... 
        // int arr[]={1,2,3,4,5};
        // System.out.print(isSorted(arr, 0));

        // question 7...
        // int arr[]={8,3,6,9,5,10,2,5,3};
        // System.out.print(firstOccurence(arr, 5, 0));

        // question 8....
        // int arr[]={8,3,6,9,5,10,2,5,3};
        // System.out.print(lastOccurence(arr, 5, 0));

        // question 9 and 10...
        int x=2;
        int n=5;
        // System.out.println(Power(x, n));
        // System.out.println(optimizedPower(x, n));

        // question 11 Tiling problem...
        // System.out.println(tilingProblem(2));


        // Qyestion 12.....
        // String str="appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(" "), new boolean[26]);

        // question 13...
        // System.out.println(friendsPairing(3));


        // Question 14....
        printBinSearch(3, 0,"");

    }
}
