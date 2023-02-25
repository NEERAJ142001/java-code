public class binary_to_decimal {
    public double power(int n) {
        double answer = 0.0;
        int bit = 0;
        int i = 0;
        while (n != 0) {
            bit=n % 10;
            answer = bit * Math.pow(2, i) + answer;
            n = n / 10;
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        binary_to_decimal n = new binary_to_decimal();
        double x = n.power(10101);
        System.out.println(x);
    }
}
