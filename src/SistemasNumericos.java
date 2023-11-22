public class SistemasNumericos {
    public static void main(String[] args) {
        //Sistema decimal
        int decimal = 45;
        //Sistema binario (Se antepone un 0b)
        int binario = 0b1010001;
        //Sistema octal (se antepone un 0)
        int octal = 0567;
        //Sistema hexadecimal (se antepone un 0x)
        int hexadecimal = 0x5a45;

        //Todos los valores imprimen su equivalencia en decimal en la consola:
        System.out.println("hexadecimal = " + hexadecimal);
        System.out.println("octal = " + octal);
        System.out.println("binario = " + binario);

        //Para conversiones está la clase Integer:
        System.out.println("Número hexadecimal de " + decimal + " = " + Integer.toHexString(decimal));

    }
}
