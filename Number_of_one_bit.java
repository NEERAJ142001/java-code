public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
    for(int i=0;i<32;i++)
    {
        if((n&1)==1)
        count++;
        n=n>>1;
    }
    return count;
    
}
     private int numberofonebit(int n) {
        int count =0;
            while(n!=0)
            {
                int x=n%2;
                if(x==1) {
                    count++;
                }
                n=n/2;
            }
            return count;
    }
}
