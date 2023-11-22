import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un número");
        double num1 = scanner.nextDouble();

        System.out.println("Escribe un segundo número");
        double num2 = scanner.nextDouble();

        String max = num1 < num2 ? "El número mayor es: " + num2 : "El número mayor es: " + num1;
        System.out.println(max);
    }
}
