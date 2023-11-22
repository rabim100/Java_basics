import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        //Hoja de datos en Simpledateformat java 19 en google
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy 'a' HH:mm:ss zzzz");
        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for (int i = 0; i < 1000000000; i++){
            j += i;
        }

        Date fecha2 = new Date();
        //getTime() obtine los milisegundo transcurridos desde 1970, por lo que restar estos dos objetos nos da los milisegundos
        //transcurridos en el for
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en ms = " + tiempoFinal);

    }
}
