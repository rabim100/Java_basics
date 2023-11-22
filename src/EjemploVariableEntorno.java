import java.nio.file.Path;
import java.util.Map;

public class EjemploVariableEntorno {
    public static void main(String[] args) {

        //Primero se puede crear un mapa de las variables de entorno existetes:

        Map<String, String> varent = System.getenv();
        System.out.println("variables de entorno = " + varent);

        //También se pueden listar con un for each:

        for(String key: varent.keySet()){
            System.out.println(key + "=>" + varent.get(key));
        }

        //Las variables de entorno se pueden obtener una a una de esta manera:

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        //Otra forma de obtener dichas variables es desde el mapa:
        String path = varent.get("Path");
        System.out.println("path = " + path);

        //las variables de entorno son en mayúscula y separadas por guiones bajos.
        //Para crear una se puede ir a variables de entorno desde windows o con la consola
        //usando el comando setx NOMBRE_DE_LA_VARIABLE "Valor de la variable"
        //Para relejar la variable de ambiente que se ha creado, hay que reiniciar el IDE.
    }
}
