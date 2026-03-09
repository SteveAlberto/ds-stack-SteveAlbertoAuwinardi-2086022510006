package question4;
import java.util.Stack;
import java.util.Scanner;

public class CheatBuster {
    public static Stack<Integer> orderSyncProtocol(Stack<Integer> inputStack) {
        Stack<Integer> tempStack = new Stack<>();
        
        while (!inputStack.isEmpty()) {
            int current = inputStack.pop();
            
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                inputStack.push(tempStack.pop());
            }
            tempStack.push(current);
        }
    
        return tempStack; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input elemen (pisahkan dengan spasi): ");
        String inputLine = scanner.nextLine();
        
        String[] stringNumbers = inputLine.split(" ");
        
        Stack<Integer> initialStack = new Stack<>();
        
        for (String str : stringNumbers) {
            initialStack.push(Integer.parseInt(str));
        }

        Stack<Integer> sortedStack = orderSyncProtocol(initialStack);
        System.out.print("Output: ");
        for (int num : sortedStack) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}