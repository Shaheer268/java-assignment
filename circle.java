import java.util.Scanner;

public class circle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        
        System.out.println("Enter Radius");
        radius = input.nextDouble();

        circumference = 2 * Math.PI * radius;

        area = Math.PI * Math.pow(radius,2);

        System.out.println("circumference is this: " + circumference);
        
 
        System.out.println("Area is this: " + area);
        











    }
}