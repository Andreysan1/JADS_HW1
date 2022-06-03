package jads.lesson1;

public class Main {
    private static int simple(int base, int sign) {
        int result = 1;
        while (sign > 0) {
            result *= base;
            --sign;
        }
        return result;
    }

    private static int even(int base, int sign) {
        int result = 1;
        while (sign > 0) {
            if (sign % 2 == 1){
                result *= base;
                --sign;
            }
            base *= base;
            sign >>= 1;
        }
        return result;
    }

    private static int summ(int base) {
        int result = 0;
        while (base > 0) {
            result += base;
            --base;
        }
        return result;
    }

    private static int sum0(int base) {
        int opposite = 0;
        int mid = base / 2;
        int result = (base % 2 == 0) ? mid : 0;
        while (base > mid) {
            result += base;
            result += opposite;
            --base;
            ++opposite;
        }
        return result;
    }

    private static int sum1(int base) {
        int b = base - 1;
        int sum = b / 2 * base + base;
        sum += (b % 2 == 0) ? 0 : base / 2;
        return sum;
    }

    public static void main(String[] args) {
        int base = 2;
        int degree = 16;
        int number = 6;

        System.out.println(simple(base, degree));
        System.out.println(even(base, degree));
        System.out.println(summ(number));
        System.out.println(sum0(number));
        System.out.println(sum1(number));
    }
}
