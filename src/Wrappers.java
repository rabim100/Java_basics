public class Wrappers {
    public static void main(String[] args) {
        //Esta forma de llamarlo se llama unboxing:
        Integer Objeto1 = Integer.valueOf(1234);

        //Esta forma se llama autoboxing:
        Integer Objeto2 = 1234;

        //Estos dos ya son objetos de la clase integer.

        //Convertir un objeto a un primitivo:
        int primitivo = Objeto1;
        int primitivo2 = Objeto2.intValue();

        //De un String a un integer:
        String string = "12345";
        Integer valor = Integer.valueOf(string);
    }
}
