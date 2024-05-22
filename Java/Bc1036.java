import java.util.Scanner;

public class Bc1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double a, b, c;
        double delta, x1, x2;
        
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        
        delta = b * b - 4 * a * c;
        
        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);
        }
        
        scanner.close();
    }
}