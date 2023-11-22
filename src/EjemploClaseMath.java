public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(1,5.6514);
        System.out.println("max = " + max);

        float min = Math.min(4.3f, 89.645f);
        System.out.println("min = " + min);

        //redondear hacia arriba
        double redondearHaciaArriba = Math.ceil(4.41651);
        System.out.println("redondearHaciaArriba = " + redondearHaciaArriba);

        //redondear hacia abajo
        double redondearHaciaAbajo = Math.floor(4.71651);
        System.out.println("redondearHaciaAbajo = " + redondearHaciaAbajo);
        
        //redondear
        double redondear = Math.round(3.49);
        System.out.println("redondear = " + redondear);

        double pi = Math.PI;
        double e = Math.E;
        System.out.println("e = " + e);
        System.out.println("pi = " + pi);

        //e^algo:
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        //logaritmo natural
        double loge = Math.log(10);
        System.out.println("loge = " + loge);

        double potencia = Math.pow(2, 4);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(4);
        System.out.println("raiz = " + raiz);

        //radianes a grados
        double degrees = Math.toDegrees(2*Math.PI);
        System.out.println("degrees = " + degrees);

        //grados a radianes
        double radianes = Math.toRadians(180);
        System.out.println("radianes = " + radianes);
        
        //seno: se usan radianes
        double seno = Math.sin(radianes);
        System.out.println("seno = " + seno);
        
        //coseno en rad
        double coseno = Math.cos(radianes);
        System.out.println("coseno = " + coseno);
        
        //tangente
        double tangente = Math.tan(radianes);
        System.out.println("tangente = " + tangente);
    }
}
