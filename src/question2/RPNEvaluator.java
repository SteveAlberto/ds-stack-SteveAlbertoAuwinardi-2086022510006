package question2;
import java.util.Stack;
import java.util.Scanner;

public class RPNEvaluator {
    public static int evaluate_rpn(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int operan2 = stack.pop(); 
                int operan1 = stack.pop(); 
                
                switch (token) {
                    case "+": stack.push(operan1 + operan2); break;
                    case "-": stack.push(operan1 - operan2); break;
                    case "*": stack.push(operan1 * operan2); break;
                    case "/": stack.push(operan1 / operan2); break; 
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ekspresi RPN (contoh: 5 1 + 4 *): ");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int result = RPNEvaluator.evaluate_rpn(tokens);
        System.out.println("Hasil: " + result);
        scanner.close();
    }
}