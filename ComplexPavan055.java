import java.util.Scanner;

public class ComplexPavan055 {
    double x, y;

    public ComplexPavan055(double a, double b) {
        x = a;
        y = b;
        System.out.println("Absolute Value:" + absolute());
    }

    public double absolute() {
        return Math.sqrt((x * x) + (y * y));
    }

    public static void add(ComplexPavan055 c1, ComplexPavan055 c2) {
        double real = c1.x + c2.x;
        double img = c1.y + c2.y;
        if (img < 0)
            System.out.println("Sum of the Complex numbers = " + real + "-" + (img * -1) + "i");
        else
            System.out.println("Sum of the Complex numbers = " + real + "+" + img + "i");
    }

    public static void multiply(ComplexPavan055 c1, ComplexPavan055 c2) {
        double real = c1.x * c2.x + c1.y * c2.y * -1;
        double img = c1.x * c2.y + c2.x * c1.y;
        if (img < 0)
            System.out.println("Product of the complex numbers = " + real + "-" + (img * -1) + "i");
        else
            System.out.println("Product of the complex numbers = " + real + "+" + img + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real value of complex number 1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter the imaginary value of Complex number 1: ");
        double y1 = sc.nextDouble();
        ComplexPavan055 c1 = new ComplexPavan055(x1, y1);
        System.out.println(" ");
        System.out.print("Enter the real value of complex number 2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter the imaginary value of Complex number 2: ");
        double y2 = sc.nextDouble();
        ComplexPavan055 c2 = new ComplexPavan055(x2, y2);
        System.out.println(" ");
        add(c1, c2);
        multiply(c1, c2);
    }
}