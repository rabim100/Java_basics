import java.util.Scanner;

public class TanqueDeGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe la cantidad de litros en el tanque");
        double litros = scanner.nextDouble();

        boolean lleno = litros == 70;
        boolean casiLleno = litros < 70 && litros >= 60;
        boolean tresCuartos = litros < 60 && litros >= 40;
        boolean medio = litros < 40 && litros >= 35;
        boolean suficiente = litros < 35 && litros >= 20;
        boolean insuficiente = litros < 20 && litros >= 1;

        if (lleno) {
            System.out.println("Estanque lleno");
        }
        if (casiLleno) {
            System.out.println("Estanque casi lleno");
        }
        if (tresCuartos) {
            System.out.println("Estanque 3/4");
        }
        if (medio) {
            System.out.println("Medio estanque");
        }
        if (suficiente) {
            System.out.println("Suficiente");
        }
        if (insuficiente) {
            System.out.println("Insuficiente");
        }

    }
}