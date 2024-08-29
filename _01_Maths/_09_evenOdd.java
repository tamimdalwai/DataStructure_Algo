package _01_Maths;

public class _09_evenOdd {
    public static boolean checkEvenOdd(int number) {
        return (number % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(15));
        System.out.println(checkEvenOdd(10));
    }
}
