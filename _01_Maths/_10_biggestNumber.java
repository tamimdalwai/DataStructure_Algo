package _01_Maths;

public class _10_biggestNumber {

    public static int checkBigNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }

    }

    public static void main(String[] args) {
        System.out.println("biggest number amon 10 15 20 : " + checkBigNumber(10, 15, 20));
        System.out.println("biggest number amon 10 15 20 : " + checkBigNumber(40, 20, 12));
        System.out.println("biggest number amon 10 15 20 : " + checkBigNumber(15, 35, 12));

    }
}
