import java.util.Scanner;
import java.io.IOException;

public class Bc1008 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos valores de entrada
        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorPorHora = scanner.nextDouble();
        
        // Cálculo do salário do funcionário
        double salario = horasTrabalhadas * valorPorHora;
        
        // Impressão do número do funcionário e do salário formatado
        System.out.printf("NUMBER = %d%n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        
        scanner.close();
    }
}