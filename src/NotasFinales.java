import java.util.Scanner;

public class NotasFinales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[20];
        int contadorMayores = 0;
        double sumaMayores = 0;
        int contadorMenores = 0;
        double sumaMenores = 0;
        int contadorTotal = 0;
        double sumaTotal = 0;

        System.out.println("Escriba 20 notas finales de alumnos en una escala de 1 a 7");

        for(int i = 0; i < 20; i++){
            System.out.println("Ingrese la nota " + (i + 1) + ".- ");
             notas[i] = scanner.nextDouble();
             if(notas[i] <= 7 && notas[i] >= 1){
                if(notas[i] > 5){
                    sumaMayores += notas[i];
                    contadorMayores++;
                }
                if(notas[i] < 4){
                    sumaMenores += notas[i];
                    contadorMenores++;
                }
                contadorTotal++;
                sumaTotal += notas[i];
             }
             else if(notas[i] > 0 && notas[i] < 1 || notas[i] > 7){
                 System.out.println("Escriba una escala del 1 al 7 por favor");
                 System.out.println();
                 i -= 1;
             }
             else{
                 System.out.println("Número no válido");
                 System.exit(0);
             }
        }
        double promedioMayores = sumaMayores/contadorMayores;
        double promedioMenores = sumaMenores/contadorMenores;
        double promedioTotal = sumaTotal/contadorTotal;

        System.out.println("El promedio de las notas mayores es de: " + promedioMayores);
        System.out.println("El promedio de las notas menores es de: " + promedioMenores);
        System.out.println("El promedio total es de: " + promedioTotal);
        System.out.println("El número de notas es de: " + contadorTotal);
    }
}
