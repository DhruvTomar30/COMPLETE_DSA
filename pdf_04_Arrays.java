import java.util.*;
public class pdf_04_Arrays {
    // public static Boolean containsDuplicates(int nums[]){
    //     for(int i=0;i<nums.length-1;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

// 02. 2nd question ... 
    
//     public static void arraySearch(int nums[],int target){
//         int start=0;
//         int end=7;
//         int pivot=start+end/2;
//         while(start<=end){
//             for(int i=0;i<=nums.length;i++){
//                 nums[i]=nums[k];
//             }
//         }
//         // System.out.print(nums[pivot]);
//     }
    

//     public static void main(String args[]){
//         // int nums[]={1,2,3,5};
//     //     System.out.println(containsDuplicates(nums));


//     // calling of 2....
//     Scanner sc=new Scanner(System.in);
//     int nums[]={0,1,2,4,5,6,7};
//     int target=sc.nextInt();
//     arraySearch(nums,target);
//     }


//03.

public static int maxprofitfun(int price[]){
    int buyprice=Integer.MAX_VALUE;
    // int profit=0;
    int maxprofit=0;
    for(int i=0;i<=price.length;i++){
        if (buyprice<price[i]){
            int profit=price[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        else{
            buyprice=price[i];
        }
    //     System.out.println("max sum is:" + maxprofit);
    }
        return maxprofit;
}

public static void main(String args[]){
    int price[]={7,1,5,4,6,2};
    System.out.print("max profit is:" + maxprofitfun(price));
}


}
