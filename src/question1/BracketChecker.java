package question1;
import java.util.Stack;
import java.util.Scanner;

public class BracketChecker {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Masukkan urutan kurung (contoh: {[()]} ): ");
        String input = scanner.nextLine();
        boolean result = BracketChecker.is_balanced(input);

        if (result) {
            System.out.println("Output: Balanced (Seimbang)");
        } else {
            System.out.println("Output: Not Balanced (Tidak Seimbang)");
        }
        scanner.close();
    }

    public static boolean is_balanced(String brackets) {
        Stack<Character> stack = new Stack<>();
        
        for (char input : brackets.toCharArray()) {
            if (input == '(' || input == '{' || input == '[') {
                stack.push(input);
            } else if (input == ')' || input == '}' || input == ']') {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if ((input == ')' && top != '(') ||
                    (input == '}' && top != '{') ||
                    (input == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
