// 01. Hollow rectangle pattern.. 
public class AdvancedPatterns {
    public static void Hollow_rectangle(int totrows, int totcols){
        // outer loop 
        for(int i=1;i<=totrows;i++){
            //inner - columns
            for(int j=1;j<=totcols;j++){
                // cell - (i,j)
                if(i==1 || i==totrows || j==1 || j==totcols){
                    //boundary cells
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }}


    // 02. Inverted and Rotated half-pyramid....

    public static void inverted_Rotated_Half_Pyramid(int totrows){
        for(int i=1;i<=totrows;i++){ // outer
            for(int j=1;j<=totrows-i;j++){ // Spaces and spaces= n-i ; i=stars...
                    System.out.print(" ");
            }
                for(int j=1;j<=i;j++){      // stars 
                    System.out.print("*");
                }
                
            System.out.println();
        }
    }

//  03.  Inverted Half pyramid with numbers... 
public static void Inverted_half_pyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}

// 04. Floyd's Triangle...
public static void Floyds_triangle(int n){
   int number=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
         System.out.print(number+" ");
              number++;
            }
         System.out.println();
        }
    }

// 05. zero one Triangle....
public static void zero_one_triangle(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print(" 1 ");}
            else{
                System.out.print(" 0 ");
                }
            }
            System.out.println();
}}

// 06. Butterfly Pattern... 
public static void Butterfly(int n){
    //1st Half
    for(int i=1;i<=n;i++){
        // stars - i
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        // spaces- 2*(n-i)
        for(int j=1;j<=2*(n-i);j++){
            System.out.print("   ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        System.out.println();
}
    // 2nd Half
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        // spaces- 2*(n-i)
        for(int j=1;j<=2*(n-i);j++){
            System.out.print("   ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
}

// 07. Solid Rhombus.... 
public static void Solid_rhombus(int n){
    for(int i=1;i<=n;i++){
        //spaces- n-i
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // stars 
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }}

// 08. Hollow Rhombus.... 
public static void Hollow_rhombus(int n){
    for(int i=1;i<=n;i++){
        // spacing
        for(int j=1;j<=(n-i);j++){
           System.out.print(" ");
        }
        // hollow rectangle-stars
        for(int j=1;j<=n;j++){
            if(i==1 || i==n || j==1 || j==n ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }}

// 09. Diamond Patter,...
public static void Diamond(int n){
     // 1st Half
    for(int i=1;i<=n;i++){
          //space
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        // stars- diamond- (2*i)-1
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //2nd Half
    for(int i=n;i>=1;i--){
          //space
          for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        // stars- diamond- (2*i)-1
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }}
    
// 10. Number pyramid... 
public static void Number_Pyramid(int n){
    for(int i=1;i<=n;i++){
        // spacing;
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // numbers
        for(int j=1; j<=i;j++){
            System.out.print(i+ " ");
        }
        System.out.println();
}}

// 11. Palindrome Pattern with Number... 
public static void Palindrome_Number( int n){
    for(int i=1;i<=n;i++){
        // Spacing
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");}

        // Descending Numbers
        for(int j=i;j>=1;j--){
            System.out.print(j);}
            
        // Ascending 
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        
        System.out.println();
    }
}

public static void Hollow(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    public static void main(String args[]){
        // Hollow_rectangle(4,5);
        // inverted_Rotated_Half_Pyramid(4);
        // Inverted_half_pyramid(5);
        // Floyds_triangle(5);
        // zero_one_triangle(5);
        // Butterfly(5);
        // Solid_rhombus(5);
        // Hollow_rhombus(5);
        // Diamond(4);
        // Number_Pyramid(5);
        // Palindrome_Number(5);
           Hollow(5);

    }}











