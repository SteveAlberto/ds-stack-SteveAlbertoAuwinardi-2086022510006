package question5;
import java.util.Stack;
import java.util.Scanner;

public class OperationChastise {
    
    public static void calculateBombMomentum(int n) {
        Stack<Integer> stack = new Stack<>();
        int currentMomentum = n;

        stack.push(currentMomentum);
        while (currentMomentum > 1) {
            currentMomentum /= 2;
            stack.push(currentMomentum);
        }
        
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai momentum (n): ");
        int n = scanner.nextInt();
        
        System.out.print("Output: ");
        calculateBombMomentum(n);
        
        scanner.close();
    }
}