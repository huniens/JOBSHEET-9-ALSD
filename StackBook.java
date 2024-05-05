class StackBook {
    Book data[];
    int size;
    int top;

    public StackBook(int size) {
        this.size = size;
        data = new Book[size];
        top = -1;
    }

    public void push(Book bk) {
        if (!isFull()) {
            top++;
            data[top] = bk;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            top--;
            System.out.println("Data removed from stack");
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Top element : " + data[top].title);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void print() {
        System.out.println("Stack content: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].title + " " +
                    data[i].authorName + " " + data[i].publishedYear +
                    " " + data[i].pagesAmount + " " + data[i].price);
        }
        System.out.println("");
    }

    private boolean isFull() {
        return top == size - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }
}