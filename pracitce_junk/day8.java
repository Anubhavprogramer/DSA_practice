import java.util.*;

public class day8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String input = scanner.next();
            int result = isBalanced(input);
            System.out.println(result);
        }

        scanner.close();
    }
    
        private static int isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return 0; // Unbalanced parentheses
                } else {
                    stack.pop();
                }
            }
        }

        // If the stack is empty, parentheses are balanced
        return stack.isEmpty() ? 1 : 0;
    }
}