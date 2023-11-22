import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese un nombre completo (nombre y apellido)");
        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese un segundo nombre completo (nombre y apellido)");
        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese un tercer nombre completo (nombre y apellido)");

        String max = nombre1.split("")[0].length() < nombre2.split("")[0].length() ? nombre2 : nombre1;
        max = max.split("")[0].length() < nombre3.split("")[0].length() ? nombre3 : max;

        System.out.println("max = " + max);

        /*String[] cadena1 = nombre1.split(""));
        String[] cadena2 = nombre2.split("");
        String[] cadena3 = nombre3.split("");

       int caracteres1 = cadena1.length;
        int caracteres2 = cadena2.length;
        int caracteres3 = cadena3.length;
        
        int max = caracteres1 > caracteres2 ? caracteres1 : caracteres2;
        max = max > caracteres3 ? max : caracteres3;

        if(max == caracteres1){
            System.out.println(nombre1 + " tiene el nombre más largo");
        }
        else if(max == caracteres2){
            System.out.println(nombre2 + " tiene el nombre más largo");
        }
        else{
            System.out.println(nombre3 + " tiene el nombre más largo");
        }*/


    }
}
