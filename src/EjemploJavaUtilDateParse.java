import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingrese una fecha con formato \"dd-MM-yyyy\"");

        //Transforma el string del formato a objeto date de java.
        try {
            Date fecha = formato.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("formato = " + formato.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            //Estos métodos sirven para comparar fechas
            if(fecha.after(fecha2)){
                System.out.println("La fecha propuesta es después de la fecha actual (fecha 2)");
            } else if (fecha.before(fecha2)) {
                System.out.println("La fecha propuesta es antes de la fecha actual (fecha 2)");
            }
            //Aunque se escriba la misma fecha, por la hora no lo va a tomar como igual
            else if (fecha.equals(fecha2)) {
                System.out.println("La fecha propuesta es igual a la fecha actual (fecha 2)");
            }

            //Otra forma:
            if(fecha.compareTo(fecha2) > 0){
                System.out.println("La fecha propuesta es después de la fecha actual (fecha 2)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("La fecha propuesta es antes de la fecha actual (fecha 2)");
            }
            //Aunque se escriba la misma fecha, por la hora no lo va a tomar como igual
            else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("La fecha propuesta es igual a la fecha actual (fecha 2)");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
