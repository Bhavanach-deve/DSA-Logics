import java.util.Stack;

public class EvaluateInfix {

    public static void main(String[] args) {

        System.out.println(infixExp("2*(5*(3+6))/5-2")); // 16
    }

    public static int infixExp(String exp) {

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char c = exp.charAt(i);

            // ignore spaces
            if (c == ' ') {
                continue;
            }

            // multi-digit number
            if (Character.isDigit(c)) {

                int num = 0;

                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    num = num * 10 + (exp.charAt(i) - '0');
                    i++;
                }

                operands.push(num);
                i--; // because for loop will increment
            }

            // opening bracket
            else if (c == '(') {
                operators.push(c);
            }

            // closing bracket
            else if (c == ')') {

                while (!operators.isEmpty() && operators.peek() != '(') {
                    evaluateTop(operands, operators);
                }

                operators.pop(); // remove '('
            }

            // operator
            else if (isOperator(c)) {

                while (!operators.isEmpty()
                        && operators.peek() != '('
                        && precedence(operators.peek()) >= precedence(c)) {

                    evaluateTop(operands, operators);
                }

                operators.push(c);
            }
        }

        // remaining operators
        while (!operators.isEmpty()) {
            evaluateTop(operands, operators);
        }

        return operands.pop();
    }

    public static void evaluateTop(Stack<Integer> operands,
                                   Stack<Character> operators) {

        int op2 = operands.pop(); // right operand
        int op1 = operands.pop(); // left operand

        char operator = operators.pop();

        int result = performOperation(op1, op2, operator);

        operands.push(result);
    }

    public static int performOperation(int op1, int op2, char operator) {

        switch (operator) {

            case '+':
                return op1 + op2;

            case '-':
                return op1 - op2;

            case '*':
                return op1 * op2;

            case '/':
                return op1 / op2;
        }

        return 0;
    }

    public static boolean isOperator(char c) {

        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static int precedence(char c) {

        if (c == '*' || c == '/')
            return 2;

        if (c == '+' || c == '-')
            return 1;

        return 0;
    }
}