import java.util.Scanner;
import java.io.IOException;

public class Bc1009 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos valores de entrada
        String nomeVENDEDOR = scanner.next();
        double salarioFIXO = scanner.nextDouble();
        double totalVENDAS = scanner.nextDouble();  

        double comissao = totalVENDAS * 0.15;

        double totalRECEBER =  salarioFIXO + comissao;

        
        System.out.printf("TOTAL = R$ %.2f%n", totalRECEBER);
        
        scanner.close();
    }
}