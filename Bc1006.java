import java.util.Scanner;
import java.io.IOException;
 

public class Bc1006 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dois valores de ponto flutuante
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        
        // Calcula a média ponderada dos dois valores
        double MEDIA = (A * 2 + B * 3 + C * 5) / 10;
        
        // Imprime a média com cinco dígitos após o ponto decimal
        System.out.printf("MEDIA = %.1f%n", MEDIA);
        
        scanner.close();
 
    }
 
}