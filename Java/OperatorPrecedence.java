public class OperatorPrecedence {
    public static void main(String[] args) {

        int exp1 = 10 + 5 * 2;
        System.out.println("Result of 10 + 5 * 2 = " + exp1);
        // Explanation: Multiplication happens first: 5 * 2 = 10 → 10 + 10 = 20

        int exp2 = (10 + 5) * 2;
        System.out.println("Result of (10 + 5) * 2 = " + exp2);
        // Explanation: Parentheses evaluated first: 10 + 5 = 15 → 15 * 2 = 30

        int exp3 = 20 / 4 + 3 * 2;
        System.out.println("Result of 20 / 4 + 3 * 2 = " + exp3);
        // Explanation: Division and multiplication are evaluated left to right:
        // 20 / 4 = 5 → 3 * 2 = 6 → 5 + 6 = 11
    }
}
