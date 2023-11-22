import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //Los operadores ternarios evalúan una condición con un signo de pregunta
        //y devuelven lo que esté del lado izquierdo de los dos puntos si la condición
        //es verdadera y lo del lado derecho si la condición es falsa.
        //El dato que devuelve este operador tiene que ser del mismo tipo que la variable.

        String variable = 5 == 7 ? "Verdadero" : "Falso";
        System.out.println("variable = " + variable);

        //Ejemplo

        String estado = "";
        double promedio = 0.0;
        Scanner scanner = new Scanner(System.in);

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        System.out.println("Ingrese la nota de matemáticas entre 0.0 y 10.0");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 0.0 y 10.0");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese la nota de historia entre 0.0 y 10.0");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 7 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);
    }
}
