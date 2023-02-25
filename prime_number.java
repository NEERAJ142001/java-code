package love_babbar;

public class prime_number {
    private int number(int n)
    {
        boolean b=true;
        for(int i=2;i<n/2;i++) {
            if (n % i == 0) {
                b = false;
                break;
            }
        }
            if (b == true)
                return 1;
            else
                return 0;
        }
    public static void main(String args[])
    {
        prime_number m=new prime_number();
        int a=m.number(131);
        if(a==1)
            System.out.println("prime number");
        else
            System.out.println("not a prime number");
    }


}