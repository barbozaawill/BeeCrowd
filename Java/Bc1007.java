import java.util.Scanner;
import java.io.IOException;
 

public class Bc1007 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dois valores de ponto flutuante
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        // Calcula a média ponderada dos dois valores
        int DIFERENCA = (A * B - C * D);
        
        System.out.println("DIFERENCA = " + DIFERENCA);
        scanner.close();
 
    }
 
}