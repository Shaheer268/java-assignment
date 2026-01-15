import java.util.Scanner;

public class OriginalSellingPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter discounted selling price: ");
        double discountedPrice = input.nextDouble();

        
        System.out.println("Enter discount percentage: ");
        double discountPercentage = input.nextDouble();

        
        double originalPrice = discountedPrice / (1 - (discountPercentage / 100));

        
        System.out.println("Original Selling Price = " + originalPrice);

        input.close();
    }
}
