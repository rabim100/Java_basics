import java.util.Random;

public class NumerosRandom {
    public static void main(String[] args) {
        //*********CLASE MATH**********************
        System.out.println("Clase Math");
        //El método random de la clase math te da un número entre 0 y 1
        double random = Math.random();
        System.out.println("random = " + random);
        
        random *= 100;
        System.out.println("random = " + random);

        //Ejemplo de colores aleatorios:
        String[] colores = {"azul", "negro", "verde", "rojo", "naranja", "blanco", "morado"};
        random /= 100;
        random *= colores.length;
        random = Math.floor(random);
        System.out.println("colores[(int)random] = " + colores[(int)random]);

        //*******OBJETO RANDOM SE JAVA UTIL*************
        System.out.println("Objeto random");

        Random rand = new Random();
        //Retorna un entero entre 2^32 en negativo y positivo
        int randomINT = rand.nextInt();
        System.out.println("randomINT = " + randomINT);
        //Si se le asigna un número límite, otorgará un valor entre cero y ese rango
        int rangoDesdeCero = rand.nextInt(20);
        System.out.println("rangoDesdeCero = " + rangoDesdeCero);
        //Para un rango específico:
        //Rango entre 10 y 20
        int rangoEspecifico = 10 + rand.nextInt(20-10);
        System.out.println("rangoEspecifico = " + rangoEspecifico);

        //Para imprimir colores:
        int rango = rand.nextInt(colores.length);
        System.out.println("color = " + colores[rango]);
    }
}
