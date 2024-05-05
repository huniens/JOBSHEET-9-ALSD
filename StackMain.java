import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {
        StackBook st = new StackBook(8);
        Scanner input13 = new Scanner(System.in);
        char choose;

        do {
            System.out.print("Title : ");
            String title = input13.nextLine();

            System.out.print("Author Name : ");
            String name = input13.nextLine();

            System.out.print("Published year : ");
            int year = input13.nextInt();

            System.out.print("Pages Amount: ");
            int pages = input13.nextInt();

            System.out.print("Price: ");
            int price = input13.nextInt();

            Book bk = new Book(title, name, year, pages, price);
            st.push(bk);

            System.out.print("Do you want to add new data to stack (y/n)? ");
            choose = input13.next().charAt(0);
            input13.nextLine();

        } while (choose == 'y');

        input13.close();

        st.print();

        st.pop();
        st.peek();
        st.print();

    }
}