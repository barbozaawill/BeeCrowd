import java.util.Scanner;

public class Bc1011 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double RAIO = scanner.nextInt();
       double PI = 3.14159;

       double VOLUME = ((4/3.0) * PI) * (RAIO * RAIO * RAIO);
       
       System.out.printf("VOLUME = %.3f%n", + VOLUME);

        scanner.close();
    }
}