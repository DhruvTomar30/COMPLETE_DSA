import java.util.*;
public class Arrays {
//     public static void main(String args[]){
//         int marks[]=new int[50];   // Creating Array of name Marks..

//         System.out.print("length of array:"+ marks.length); // Finding the length of Array

//         Scanner sc=new Scanner(System.in);
//          marks[0]=sc.nextInt(); //phy
//          marks[1]=sc.nextInt(); //chem
//          marks[2]=sc.nextInt(); //math
    
//     System.out.println("phy :" +marks[0]);
//     System.out.println("chem :" +marks[1]);
//     System.out.println("math :" +marks[2]);

//     marks[2]=100; 
//     System.out.println("math :"+ marks[2]); // updating values....
//     }


// public static void update(int marks[]){
//     for(int i=0;i<marks.length;i++){
//         marks[i]=marks[i]+1;
// }}

// // 03. Linear Searching... 
// public static int LinearSearch(int numbers[],int keys){
//     for(int i=0;i<numbers.length;i++){
//         if(numbers[i]==keys){
//             return i;
//         }
//     }
//     return -1;
// }

//largest of number in a array.....
public static int largest(int numbers[]){
    int largest=Integer.MIN_VALUE; // -infinity
    int smallest=Integer.MAX_VALUE; //+ infinity
    for(int i=0;i<numbers.length;i++){
        if(largest < numbers[i]){
            largest=numbers[i];
        }
        if(smallest> numbers[i]){
            smallest=numbers[i];
        }
            
    }
    System.out.print("smallest number is: "+ smallest +"\n");
        return largest;
}



public static void main(String args[]){
    // int marks[]={97,98,99};
    // update(marks);

    // for(int i=0;i<marks.length;i++){  //print our marks
    //     System.out.print(marks[i]+" ");
    // }

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


// calling of Largest of number in a Array....
int numbers[]={1,2,6,3,5};
System.out.print(" largest number is: "+ largest(numbers));


}
}


