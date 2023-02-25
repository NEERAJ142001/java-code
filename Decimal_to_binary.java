public class decimal_to_binary {

public int power(int n) {
    double answer=0.0;
    int bit = 0;
    int i = 0;
    while (n != 0) {
        bit = n & 1;
        answer = bit * Math.pow(10, i)+ answer;
        n = n >> 1;
        i++;
    }
    return (int) answer;
}

    public static void main (String[]args){
        decimal_to_binary r = new decimal_to_binary();


        Scanner sc = new Scanner(System.in);
        System.out.println("input a length");
        int n = sc.nextInt();
      int x=  r.power(n);
      System.out.println(x);

    }
}
