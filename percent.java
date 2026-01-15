import java.util.Scanner;

public class percent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double obtainedmarks;
        double totalmarks;
        double percentage;

        System.out.println("Enter your Obtained Marks");
        obtainedmarks = input.nextDouble(); 

        System.out.println("Enter your Total Marks");
        totalmarks = input.nextDouble();


        percentage = (obtainedmarks/totalmarks) * 100;

        System.out.println("The Percentage is: " + percentage + "%");





        
    }
    
}
