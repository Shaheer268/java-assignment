import java.util.Scanner;

public class DiscountedSellingPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter original selling price: ");
        double originalPrice = input.nextDouble();

        
        System.out.println("Enter discount percentage: ");
        double discountPercentage = input.nextDouble();

        
        double discountAmount = (originalPrice * discountPercentage) / 100;
        double discountedPrice = originalPrice - discountAmount;

        
        System.out.println("Discounted Selling Price = " + discountedPrice);

        input.close();
    }
}
