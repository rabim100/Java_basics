import java.util.Scanner;

public class SwitchCaseNumeroDias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numdias = 0;
        System.out.println("Escribe el número del mes del 1 - 12");
        int mes = scanner.nextInt();

        System.out.println("Escriba el año");
        int anio = scanner.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> numdias = 31;
            case 4, 6, 9, 11 -> numdias = 30;
            case 2 -> {
                if (anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0))) {
                    numdias = 29;
                } else {
                    numdias = 28;
                }
            }
            default -> System.out.println("Mes desconocido");
        }

        System.out.println("Los días del mes son: " + numdias);
    }
}
