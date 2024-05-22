import java.io.IOException;
import java.util.Scanner;
 

public class Bc1005 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dois valores de ponto flutuante
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        
        // Calcula a média ponderada dos dois valores
        double MEDIA = (A * 3.5 + B * 7.5) / 11.0;
        
        // Imprime a média com cinco dígitos após o ponto decimal
        System.out.printf("MEDIA = %.5f%n", MEDIA);
        
        scanner.close();
 
    }
 
}