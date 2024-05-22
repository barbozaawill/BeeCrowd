import java.util.Scanner;

public class Bc1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos pontos (x1, y1)
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        // Leitura dos pontos (x2, y2)
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Cálculo da distância usando a fórmula
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Imprimir o resultado com 4 casas decimais
        System.out.printf("%.4f\n", distancia);

        // Fechar o Scanner
        scanner.close();
    }
}