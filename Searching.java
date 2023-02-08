public class Searching {
// 03. Linear Searching... 
// public static int LinearSearch(int numbers[],int keys){
//     for(int i=0;i<numbers.length;i++){
//         if(numbers[i]==keys){
//             return i;
//         }
//     }
//     return -1;
// }



// 02... Binary Searching..... 

//     public static int Binary_search(int numbers[],int key){
//         int start=0, end=numbers.length-1;

//         while(start<=end){
//         int mid=(start+end)/2;
        
//         //comparisons..
//         if(numbers[mid]==key){ //found
//             return mid;
//         }
//         if(numbers[mid]<key){ //right
//             start = mid+1;
//         }
//         else{
//             end = mid-1;  //left
//         }
//     } 
//     return -1;
// }


//Reverse of an Array....
// public static void Reverse(int numbers[]){
//     int first=0,last=numbers.length-1;
//     while(first<last){
//         int temp= numbers[last]; //swapping
//         numbers[last]=numbers[first];
//         numbers[first]=temp;

//         first++;
//         last--;
//     }

// }


// 05... print pairs in a array...
// public static void printpairs(int numbers[]){
//     int tp=0;
//     for(int i=0;i<numbers.length;i++){
//         int curr=numbers[i]; //2,4,6,8,10
//         for(int j=i+1;j<numbers.length;j++){
//             System.out.print("("+curr+","+numbers[j]+")");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("total pairs:" + tp);
// }
    

// 06... Print SubArrays....
// public static void print_Subarrays(int numbers[]){
//     int ts=0;
//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             for(int k=start;k<=end;k++){
//                 System.out.print(numbers[k] + " ");
//             }
//             ts++;
//             System.out.println();
//         }
//         System.out.println();   
//     }
//     System.out.print("total Subarrays: " +  ts );
// }

// 07.. Find Sum of arrays and print maximum sum ......(Brute Force)   T.C.=O(n^3)
// public static void print_sum_of_Subarrays(int numbers[]){
    
//     int curr_sum=0;
//     int maxsum=Integer.MIN_VALUE;

//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             curr_sum=0;
//             for(int k=start;k<=end;k++){
//                 curr_sum+=numbers[k];
//             }
//             System.out.println(curr_sum);
//            if(maxsum<curr_sum){
//              maxsum=curr_sum;
//            }
//     }
    
//     }
//     System.out.println("max sum is:" + maxsum);
// }


// 08. Max sub Arrays, Method 2(Prefix Sum)....   T.C.=O(n^2)
//    public static void maxsubarray(int numbers[]){
//     int currsum=0;
//     int maxsum=Integer.MIN_VALUE;
//     int prefix[]=new int[numbers.length];

//     prefix[0]=numbers[0];
//     // calculate prefix array
//     for(int i=1;i<prefix.length;i++){
//     prefix[i]=prefix[i-1]+numbers[i];
//     }
//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             currsum= start==0? prefix[end]: prefix[end]-prefix[start-1];
//             if(maxsum<currsum){
//                 maxsum=currsum;
//             }
//         }
//     }
//     System.out.println("max sum =" + maxsum);

//    }


// 09... max subarray sum.. Method 3(Kadane's Algorithm).... T.C.= O(n)   best hai ye.
public static void kadane(int numbers[]){
    int MS=Integer.MIN_VALUE;
    int CS=0;
    for(int i=0; i<numbers.length;i++){
        CS=CS+numbers[i];
        if(CS<0){
            CS=0;
        }
        MS=Math.max(CS, MS);
    }
    System.out.println("max sum =" + MS);

}

public static void main(String args[]){
    
// Calling of linear search...... 
    // int numbers[]={2,4,6,8,10,12,14,16};
    // int keys=10;

    // int index=LinearSearch(numbers, keys);
    // if(index==-1){
    //     System.out.println("not found");
    // }
    // else{
    //     System.out.println("key is at index" + index);
    // }
        
// Calling of Binary Search.... 
    // int numbers[]={2,4,6,8,10,12,14};
    // int key=2;
    // System.out.println("number is: "+ Binary_search(numbers,key));


// calling of reverse array.....
// int numbers[]={2,4,6,8,10};
// Reverse(numbers);
// for(int i=0;i<numbers.length;i++){
//     System.out.print(numbers[i] +" ");
// }
// System.out.println();
    

// Calling of pairs... ...
// int numbers[]={2,4,6,8,10};
// printpairs(numbers);

// calling of Subaarays.....
// int numbers[]={2,4,6,8,10};
// print_Subarrays(numbers);

// calling of sum of subarrays....(Method 1)
// int numbers[]={2,4,6,8,10};
// print_sum_of_Subarrays(numbers);

// calling of sum of arrays .... (method 2)
// int numbers[]={1,-2,6,-1,3};
// maxsubarray(numbers);


// calling of kadanes algorithm...
int numbers[]={-2,-3,4,-1,-2,1,5,-3};
kadane(numbers);

}
}