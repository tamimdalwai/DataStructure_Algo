package _01_Maths;

public class _04_GCDBasic {

    public static int GCD(int A, int B) {
        int smallestBetweenAnB = 0;
        if (A < B) {
            smallestBetweenAnB = A;
        }
        smallestBetweenAnB = B;

        for (int i = smallestBetweenAnB - 1; i >= 2; i--) {
            if (A % i == 0 && B % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(GCD(18, 24));
        int[] gcdList = { 18, 24, 36, 72, 80 };
        int currentGCD = 0;
        for (int i = 0; i < gcdList.length - 1; i++) {
            if (i == 0) {
                currentGCD = GCD(gcdList[i], gcdList[i + 1]);
            }
            currentGCD = GCD(currentGCD, gcdList[i + 1]);
        }
        System.out.println(currentGCD);
    }
}
