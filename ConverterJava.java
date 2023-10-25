/*
* This Class converts numbers between different numeral bases.
*
* @author c4vxl
* @version 1.0
*
* */

public class ConverterJava {
    private static final String DIGITS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String convert(String number, int inputBase, int outputBase) {
        if (inputBase < 2 || outputBase < 2) {
            return "";
        }

        int decimalNumber = number.chars().reduce(0, (acc, c) -> {
            int digit = DIGITS.indexOf(c);
            if (digit == -1 || digit >= inputBase) {
                return 0;
            }
            return acc * inputBase + digit;
        });

        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        int num = decimalNumber;

        while (num > 0) {
            int remainder = num % outputBase;
            result.insert(0, DIGITS.charAt(remainder));
            num /= outputBase;
        }

        return result.toString();
    }

    public static String fromDecimalToBin(int decimal) {
        return convert(Integer.toString(decimal), 10, 2);
    }

    public static int fromBinToDecimal(String bin) {
        return Integer.parseInt(convert(bin, 2, 10));
    }

    public static String fromDecimalToHex(int decimal) {
        return convert(Integer.toString(decimal), 10, 16);
    }

    public static int fromHexToDecimal(String hex) {
        return Integer.parseInt(convert(hex, 16, 10));
    }
}