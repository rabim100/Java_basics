import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        //Es una clase abstracta. No se crea con new.

        Calendar calendar = Calendar.getInstance();

        //Se puede modificar la fecha y hora de distintas maneras:
        //calendar.set(2000, Calendar.NOVEMBER, 19, 21, 55, 16);

        //Otra forma:
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 19);

        //calendar.set(Calendar.HOUR_OF_DAY, 21);
        //Se usará la forma en la que se puede poner am o pm:
        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.PM);
        calendar.set(Calendar.MINUTE, 55);
        calendar.set(Calendar.SECOND, 16);
        calendar.set(Calendar.MILLISECOND, 23);

        //Este objeto obtiene la fecha de la clase date
        Date fecha = calendar.getTime();
        System.out.println("fecha sin formato = " + fecha);

        //Para formato de 24h es HH pero en formato de 12h es con minúscula: hh
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato = df.format(fecha);

        System.out.println("fecha con formato = " + fechaConFormato);
    }
}
