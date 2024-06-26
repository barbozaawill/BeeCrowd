import java.util.Scanner;

public class Bc1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1 = scanner.nextLine();
        String palavra2 = scanner.nextLine();
        String palavra3 = scanner.nextLine();

        identificarAnimal(palavra1, palavra2, palavra3);

        scanner.close();
    }

    public static void identificarAnimal(String palavra1, String palavra2, String palavra3) {
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else { // onivoro
                    System.out.println("pomba");
                }
            } else { // mamifero
                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                } else { // herbivoro
                    System.out.println("vaca");
                }
            }
        } else { // invertebrado
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                } else { // herbivoro
                    System.out.println("lagarta");
                }
            } else { // anelideo
                if (palavra3.equals("onivoro")) {
                    System.out.println("minhoca");
                } else { // hematofago
                    System.out.println("sanguessuga");
                }
            }
        }
    }
}
