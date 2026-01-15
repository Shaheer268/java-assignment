import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input length of first parallel side
        System.out.print("Enter length of first parallel side (a): ");
        double a = sc.nextDouble();

        // Input length of second parallel side
        System.out.print("Enter length of second parallel side (b): ");
        double b = sc.nextDouble();

        // Input height (perpendicular distance)
        System.out.print("Enter height (h): ");
        double h = sc.nextDouble();

        // Calculate area of trapezoid
        double area = h * (a + b) / 2;

        // Output result
        System.out.println("Area of the trapezoid = " + area);

        sc.close();
    }
}
