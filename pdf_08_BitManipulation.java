public class pdf_08_BitManipulation {
    public static void main(String[]args){
        // int x=6;
        // System.out.println(x+" + "+1+" is "+~x);
        // x= -4;
        // System.out.println(x+" + "+1+" is "+~x);
        // x=0;
        // System.out.println(x+" + "+1+" is "+~x);

        // Convert uppercase character to lowercase
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch|' '));
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
 }

