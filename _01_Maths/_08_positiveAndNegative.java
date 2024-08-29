package _01_Maths;

public class _08_positiveAndNegative {
    public static int checkNumber(int Number) {
        if (Number == 0) {
            return 0;
        } else if (Number > 0) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(10));
        System.out.println(checkNumber(-10));
        System.out.println(checkNumber(0));
    }
}
