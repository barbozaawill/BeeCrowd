import java.util.Scanner;

public class Bc1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Lendo os valores reais        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        //verificando se os valores formam um triangulo
        if (a + b > c && a + c > b && b + c > a) {
            //Calculando o perímetro
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            //Calculando a área do trapezio
            double area = ((a + b) * c) / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }
scanner.close();

    }
}