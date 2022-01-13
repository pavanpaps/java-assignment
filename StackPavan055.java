import java.util.Scanner;

public class StackPavan055 {
    int size = 100;
    int[] sta = new int[size];
    int tos = -1;

    public void push(int data) {
        if (full() == false) {
            sta[++tos] = data;
        } else {
            System.out.println("The stack is full!");
        }
    }

    public int pop() {
        int e;
        if (empty() == false) {
            e = sta[tos--];
            return e;
        } else {
            System.out.println("OOPS! Stack is empty, Illegal Pop Operation");
            return -1;
        }
    }

    public void display() {
        System.out.println("Stack contents in LIFO order: ");
        for (int i = tos; i >= 0; i--) {
            System.out.println(sta[i]);
        }
    }

    public boolean empty() {
        if (tos == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean full() {
        if (tos == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("A Stack of 100 integers is created for your use");
        StackPavan055 st = new StackPavan055();
        int opt;
        char ch;
        boolean flag;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your choice 1:Push 2:Pop 3:Display");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter the element to be pushed on to the stack");
                    int val = sc1.nextInt();
                    st.push(val);
                    break;
                case 2:
                    int val1 = st.pop();
                    System.out.println("The element popped from top of the stack is " + val1);
                    break;
                case 3:
                    st.display();
                    break;
                default:
                    System.out.println("Invalid response!");
            }
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Would you like to continue?(Y/N)");
            ch = Character.toUpperCase(sc2.next().charAt(0));
            if (ch == 'Y') {
                flag = true;
            } else if (ch == 'N') {
                flag = false;
                System.out.println("Thank you for using the Stack application!!!");
            } else {
                System.out.println("Invalid response exiting!!!");
                flag = false;
            }
        } while (flag);
    }
}