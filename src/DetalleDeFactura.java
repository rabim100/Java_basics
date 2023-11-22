import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre de la factura:");
        String mensaje = scanner.nextLine();
        double Precio1 = 0;
        double Precio2 = 0;

        try {
            System.out.println("Escriba el precio de un producto");
            Precio1 = scanner.nextDouble();
            System.out.println("Escriba el precio del siguiente producto");
            Precio2 = scanner.nextDouble();
        }catch (Exception e){
            System.out.println("Error escriba un número");
            main(args);
            System.exit(0);
        }

        double totalBruto = Precio2 + Precio1;
        double impuesto = totalBruto*0.19;
        double totalNeto = totalBruto + impuesto;

        System.out.println("La factura " + mensaje + " tiene un total bruto de " + totalBruto + ", con un impuesto de "
        + impuesto + " y el monto después de impuesto es de " + totalNeto);

    }
}
