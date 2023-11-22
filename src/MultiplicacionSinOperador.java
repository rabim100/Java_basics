import java.util.Scanner;

public class MultiplicacionSinOperador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el primero número a multiplicar");
        int num1 = scanner.nextInt();

        System.out.println("Escribe el segundo número a multiplicar");
        int num2 = scanner.nextInt();
        
        int sumador = num2;
        int resultado = 0;
        
        if(sumador < 0){
            sumador = -(sumador);
        }
    
        for (int i = 0; i < sumador; i++){
            resultado += num1;
        }
        if(num1 < 0 || num2 < 0){
            resultado = -(resultado);
        }

        System.out.println("resultado = " + resultado);
        
        
    }
}

