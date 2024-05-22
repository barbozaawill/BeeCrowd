import java.util.Scanner;

public class Bc1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePositivos = 0;

        for ( int i = 0; i < 6; i++) {
            double valor = scanner.nextDouble();
            if (valor > 0) {
                quantidadePositivos++;
            } else {

            }
        }
        System.out.println(quantidadePositivos + " valores positivos foram lidos"); 
        scanner.close();
    }
}
