import java.util.Scanner;

public class ShoppingPavan055 {

    int count;
    double code[] = new double[100];
    double cost[] = new double[100];

    public ShoppingPavan055() {
        count = 0;
    }

    public void additem() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the code number: ");
        code[count] = inp.nextDouble();
        System.out.println("Enter the price: ");
        cost[count] = inp.nextDouble();
        count++;
        System.out.println();
        System.out.println();
    }

    public void delete() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the item code to be deleted: ");
        double c = inp.nextDouble();
        for (int i = 0; i < count; i++) {
            if (code[i] == c)
                cost[i] = 0;
        }
        System.out.println("Done!!");
    }

    public double display() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + cost[i];
        }

        System.out.println("ItemCode\tPrice");
        for (int i = 0; i < count; i++) {
            System.out.print(code[i] + "\t" + cost[i] + "\n");
        }

        System.out.println("Total Cost = " + sum);
        System.out.println("_______");
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Shopping application, Happy Shopping");
        ShoppingPavan055 s = new ShoppingPavan055();
        int opt;
        Scanner inp = new Scanner(System.in);
        char ch;
        boolean flag;
        double sum1 = 0;
        do {
            System.out.println(
                    "Enter your choice\n1:Adding an item\n2:Deleting an item\n3:Displaying the details and total cost");
            opt = inp.nextInt();
            switch (opt) {

                case 1:
                    s.additem();
                    break;
                case 2:
                    s.delete();
                    break;
                case 3:
                    sum1 = s.display();
                    break;
                default:
                    System.out.println("Invalid response!");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Would you like to continue?(Y/N)");
            ch = Character.toUpperCase(sc.next().charAt(0));
            if (ch == 'Y') {
                flag = true;
            } else if (ch == 'N') {
                flag = false;
                System.out.println("Please Pay your bill" + sum1 + "," + "Thank you for shopping!!!");
            } else {
                System.out.println("Invalid response exiting!!!");
                flag = false;
            }
        } while (flag);
    }
}