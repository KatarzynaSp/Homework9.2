public class Sum {
    static int sum(int a) {
        int sum = 0;
        int b = a % 10;
        while (b != 0) {
            b = a % 10;
            sum += b;
            a = a / 10;
        }
        return sum;
    }
}