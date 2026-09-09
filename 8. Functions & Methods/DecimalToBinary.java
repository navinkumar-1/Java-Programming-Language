public class DecimalToBinary {

    public static void decimalToBinary(int n) {

        int binary = 0;
        int power = 1;

        for (; n > 0; n = n / 2) {
 
            int remainder = n % 2;
            binary = binary + remainder * power;
            power = power * 10;
        }

        System.out.println("Binary = " + binary);
    }

    public static void main(String args[]) {

        decimalToBinary(11);
    }
}