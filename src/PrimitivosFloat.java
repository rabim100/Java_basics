public class PrimitivosFloat {
    public static void main(String[] args) {
        //Para tipo flotante, se tiene que escribir una f al final del número al escribirlo con decimales
        //para que el compilador no crea que es un double:
        float num = 1.2f;
        //También se puede usar los números en forma exponencial:
        float num2 = 2.5e5f;
        System.out.println(num2);

        //Utilizando la clase Wrapper de este primitivo se puede saber:
        //Clase Wrapper: Es el tipo de dato comenzando en mayúscula el cual es una clase que tiene
        //métodos e información del tipo de dato al que se refiere.

        System.out.println("num2 = " + num2);
        System.out.println("float corresponde en byte a  = " + Float.BYTES);
        System.out.println("float corresponde en bites a  = " + Float.SIZE);
        System.out.println("máximo valor para float  = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float  = " + Float.MIN_VALUE);
    }
}
