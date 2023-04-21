// BackTracing on Arrays....
public class Backtracing {
    public static void changeArr(int arr[],int i,int val){
        // base class
        if(i==arr.length){
            printArr(arr);
            return;
        }
        // Recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);  // function call step
        arr[i]=arr[i]-2;    // Backtracing step
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
        }
        System.out.println();
    }

// 02. Find Subsets in a String...
public static void findSubsets(String str, int i, String ans){
    if(i==str.length()){
        if(ans.length()==0){
            System.out.println("null");
        }
        else{
            System.out.println(ans);
        }
        return;
        }

        findSubsets(str, i+1, ans+str.charAt(i));
        findSubsets(str, i+1, ans);
}

// 03. Find Permutation....
 public static void findPermutation(String str,String ans){
    // base case
    if(str.length()==0){
        System.out.println(ans);
        return;
    }
    // recursion 
    for(int i=0;i<str.length();i++){
        char curr=str.charAt(i);     // i ko hatana hai String str mai se aur curr ko ans mai +.
        //"abcde" ="ab"+"de" = "abde" 

        String Newstr=str.substring(0, i)+str.substring(i+1);
        findPermutation(Newstr, ans+curr);
    }
 }

 // 04.  place N-Queens on an N*N chessboard such that no 2 queens can attack each other ...
    // public static boolean isSafe(char board[][],int row, int col){
    //     // vertical up
    //     for(int i=row-1;i>=0;i--){
    //         if(board[i][col]=='Q'){
    //             return false;
    //         }
    //     }
    //     // diagonal left up
    //     for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
    //         if(board[i][j]=='Q'){
    //             return false;
    //         }
    //     }
    //     // diagonal right up
    //     for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
    //         if(board[i][j]=='Q'){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void nQueens(char board[][],int row){
    //     // base
    //     if(row==board.length){
    //         // printBoard(board);
    //         count++;     // for how many solutions ...
    //         return;
    //     }
    //     // column loop 
    //     for(int j=0;j<board.length;j++){
    //         if(isSafe(board,row,j)){
    //             board[row][j]='Q';
    //             nQueens(board, row+1); // function call
    //             board[row][j]='x';     // backtracing step
    //         }
    //     }
    // }
    // public static void  printBoard(char board[][]){
    //     System.out.println("_______chessboard_______");
    //     for(int i=0;i<board.length;i++){
    //         for(int j=0;j<board.length;j++){
    //             System.out.print(board[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }


// 05. check if problem can be solved and print 1 solution to N_Queen problem...
public static boolean isSafe(char board[][],int row, int col){
    // vertical up
    for(int i=row-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
    }
    // diagonal left up
    for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    // diagonal right up
    for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
public static boolean nQueens(char board[][],int row){
    // base
    if(row==board.length){
        // printBoard(board);
        count++;     
        return true;
    }
    // column loop 
    for(int j=0;j<board.length;j++){
        if(isSafe(board,row,j)){
            board[row][j]='Q';
            if(nQueens(board, row+1)){
                return true;
            } 
            board[row][j]='x';     // backtracing step
        }
    }
    return false;
}
public static void  printBoard(char board[][]){
    System.out.println("_______chessboard_______");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}


// 06. Grid Ways 
public static int gridways(int i,int j, int n,int m){
    // base class
    if(i==n-1 && j==m-1){   // condtion for end row and end column.
        return 1;
    }
    else if(i==n || j==n){  // cond. for outside the boundary
        return 0;
    }
   int w1=gridways(i, j+1, n,m);
   int w2=gridways(i+1, j, n, m);
   return w1+w2;
}


// 07.. SUDOKU SOLVER...
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        // column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        // row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        
        // 3*3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        // base class
        if(row==9 && col==0){
            return true;
        }
        // recursion
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;       // solution exist....
                }
                sudoku[row][col]=0;
            }
        }
        return false;
}
public static void printSudoku(int sudoku[][]){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(sudoku[i][j]+" ");
        }
        System.out.println();
    }
}

    static int count=0;
    public static void main(String args[]){
     // 01 .. Solution 
        // int arr[]=new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        // 02..  findsubsets .
        String str="abc";
        findSubsets(str, 0, "");

        // 03.  find permuataion 
        // String str="abc";
        // findPermutation(str,"");

        // // 04. N-Queens ...
        // int n=4;
        //  char board[][]=new char[n][n];
        // // initialize
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         board[i][j]='x';
        //     }
            
        // }
        // 04........ 
        // nQueens(board, 0);
        // System.out.println("total ways to solve n queens=" + count);

        // 05... Solution ..
        // if(nQueens(board, 0)){
        //     System.out.println("solution is possible:");
        //     printBoard(board);
        // }
        // else{
        //     System.out.println("solution is not possible");
        // }

        // 06. grid ways..
            // int n=3,m=3;
            // // gridways(0, 0, n, m);
            // System.out.println(gridways(0, 0, n, m));

        // 07... Sudoku Solver ...
//         int sudoku[][]={ {0,0,8,0,0,0,0,0,0},
//         {4,9,0,1,5,7,0,0,2},
//         {0,0,3,0,0,4,1,9,0},
//         {1,8,5,0,6,0,0,2,0},
//         {0,0,0,0,2,0,0,6,0},
//         {9,6,0,4,0,5,3,0,0},
//         {0,3,0,0,7,2,0,0,4},
//         {0,4,9,0,3,0,0,5,7},
//         {8,2,7,0,0,9,0,1,3} };

//         if(sudokuSolver(sudoku,0,0)){
//             System.out.println("Solution exists");
//             printSudoku(sudoku);
//         }
//         else{
//             System.out.println("solution doesn't exist");
//         }
}
}

