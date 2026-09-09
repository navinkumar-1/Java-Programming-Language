public class BinaryToDecimal {

    public static int binaryToDecimal(int binary) {

        int decimal = 0;
        int power = 0;

        while (binary > 0) {

            int lastDigit = binary % 10;

            decimal = decimal + lastDigit * (int)Math.pow(2, power);

            power++;
            binary = binary / 10;
        }

        return decimal;
    }

    public static void main(String args[]) {

        int binary = 1011;

        int result = binaryToDecimal(binary);

        System.out.println("Decimal = " + result);
    }
}