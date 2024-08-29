package _01_Maths;

/**
 * _01_isPrime
 */
public class _01_isPrime {

    public static boolean isPrime(int N) {
        for (int i = 2; i <= N - 1; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("the number is prime : " + isPrime(7));
        System.out.println("the number is prime : " + isPrime(8));
    }
}