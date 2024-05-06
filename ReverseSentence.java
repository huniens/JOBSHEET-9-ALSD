import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseSentence(sentence);
        System.out.println("Reversed result: " + reversedSentence);
    }

    public static String reverseSentence(String sentence) {
        CustomStack<Character> stack = new CustomStack<>();
        
        // Push each character of the sentence onto the stack
        for (int i = 0; i < sentence.length(); i++) {
            stack.push(sentence.charAt(i));
        }

        // Pop characters from the stack to form the reversed sentence
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}