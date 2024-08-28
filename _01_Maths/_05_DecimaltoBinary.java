public class _05_DecimaltoBinary {

    public static String convertDecimalToBinary(int N) {
        // Edge case: when the number is 0
        if (N == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (N > 0) {
            int remainder = N % 2;
            binary.append(remainder);
            N = N / 2;
        }
        
        // Since the binary digits are obtained in reverse order, reverse the string
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertDecimalToBinary(8));  // Example: Input decimal 10 should output binary "1010"
    }
}
