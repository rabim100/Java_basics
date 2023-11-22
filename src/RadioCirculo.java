import java.util.Scanner;

public class RadioCirculo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Escriba el radio");
        double r= s.nextDouble();

        double area = Math.PI*Math.pow(r, 2);
        System.out.println("area = " + area);
    }
}
