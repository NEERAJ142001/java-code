public class Solution {
public  static int search(int arr[],int key,int start,int end)
{       //binary search
    int s=start;
    int e=end;
    int m=s+(e-s)/2;
    while(s<=e)
    {
        if(arr[m]==key)
        return m;
        else if(key>arr[m])
        s=m+1;
        else
        e=m-1;
        m=s+(e-s)/2;
    }
    return -1;
}
     public static int pivot_element(int arr[],int size)
    { //finding the pivot element
        int start=0;
        int end=size-1;

        int mid=start+(end-start)/2;

        while(start<end)
        {
            if(arr[mid] >= arr[0])
                start=mid+1;
            else
                end = mid;
            mid=start+(end-start)/2;
        }
        return start;
    }
    public static int search(int arr[], int key) {
        int size=arr.length;
     int pivot=pivot_element(arr,size);

     if( key>=arr[pivot] && key <=arr[size-1])
      return search(arr,key,pivot,size-1);
      
     else
        return search(arr,key,0,pivot-1);
      }
}
