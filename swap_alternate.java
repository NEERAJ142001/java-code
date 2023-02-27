public class lb_10 {

    private void swap_alternate(int arr[],int n){
        int temp;
        for(int i=0;i<n;i=i+2)
        {
            if(i+1 < n) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
      private void print(int arr[],int n){
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input length");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("input number");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        lb_10 a=new lb_10();

        a.swap_alternate(arr,n);
        a.print(arr,n);
    }
