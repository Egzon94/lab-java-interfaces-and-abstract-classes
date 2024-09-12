import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static double roundToHundredth(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal number) {
        BigDecimal reversedSign = number.negate();
        return reversedSign.setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println("Rounded to hundredth: " + roundToHundredth(num1));

        BigDecimal num2 = new BigDecimal("1.2345");
        System.out.println("Reverse sign and round to tenth: " + reverseSignAndRoundToTenth(num2));

        BigDecimal num3 = new BigDecimal("-45.67");
        System.out.println("Reverse sign and round to tenth: " + reverseSignAndRoundToTenth(num3));
    }
}