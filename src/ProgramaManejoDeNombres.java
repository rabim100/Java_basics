import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el nombre de un familiar o amigo:");
        String nombre1 = scanner.nextLine();

        System.out.println("Escriba un segundo nombre:");
        String nombre2 = scanner.nextLine();

        System.out.println("Escriba un tercer nombre:");
        String nombre3 = scanner.nextLine();

        char segundoCaracter1 = nombre1.toUpperCase().charAt(1);
        char segundoCaracter2 = nombre2.toUpperCase().charAt(1);
        char segundoCaracter3 = nombre3.toUpperCase().charAt(1);

        String ultimosCaracteres1 = nombre1.substring(nombre1.length()-2);
        String ultimosCaracteres2 = nombre2.substring(nombre2.length()-2);
        String ultimosCaracteres3 = nombre3.substring(nombre3.length()-2);

        String mensaje = segundoCaracter1 + "." + ultimosCaracteres1 + "_" + segundoCaracter2 + "."
                + ultimosCaracteres2 + "_" + segundoCaracter3 + "." + ultimosCaracteres3;

        System.out.println(mensaje);

    }
}
