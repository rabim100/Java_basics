public class EtiquetasEnLoops {
    public static void main(String[] args) {

        //Las etiquetas sirven para definir a qué bucle las palabaras clave continue o break se refieren.
        bucle1: for (int i = 0; i < 5; i++){
            System.out.println();
            for (int j = 0; j < 5; j++){
                if(i == 3){
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "] ");
            }
        }

        System.out.println("\n==================================================================");
        bucle1: for (int i = 0; i < 5; i++){
            System.out.println();
            for (int j = 0; j < 5; j++){
                if(i == 3){
                    break bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "] ");
            }
        }
    }
}
