public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        //Retorna un objeto del tipo Process para iniciar una aplicación desde java
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        //segundo paso, validar sistema operativo
        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                //Si es windows, abre el notepad. Este comando necesita try catch
                proceso = rt.exec("notepad");
            }else {
                //Si es otro sistema operativo:
                proceso = rt.exec("gedit");
            }
            //Esto espera a que el notepad se cierre.
            proceso.waitFor();
        }catch (Exception e){
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
    }
}
