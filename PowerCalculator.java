import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter voltage (volts): ");
        double voltage = input.nextDouble();

        
        System.out.println("Enter current (amperes): ");
        double current = input.nextDouble();

        
        double watts = voltage * current;

        
        System.out.println("Power (Watts) = " + watts);

        input.close();
    }
}
