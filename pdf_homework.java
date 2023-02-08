import java.util.*;
public class pdf_homework {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

// Homework question 1.... Avg of 3 user defined numbers...
    
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // int c=sc.nextInt();
    // int Avg=(a+b+c) / 3;
    // System.out.println("Average is: " + Avg);


    //homework question 2.....  Area of a Circle.....
    // int side=sc.nextInt();
    // int area=side*side;
    // System.out.print("Area of square is: "+area);


    // homework question 3....  Calculating 18% gst in items defined by user....
    // float pencil=sc.nextFloat();
    // float pen=sc.nextFloat();
    // float eraser=sc.nextFloat();
    // float gst=pencil+pencil*18/100+pen+pen*18/100+eraser+eraser*18/100;
    // System.out.println(gst);


    //Homework question 4..  guess the result 
    byte b=4;
    char c='a';
    short s=512;
    int i =1000;
    float f=3.14f;
    double d=99.9954;

    double result=(f*b)+(i%c)-(d*s);
    System.out.println(result);

    }
}
