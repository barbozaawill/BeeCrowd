import java.util.Scanner;

public class Bc1019 {
    public static void main(String[] args) {
        // Criar um Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        // Ler o valor inteiro de segundos
        int segundos = scanner.nextInt();

        // Calcular horas, minutos e segundos
        int horas = segundos / 3600;
        segundos %= 3600;
        int minutos = segundos / 60;
        segundos %= 60;

        // Imprimir o resultado no formato desejado
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        // Fechar o Scanner
        scanner.close();
    }
}