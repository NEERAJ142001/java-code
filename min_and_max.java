public class max_and_min_2 {

    public void max(int arr[],int n){
        int temp=0;
        for(int i=0;i<n;i++){
            if(temp<arr[i])
            {
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
    public void min(int arr[],int n){
        int temp=arr[0];
        for (int i=0;i<n;i++){

            if(temp>arr[i]){
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        max_and_min_2 m=new max_and_min_2();
        int arr[]={1,2,3,4,5};
        m.max(arr,5);
        m.min(arr,5);

    }
    }
