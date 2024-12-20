public class CalcularAreas {

    public static double Cubo (double num1){
        double resultado = Math.pow(num1, 3);
       return resultado;
    }

    public static double Paralelepipedo(double num1, double num2, double num3){
        double resultado = num1 * num2 * num3;
        return resultado;
    }

    public static double Esfera(double num4){
        double resultado = Math.round((4.0/3.0) * Math.PI * Math.pow(num4, 3));
       return resultado;
    }
}