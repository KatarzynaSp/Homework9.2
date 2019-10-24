public class Sum {
    static int sum(int a) {
        int sum = 0;
        while (a % 10 != 0) {
            int b = a % 10;
            sum += b;
            a = a / 10;
        }
        return sum;
    }
}