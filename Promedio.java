import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;
        System.out.print("Ingrese nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.print("Ingrese nota 2: ");
        nota2 = teclado.nextDouble();
        System.out.print("Ingrese nota 3: ");
        nota3 = teclado.nextDouble();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Promedio: " + promedio);
        if (promedio >= 11) {
            System.out.println("Aprobado");
        }
        if (promedio < 11 && promedio > 8) {
            System.out.println("Recuperacion");
        }
        if (promedio <= 8) {
            System.out.println("Desaprobado");
        }
    }
}