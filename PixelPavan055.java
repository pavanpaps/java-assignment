// Java program change RGB Color
// Model to HSV Color Model
import java.util.Scanner;

class PixelPavan055 { 
    double r;
    double g;
    double b;

    public PixelPavan055(Scanner sc) {

        // R, G, B values are divided by 255
        // to change the range from 0 to 255 to 0 to 1

        System.out.print("Enter Red Colour: ");
        r = sc.nextDouble();
        r = r / 255.0;

        System.out.print("Enter Green Colour: ");
        g = sc.nextDouble();
        g = g / 255.0;

        System.out.print("Enter Blue Colour: ");
        b = sc.nextDouble();
        b = b / 255.0;
    }

    public void HSVcalculator() {

        // h, s, v = hue, saturation, value
        double max = Math.max(r, Math.max(g, b)); // maximum of r, g, b
        double min = Math.min(r, Math.min(g, b)); // minimum of r, g, b
        double diff = max - min; // diff of max and min.
        double h = 0, s = 0;

        if (max == min)
            h = 0;

        // if max equal r then compute h
        else if (max == r)
            h = (60 * ((g - b) / diff) + 360) % 360;

        // if max equal g then compute h
        else if (max == g)
            h = (60 * ((b - r) / diff) + 120) % 360;

        // if max equal b then compute h
        else if (max == b)
            h = (60 * ((r - g) / diff) + 240) % 360;

        // if max equal zero
        if (max == 0)
            s = 0;
        else
            s = (diff / max) * 100;

        // compute v
        double v = max * 100;

        // Print all the stuff
        System.out.println("Hue (H): " + h + " degrees");
        System.out.println("Saturation (S): " + s + "%");
        System.out.println("Value (V): " + v + "%");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PixelPavan055 inp = new PixelPavan055(sc);
        inp.HSVcalculator();
    }
}