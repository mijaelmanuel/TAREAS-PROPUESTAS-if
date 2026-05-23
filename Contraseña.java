import java.util.Scanner;
public class Contraseña {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contraseña;
        System.out.print("Ingrese la contraseña: ");
        contraseña = teclado.nextInt();
        if (contraseña > 1000 && contraseña < 9999) {
            System.out.println("Contraseña válida");
        }
        if (contraseña <= 1000 || contraseña >= 9999) {
            System.out.println("Contraseña inválida");
        }
    }
}