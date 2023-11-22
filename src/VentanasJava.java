import javax.swing.*;

public class VentanasJava {
    public static void main(String[] args) {
        //Usando la conversión de sistemas numéricos se hará una pequeña aplicación

        //JOptionPane es la GUI de java llamada swing, la cual tiene como métodos diferentes ventanas. Esta ventana
        //despliega un mensaje y acepta un input del usuario. En este caso se espera recibir un entero, el cual
        //se devuelve como string.
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        //Para realizar lo mismo pero en consola se utiliza la clase Scanner:
        //Primero se instancía el objeto de la clase scanner:
        //Scanner scanner = new Scanner(System.in)
        //Después se imprime con System.out.println()
        //Después se escanea la siguiente línea:
        //String numeroStr = scanner.nextline();
        //Para escanerase directamente como entero:
        //String numeroStr = scanner.nextInt();
        int numeroDecimal = 0;

        //El try catch es un sistema de manejo de errores donde si detecta el error puesto en el catch, el código
        // no prosigue, si no que se ejecuta lo que está dentro del catch.
        //En este caso si no se escribe un número entero, la conversión dentro del try no es posible, por lo que arroja un error
        try {
            //Esto sirve para convertir un string en entero
            numeroDecimal = Integer.parseInt(numeroStr);
            //Cabe aclarar que si se usa el método de escanear el número directamente desde la consola y convertirlo a int directo,
            //El error es diferente.
            //El error Exception es el que maneja todos los errores, es decir, el más general, por lo que funcionará con
            // todo tipo de error
        }catch (NumberFormatException error){
            //Esta línea es para desplegar el mensaje de error en una ventana
            JOptionPane.showMessageDialog(null,"Ingrese un número decimal");
            //Esta línea sirve para ejecutar la función main de nuevo.
            main(args);
            //Esta línea sirve para una vez se ejecute la función main correctamente el código termine aquí.
            System.exit(0);
        }

        String mensajeBinario = "El número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "El número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "El número Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario + "\n" + mensajeOctal + "\n" + mensajeHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
