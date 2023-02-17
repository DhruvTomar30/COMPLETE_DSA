public class BitManipulation {
    public static void main(String args[]){
        System.out.println((5 & 6));   // AND
        System.out.println((5 | 6));   // OR
        System.out.println((5 ^ 6));   // XOR    same hoga toh 0 otherwise 1...
        System.out.println((~5));      // NOT   one's compliment 
        System.out.println((5 << 2));  // Left shift Operator   a<<b = a*2^b
        System.out.println((6 >> 1));  // Right shift operator  a>>b = a/2^b

        // calling of odd even question...
        oddOreven(14);
        oddOreven(11);

        // getIth Bit...
        System.out.println(getIthBit(10,2));

        // setIth bit code calling.... 
        System.out.println(setIthBit(10,2));

        // clear ith Bit...
        System.out.println(clearIthBit(10, 1));

        // update ith Bit....
        System.out.println(updateIthBit(10,2,1));

        // clear last i bits...
        System.out.println(clearlastIthBit(15,2));

        // clear range of bits....
        System.out.println(clearBitsinRange(10,2,4));

        // if a number is a power of 2....
        System.out.println(isPowerofTwo(16));

        // set bits in a number.....
        System.out.println(countSetBits(16));

        // Fast exponential calling....
        System.out.println(FastExpo(5, 3));
    
    }

        //        <---- Functions -------->

// 01........  Check a number is even or not.....
        public static void oddOreven(int n){
            int bitMask=1;
            if((n & bitMask) == 0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
    }

    // Get ith Bit .....
    public static int getIthBit(int n, int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // code for set ith Bit....
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }

    // code for clear ith Bit....
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    // code for update Ith Bit....
    public static int updateIthBit(int n,int i, int newBit){
        // if(newBit==0){
        //     return clearIthBit(n,i);
        // }
        // else{
        //     return setIthBit(n,i);
        // }

        // "or"
            n=clearIthBit(n, i);
            int bitMask=newBit<<i;
            return n|bitMask;
}

// Clear Last ith Bit.....
public static int clearlastIthBit(int n,int i){
    int bitMask=(~0)<<i;
    return n|bitMask;
}

// clear Bits in range...
public static int clearBitsinRange(int n,int i,int j){
    int a=((~0)<<(j+1));
    int b=(1<<i)-1;
    int bitMask=a|b;
    return n & bitMask;
}

// 02.  Check if a number is a power of 2 or not....
public static Boolean isPowerofTwo(int n){
    return(n & (n-1))==0;
}

// 03.  count set  Bits in a Number....
public static int countSetBits(int n){
    int count=0;
    while(n>0){
        if((n & 1)!=0){
            count++;
        }
        n=n>>1;
    }
    return count;
}

// 04. Fast Exponential code......
public static int FastExpo(int a,int n){
    int ans=1;
    while(n>0){
        if((n & 1)!=0){
            ans=ans*a;
        }
        a=a*a;
        n=n>>1;
        
    }
    return ans;
}


}


