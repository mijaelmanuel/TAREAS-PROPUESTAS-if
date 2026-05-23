import java.util.Scanner;
public class Acceso {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario;
        int contraseña;
        System.out.print("Ingrese usuario: ");
        usuario = teclado.nextLine();
        System.out.print("Ingrese contraseña: ");
        contraseña = teclado.nextInt();
        if (usuario.equals("admin")) {
            if (contraseña == 1234) {
                System.out.println("Acceso correcto");
            }
            if (contraseña != 1234) {
                System.out.println("Acceso denegado");
            }
        }
        if (!usuario.equals("admin")) {
            System.out.println("Acceso denegado");
        }
    }
}