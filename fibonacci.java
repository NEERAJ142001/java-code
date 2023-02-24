package love_babbar;

public class fibonacci {

        private void series ( int n)
        {
            System.out.print("0");
            System.out.print(","+"1");
            int k = 0, g = 1;
            int temp;int sum=0;
            for (int i = 0; i < n; i++) {
                sum = sum + g;
                System.out.print(","+ sum);
                temp = sum;
                sum = g;
                g = temp;
            }
        }
        private int total(int n)
        {
            int k = 0, g = 1;

            if(n==0)
                return 0;
            else if (n==1)
                return 1;
            else
                return total(n-1)+total(n-2);

        }
        public static void main (String[]args){
        fibonacci n = new fibonacci();
        n.series(6);
        int s=n.total(6);
            System.out.println();
            System.out.println("sum of fibonacci series is "+ s);
    }
    }
