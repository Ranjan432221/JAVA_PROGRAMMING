public class Count_digit {
    public static void main(String[] args) {

        int n = 12;
        int temp = n;
        int count = 0, b;
        while (n > 0) {
            b = n % 10;
            if (b != 0 && temp % b == 0) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
