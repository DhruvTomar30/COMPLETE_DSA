import java.util.*;
import java.util.ArrayList;
public class Arraylist {

    // Swapping of two numbers...
    public static void swap(ArrayList<Integer> list,int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }


    public static void main(String args[]){
        // classname objectname= new classname();
        // ArrayList <Integer> list= new ArrayList<>();
        // ArrayList <String> list2= new ArrayList<>();
        // ArrayList <Boolean> list3= new ArrayList<>();

        // operations ....
        // 1. Add elements
        // list.add(1);    // O(1)
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // System.out.println(list);
        // list.add(1,9);
        // System.out.println(list);

        // // 2. Get operation
        // int element = list.get(2);
        // System.out.println(element);

        // // 3. Delete
        // list.remove(2);
        // System.out.println(list);

        // // 4. set element at Index
        // list.set(2,10);
        // System.out.println(list); 

        // // 05. Contains Element
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11)); 

       // Size of Arraylist...
    //    System.out.println(list.size());

       // print arraylist...
    //    for(int i=0;i<list.size();i++){
    //     System.out.print(list.get(i)+" ");
    //    }
    //    System.out.println();

    //   // Reverse print...
    //    for(int i=list.size()-1;i>=0;i--){
    //     System.out.print(list.get(i)+" ");
    //    }
    //    System.out.println();

       // <---------- Find Maximum ------------->
    //    int max=Integer.MIN_VALUE;
    //    for(int i=0;i<list.size();i++){
    //     if(max<list.get(i)){
    //         max=list.get(i);
        // }
    //     max=Math.max(max,list.get(i));
    //    }
    //    System.out.println("max element= "+max);

    // swapping of 2 numbers..
    // list.add(2);    
    // list.add(5);
    // list.add(9);
    // list.add(3);
    // list.add(6);

    // int idx1=1,idx2=3;
    // System.out.println(list);
    // swap(list, idx1, idx2);
    // System.out.println(list);


    // Sorting a List ...
    // System.out.println(list);
    // // ascending
    // Collections.sort(list);
    // System.out.println(list);
    // // descending
    // Collections.sort(list,Collections.reverseOrder());
    // System.out.println(list);


    // <--------------- Multi-Dimensional ArrayList --------------------> 
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer>list1=new ArrayList<>();
    ArrayList<Integer>list2=new ArrayList<>();
    ArrayList<Integer>list3=new ArrayList<>();

    for(int i=1;i<=5;i++){
        list1.add(i*1);  // 1 2 3 4 5
        list2.add(i*2);  // 2 4 6 8 10
        list3.add(i*3);  // 3 6 9 12 15
    }

    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);

    list2.remove(3);
    System.out.println(mainList);

    // nested loops
    for(int i=0;i<mainList.size();i++){
        ArrayList<Integer>currList= mainList.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
    }




    }
}
