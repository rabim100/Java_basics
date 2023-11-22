import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe 10 valores numéricos enteros");
        int[] numeros = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),
                scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),
                scanner.nextInt(),scanner.nextInt(),};
        /*int[] numeros = new int[10];
        numeros[0] = scanner.nextInt();
        numeros[1] = scanner.nextInt();
        numeros[2] = scanner.nextInt();
        numeros[3] = scanner.nextInt();
        numeros[4] = scanner.nextInt();
        numeros[5] = scanner.nextInt();
        numeros[6] = scanner.nextInt();
        numeros[7] = scanner.nextInt();
        numeros[8] = scanner.nextInt();
        numeros[9] = scanner.nextInt();*/

        int menor = numeros[0];
        for(int i = 0; i < numeros.length - 1; i++){

            if(menor < numeros[i + 1]){
                continue;
            }
            menor = numeros[i+1];
        }

        System.out.println("El número menor es " + menor);
        if(menor < 10){
            System.out.println("El número menor es menor que 10!");
        }
        else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }
    }
}



