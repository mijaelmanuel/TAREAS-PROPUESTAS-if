import java.util.Scanner;
public class Triangulos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.print("Ingrese lado 1: ");
        lado1 = teclado.nextDouble();
        System.out.print("Ingrese lado 2: ");
        lado2 = teclado.nextDouble();
        System.out.print("Ingrese lado 3: ");
        lado3 = teclado.nextDouble();
        if (lado1 + lado2 > lado3) {
            if (lado1 + lado3 > lado2) {
                if (lado2 + lado3 > lado1) {
                    System.out.println("Si forman un triangulo");
                    if (lado1 == lado2 && lado2 == lado3) {
                        System.out.println("Triangulo equilatero");
                    }
                    if (lado1 == lado2 && lado1 != lado3) {
                        System.out.println("Triangulo isosceles");
                    }
                    if (lado1 == lado3 && lado1 != lado2) {
                        System.out.println("Triangulo isosceles");
                    }
                    if (lado2 == lado3 && lado2 != lado1) {
                        System.out.println("Triangulo isosceles");
                    }
                    if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                        System.out.println("Triangulo escaleno");
                    }
                }
            }
        }
        if (lado1 + lado2 <= lado3 ||
            lado1 + lado3 <= lado2 ||
            lado2 + lado3 <= lado1) {
            System.out.println("No forman un triangulo");
        }
    }
}