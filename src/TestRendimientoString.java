public class TestRendimientoString {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        //La clase más eficiente para strings
        StringBuilder sb = new StringBuilder(a);

        // Esta línea empieza a contar el tiempo en milisegundos y lo guarda en la variable
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //100000 -> 3704ms
            //c += a + b + "\n"; //100000 -> 1368ms
            //sb.append(a).append(b).append("\n"); //100000 -> 5ms
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
