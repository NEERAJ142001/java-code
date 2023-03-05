
import java.util.Scanner;
public class decimal_to_binary {
    
public int first(int n) {
    //decimal to binary
    double answer=0.0;
    int bit = 0;
    int i = 0;
    while (n != 0) 
    {
        bit = n & 1;
        answer = bit * Math.pow(10, i)+ answer;
        n = n >> 1;
        i++;
    }
    return (int) answer;
}
public int second(int n)
{
    double answer=0;int i=0;int x=0;
    while(n !=0)
    {
        x=n%2;
        answer=x*Math.pow(10,i)+answer;
        i++;
        n=n/2;
    }
    return (int)answer;
}

    public static void main (String[]args){
        decimal_to_binary r = new decimal_to_binary();


        Scanner sc = new Scanner(System.in);
        System.out.println("input a length");
        int n = sc.nextInt();
      int x=  r.first(n);
      System.out.println(x);
        int q=  r.second(n);
        System.out.println(q);

    }
}

