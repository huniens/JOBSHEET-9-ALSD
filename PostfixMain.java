import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        String Q;
        System.out.println("Insert mathematical expression : ");
        Q = input12.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix post = new Postfix(total);
        String p = post.convert(Q);
        System.out.println("Postfix : " + p);
    }
}