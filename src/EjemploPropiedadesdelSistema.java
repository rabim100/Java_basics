import java.util.Properties;

public class EjemploPropiedadesdelSistema {
    public static void main(String[] args) {
        //Documentación en "java system getproperties" en google
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("java.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineseparator = System.getProperty("line.separator");
        //o
        String lineseparator2 = System.lineSeparator();

        System.out.println("lineseparator = " + lineseparator + "la línea ha sido separada");
        System.out.println("lineseparator2 = " + lineseparator2 + "la línea ha sido separada");
        System.out.println("lineseparator3 = " + "\n" + "la línea ha sido separada");

        //Para listar todas:
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
