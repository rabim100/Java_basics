public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int suma = 0;

        // Para usar operaciones aritméticas con los tipo referencia el compilador realiza autounboxing.
        for (Integer i : enteros) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
