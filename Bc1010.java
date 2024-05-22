import java.util.Scanner;

public class Bc1010 {
    /**
     * @param args
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int PECAS1 = scanner.nextInt();
       int NPECAS1 = scanner.nextInt();
       double VALORES1 = scanner.nextDouble();

        Scanner scanner2 = new Scanner(System.in);

       int PECAS2 = scanner.nextInt();
       int NPECAS2 = scanner.nextInt();
       double VALORES2 = scanner.nextDouble();

       double pagamento = (NPECAS2 * VALORES2 ) + (NPECAS1 * VALORES1);

       System.out.printf("VALOR A PAGAR: R$ %.2f\n", + pagamento);
        scanner.close();



    }
}