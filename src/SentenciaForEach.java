public class SentenciaForEach {
    public static void main(String[] args) {
        //Sentencia for:

        for (int i = 0; i < 7; i++){
            System.out.println("i = " + i);
        }

        //Sentencia for each:
        String[] nombres= {"Rodolfo", "Afres", "Bicho", "Cindy", "Andrea", "Fernando", "Don Pito", "Mamón"};

        //Esta sentencia solo recorre el valor de los arreglos u objetos:

        for(String nom: nombres){
            System.out.println("nombre = " + nom);
        }
    }
}
