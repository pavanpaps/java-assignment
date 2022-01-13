import java.util.Scanner;

class BankPavan055 {
    String name;
    String addr;
    int accno;
    String type;
    int bal;
    static Scanner sc;

    public BankPavan055(Scanner scanner) {
        sc = scanner;
        System.out.println("Welcome to the banking application 😊 ");
        System.out.print("Enter the customer's name: ");
        name = sc.nextLine();
        System.out.print("Enter the address: ");
        addr = sc.nextLine();
        System.out.print("Enter your account type: ");
        type = sc.nextLine();
        System.out.print("Enter your account number: ");
        accno = sc.nextInt();
        System.out.print("Enter the initial balance: ");
        bal = sc.nextInt();
    }

    public void deposit() {
        System.out.println("Enter the amount to be deposited");
        int amt = sc.nextInt();
        bal = bal + amt;
        System.out.println("Thank you for depositing");
        System.out.println("Your current balance is: " + bal);
    }

    public void withdraw() {
        System.out.println("Enter the amount to be Withdrawn");
        int amt = sc.nextInt();
        bal = bal - amt;
        System.out.println("Please collect your cash");
        System.out.println("Your current balance is: " + bal);
    }

    public void checkbal() {
        System.out.println("Account number: " + accno + "\nBalance: " + bal);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + addr);
        System.out.println("Account type: " + type);
        System.out.println("Account Number: " + accno);
        System.out.println("Balance: " + bal);
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        BankPavan055 cu = new BankPavan055(inp);
        System.out.println("Welcome to the banking application! Your details are given below");
        cu.display();
        int opt;
        char ch;
        boolean keepOnGoing;
        do {
            System.out.println("Enter your choice");
            System.out.println("1:Deposit 2:Withdrawal 3.Check Balance 4.Display");
            opt = inp.nextInt();
            switch (opt) {
                case 1:
                    cu.deposit();
                    break;
                case 2:
                    cu.withdraw();
                    break;
                case 3:
                    cu.checkbal();
                    break;
                case 4:
                    cu.display();
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            System.out.println("Would you like to continue (Y/N)?");
            ch = Character.toUpperCase(inp.next().charAt(0));
            if (ch == 'Y') {
                keepOnGoing = true;
            } else if (ch == 'N') {
                keepOnGoing = false;
                System.out.println("Thank you for using the application!!!!");
            } else {
                System.out.println("Invalid Response exiting !!!");
                keepOnGoing = false;
            }
        } while (keepOnGoing);
        inp.close();
    }
}