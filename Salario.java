import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;
        int años;
        System.out.print("Ingrese salario: ");
        salario = teclado.nextDouble();
        System.out.print("Ingrese años de trabajo: ");
        años = teclado.nextInt();
        if (años > 5 && salario < 2000) {
            System.out.println("Recibe bono");
        }
        if ((años > 5 && salario >= 2000) ||
            (años <= 5 && salario < 2000)) {
            System.out.println("Recibe bono menor");
        }
        if (años <= 5 && salario >= 2000) {
            System.out.println("No recibe bono");
        }
    }
}