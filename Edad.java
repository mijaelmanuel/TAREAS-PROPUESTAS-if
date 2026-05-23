import java.util.Scanner;
public class Edad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        if (edad >= 0 && edad <= 12) {
            System.out.println("Categoria: Niño");
        }
        if (edad >= 13 && edad <= 17) {
            System.out.println("Categoria: Adolescente");
        }
        if (edad >= 18 && edad <= 64) {
            System.out.println("Categoria: Adulto");
        }
        if (edad >= 65) {
            System.out.println("Categoria: Adulto mayor");
        }
    }
}