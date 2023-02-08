public class DSA_Trapped_water {
    public static int trapped_Rain_water(int height[]){  // O(n)
        int n=height.length;
        // calculate leftmax boundary-- array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }

        // calculate rightmax boundary-- array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1]; // last element height will be same... 
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater=0;
        // loop
        for(int i=0;i<n;i++){

        // waterlevel= min(leftmax[i], rightmax[i])
        int waterlevel=Math.min(leftmax[i],rightmax[i]);

        // trappedwater= waterlevl-height;
        trappedwater += waterlevel-height[i];
    }
    return trappedwater;
}

public static void main(String args[]){
    int height[]={4,2,0,6,3,2,5};
    System.out.println(trapped_Rain_water(height));
}
}
