package _01_Maths;

public class _07_calculateEleBill {

    public static int calBill(int units) {
        int cost = 0;

        if (units <= 50) {
            cost = (int) (units * 0.50);
        } else if (units <= 150) {
            cost = (int) ((50 * 0.50) + ((units - 50) * 0.75));
        } else if (units <= 250) {
            cost = (int) ((50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20));
        } else {
            cost = (int) ((50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50));
        }

        return cost += cost * 0.2;
    }

    public static void main(String[] args) {

        System.out.println(calBill(1234));
    }
}
