import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        //Se pueden agregar propiedades del sistema personalizadas desde un archivo o directamente.
        //Las reglas para dichas propiedades son:
        //******Para el nombre*****+
        //Palabras compuestas separadas por puntos
        //En minúsculas
        //Valores Alfanuméricos
        //Siempre comienza con una letra
        //******* Para el valor **********
        //Caracteres alfanuméricos
        //Sin comillas
        //Sin punto y coma

        //El nombre del archivo que contenga las propiedades tiene que tener .properties al final
        try {
            FileInputStream file = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(file);
            //Otra forma de agregar propiedades:
            p.setProperty("config.texto", "Hola");

            //Aquí se cargan las nuevas propiedades:
            System.setProperties(p);

            //Aquí se enlistan:
            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.out.println("Archivo no encontrado = " + e);
        }
    }
}
