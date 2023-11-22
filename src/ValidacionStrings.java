public class ValidacionStrings {
    public static void main(String[] args) {
         String palabra = null;

         //Checa si el string es nulo
         Boolean esNulo = palabra == null;
        if(esNulo){
            System.out.println("El objeto es nulo");
            System.exit(0);
        }

         //Checa si el string está vacío
         Boolean esVacio = palabra.isEmpty();
         //Checa si el string es blanco
         Boolean esBlanco = palabra.isBlank();


         if(esVacio){
             System.out.println("El string está vacío");
         }
         if(esBlanco){
             System.out.println("El string solo tiene espacios vacíos");
         }
         if(!esNulo && !esVacio && !esBlanco){
             System.out.println("palabra = " + palabra);
         }

    }
}
