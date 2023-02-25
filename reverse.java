class Solution {
    public int reverse(int x) {
        int digit;
        int ans=0;
        while(x!=0)
        {
            
            digit=x%10;
              if( (ans > Integer.MAX_VALUE/10) || (ans < Integer.MIN_VALUE/10)){
                return 0;
              }
            ans=ans*10+digit;
            x=x/10;
          
        }
        return ans;
    }
}
