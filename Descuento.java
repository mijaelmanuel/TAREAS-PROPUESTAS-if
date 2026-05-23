import java.util.Scanner;
public class Descuento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double compra, descuento;
        String cliente;
        System.out.print("Ingrese monto de compra: ");
        compra = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingrese tipo de cliente: (VIP O NO VIP) ");
        cliente = teclado.nextLine();
        descuento = 0;
        if (compra > 500) {
            if (cliente.equals("VIP")) {
                descuento = compra * 0.20;
            }
            if (!cliente.equals("VIP")) {
                descuento = compra * 0.10;
            }
        }
        if (compra <= 500) {
            descuento = 0;
        }
        System.out.println("Descuento: " + descuento);
    }
}