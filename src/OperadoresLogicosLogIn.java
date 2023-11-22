import java.util.Scanner;

public class OperadoresLogicosLogIn {
    public static void main(String[] args) {

        /*String[] usuarios = new String[3];
        usuarios[0] = "Rodolfo";
        usuarios[1] = "Andres";
        usuarios[2] = "Francisco";

        String[] passwords = new String[3];
        passwords[0] = "1234";
        passwords[1] = "12345";
        passwords[2] = "4321";*/

        //Otra forma:
        String[] usuarios = {"Rodolfo", "Andres", "Francisco"};
        String[] passwords = {"1234", "12345", "4321"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre de usuario:");
        String u = scanner.nextLine().trim();

        System.out.println("Ingrese la contraseña");
        String p = scanner.nextLine().trim();

       /* Boolean u1 = u.equals(usuario), u2 = u.equals(usuario2);
        Boolean p1 = p.equals(contrasena1), p2 = p.equals(contrasena2);*/

        Boolean autenticado = false;

        for(int i = 0; i <usuarios.length; i++){
            if(u.equals(usuarios[i]) && p.equals(passwords[i])) {
                autenticado = true;
                break;
            }
        }
        if(autenticado){
            System.out.println("Bienvenido ".concat(u).concat("!"));
        }
        else {
            System.out.println("Usuario o contraseña incorrectos!");
        }

    }
}
