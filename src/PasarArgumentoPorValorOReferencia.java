class Persona{
    private String nombre;

    public void modificarNombre(String nombre){
        this.nombre = nombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}
 class PasarArgumentoPorValorOReferencia {
    public static void main(String[] args) {
        //Este código es una prueba para que se vea qué tipos de datos son inmutables y no les afectan cambios fuera
        //de main. Tanto los primitivos como los Wrappers son información que se duplica, por lo que no cambian si
        //esta información es modificada en otros métodos. Cuando se cambia esta información por referencia, en el caso
        // de la clase personalizada y los arreglos, la información sí que cambia.
        int[] arreglo = {1,2,3,4,5};
        int numero = 45;
        Integer numero2 = 45;
        Persona persona = new Persona();
        persona.modificarNombre("Rodolfo");
        System.out.println("Se inicia el método main");
        for(int arr: arreglo){
            System.out.println("arreglo = " + arr);
        }
        System.out.println("numero = " + numero);
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        test1(arreglo);
        test2(numero, numero2);
        test3(persona);
        System.out.println("Después de llamar al método test");

        for(int arr: arreglo){
            System.out.println("arreglo = " + arr);
        }
        System.out.println("numero = " + numero);
        System.out.println("numero2 = " + numero2);
        System.out.println("persona = " + persona.leerNombre());
    }

    public static void test1(int[] Arr){
        System.out.println("Inicia método test1");
        for (int i = 0; i < Arr.length; i++){
            Arr[i] += 20;
        }
        System.out.println("Finaliza método test1");
    }

     public static void test2(int num, Integer num2){
         System.out.println("Inicia método test2");
         num += 10;
         num2 += 10;
         System.out.println("num = " + num);
         System.out.println("num2 = " + num2);
         System.out.println("Finaliza método test2");
     }

     public static void test3(Persona persona){
         System.out.println("Inicia método test3");
         persona.modificarNombre("Pene");
         System.out.println("Finaliza método test3");
     }
}
