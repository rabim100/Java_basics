import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Escribe una fecha de nacimiento en el formato \"dd-MM-yyyy\"");

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date fecha = formato.parse(s.next());

            Date fechaActual = new Date();

            long tiempoTranscurrido = fechaActual.getTime() - fecha.getTime();
            long edad = (((((tiempoTranscurrido/1000)/60)/60)/24)/360);
            System.out.println("edad = " + edad);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
