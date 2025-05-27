public class TypeCast {
    public static void main(String[] args) {
        double decimalValue = 9.75;

        int intValue = (int) decimalValue;
        System.out.println("Double "+ decimalValue + " to int: " + intValue);

        int number = 15;

        double convertedDouble = number;
        System.out.println("Int "+ number +" to double: " + convertedDouble);
    }
}
