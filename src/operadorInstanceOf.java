public class operadorInstanceOf {
    public static void main(String[] args) {

        String valor = "xd";
        Integer num = 3;
        Boolean x = true;

        //Este operador verifica si la un objeto es una instancia de una clase.
        //La clase Number es la clase padre de Integer, Double, Short, etc.
        //La clase Object es la clase padre de todas las clases.

        boolean verificacion = valor instanceof String;
        boolean verificacion2 = valor instanceof Object;
        boolean verificacion3 = num instanceof Integer;
        boolean verificacion4 = num instanceof Number;
        boolean verificacion5 = num instanceof Object;

        System.out.println("verificacion 5 = " + verificacion);
        System.out.println("verificacion 4 = " + verificacion2);
        System.out.println("verificacion 3 = " + verificacion3);
        System.out.println("verificacion 2 = " + verificacion4);
        System.out.println("verificacion 1 = " + verificacion5);

    }
}
