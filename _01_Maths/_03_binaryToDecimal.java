package _01_Maths;
public class _03_binaryToDecimal {
    
    public static int convertBinaryToDecimal(int B){
        int base = 1;
        int sum = 0;
        while (B > 0) {
            int remainder = B % 10;
            B = B / 10;
            sum = sum + base * remainder;
            base = base * 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(convertBinaryToDecimal(1010));   
    }
}
