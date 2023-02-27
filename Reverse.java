public class reverse_1 {
    int temp;
    public void reverse(int start,int arr[],int end)
    {
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void print(int length, int[] arr)
    {
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        reverse_1 r=new reverse_1();
        int arr[]={1,2,3,4,5};
        r.reverse(0,arr,4);
        r.print(5,arr);
    }
   }

