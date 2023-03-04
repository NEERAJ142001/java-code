import java.util.* ;
import java.io.*;
 

public class Solution {
    public static boolean ispossible(ArrayList<Integer> arr,int n,int m,int mid) 
 {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++)
        {
            if (pageSum + arr.get(i) <= mid)
                pageSum =pageSum + arr.get(i);
        else
        {
            studentCount++;
            if (studentCount > m ||  arr.get(i) > mid)
                return false;
        }
       pageSum=0;
       pageSum+=arr.get(i);

    }
        return true;
    }
    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {
        int end;
        int sum=0;
        int ans=-1;
        //storing the sum of array
        for(int i=0;i<n;i++)
        {
            sum=sum+arr.get(i);
        }

        end=sum;
        int start=0;
        int mid=start+(end-start)/2;
        
        while(start<=end)
        {
            if(ispossible(arr,n,m,mid))
            {
                ans=mid;
                end=mid-1;
            }
            else 
                start=mid+1;
            mid=start+(end-start)/2;
        }
        return ans;
    }
}
