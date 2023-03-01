package love_babbar;

public class lb_14_pivot_element {

    private int pivot_element(int arr[],int size)
    {
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

    public static void main(String[] args) {
        int arr[]={5,6,7,8,1,2,3};
        lb_14_pivot_element l=new lb_14_pivot_element();
        System.out.println("index="+  l.pivot_element(arr,7));
    }
}
