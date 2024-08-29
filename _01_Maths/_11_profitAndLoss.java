package _01_Maths;

public class _11_profitAndLoss {

    public static int profitOrLoss(int cost, int sell) {
        int profitLoss = 0;

        if (cost < sell) {
            System.out.println(1);
            profitLoss = sell - cost;
        } else {
            System.out.println(-1);
            profitLoss = cost - sell;
        }

        return profitLoss;
    }

    public static void main(String[] args) {
        System.out.println(profitOrLoss(10, 20));
        System.out.println(profitOrLoss(40, 20));

    }

}
