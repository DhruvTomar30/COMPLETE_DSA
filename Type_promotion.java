import java.util.*;
public class Type_promotion {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    // char a='a';
    // char b='b';
    // System.out.println((int)(a));
    // System.out.println((int)(b));
    // System.out.println(b-a);

//     short a=12;
//     byte b=15;
//     char c='c';
//    byte bt=(byte)(a+b+c);
//     System.out.println(bt);

    // byte b=5;
    // byte a=(byte)(b*2);    //coz of expression java knows its a promotion to int so int to byte not possible..
    // System.out.println(a);



    float a=89.3f;
    int b=12;
    long c=23;
    double d=24;
    double ans=a+b+c+d;
    System.out.print(ans);
 
  }
}
