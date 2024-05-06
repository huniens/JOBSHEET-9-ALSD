import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {
        StackBook st = new StackBook(8);
        Scanner input = new Scanner(System.in);
        char choose;

        do {
            System.out.println("Choose operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // Clear the buffer
            
            switch (choice) {
                case 1:
                    System.out.print("Title : ");
                    String title = input.nextLine();

                    System.out.print("Author Name : ");
                    String name = input.nextLine();

                    System.out.print("Published year : ");
                    int year = input.nextInt();

                    System.out.print("Pages Amount: ");
                    int pages = input.nextInt();

                    System.out.print("Price: ");
                    int price = input.nextInt();

                    Book bk = new Book(title, name, year, pages, price);
                    st.push(bk);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.print();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }

            System.out.print("Do you want to perform another operation (y/n)? ");
            choose = input.next().charAt(0);
            input.nextLine(); // Clear the buffer

        } while (choose == 'y');

        input.close();
    }
}