

public class power_of_2 {

            private int setbit(int n)
        {
            double p = 0;
            int i=0;
            while(n!=0) {

                int x = n % 2;
                p = x* Math.pow(10,i)+ p;
                i++;
                n = n / 2;
            }
            return (int) p;
        }
        public static void main (String[]args){
        power_of_2 = new power_of_2();
            int z=n.setbit(64);
            int sum=0;
            while(z!=0)

            {
                int x=z%10;
                sum=sum+x;
                z=z/10;
            }
           if(sum==1)
             sopln("the number is power of 2");
          else
            sopln("the number is not power of 2");
    }
    }
