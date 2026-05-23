import java.util.Scanner;
public class Año{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año;
        System.out.print("Ingrese un año: ");
        año = teclado.nextInt();
        if (año % 4 == 0 && año % 100 != 0) {
            System.out.println("El año es bisiesto");
        }
        if (año % 400 == 0) {
            System.out.println("El año es bisiesto");
        }
        if ((año % 4 != 0) || (año % 100 == 0 && año % 400 != 0)) {
            System.out.println("El año no es bisiesto");
        }
    }
}