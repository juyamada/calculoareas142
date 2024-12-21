// 1- Bibliotecas

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import calculodeareas.Main;

    public class TestCalcularAreas {
    
    // Configura
        double num1 = 2;
        double num2 = 4;
        double num3 = 5;
        double num4 = 3;

    @Test
    public void TesteCubo1(){
        double resultadoEsperado = 8;

        // Executa
        double resultadoAtual = CalcularAreas.Cubo(num1);
        System.out.println("O volume do cubo1 é " + resultadoAtual + " m³.");

        // Valida
        assertEquals(resultadoEsperado,resultadoAtual);
    }
    @Test
    public void TesteParalelepipedo1(){
    // Configura
    double resultadoEsperado = 40;
    // Executa
    double resultadoAtual = CalcularAreas.Paralelepipedo(num1, num2, num3);
    System.out.println("O volume do paralelepípedo1 é " + resultadoAtual + " m³.");

    // Valida
    assertEquals(resultadoEsperado, resultadoAtual);

   }
   @Test
   public void TesteEsfera1(){
    // Configura
    double resultadoEsperado = 113.10;
    double tolerancia = 0.1; // utilizei para compensar a diferença entre o resultado esperado e o resultado atual

    // Executa
    double resultadoAtual = CalcularAreas.Esfera(num4);
    System.out.println("O volume da esfera1 é de: " + resultadoAtual + " m³.");

    // Valida
    assertEquals(resultadoEsperado, resultadoAtual, tolerancia);
   }
   @Test
   public void TesteCubo2(){
    // Configura
    double a = 3;
    double resultadoEsperado = 27;

    // Executa
    double resultadoAtual = Math.pow(a, 3);

    // Valida  
    assertEquals(resultadoEsperado, resultadoAtual);
    System.out.println("O volume do cubo2 é de: " + resultadoAtual + " m³.");
    }

    @ParameterizedTest
    @CsvSource(value = {
        "5.5, 2, 1.5, 16.5",
        "3, 5, 8.5, 127.5 "
    }, delimiter = ',')

    public void TesteParalelepipedo2(double a, double b, double c, double resultadoEsperado){
        // Configura
       
        // Executa
        double resultadoAtual = a * b * c;

        //Valida
        assertEquals(Math.round(resultadoEsperado),Math.round(resultadoAtual));
        System.out.println("O volume do paralelepípedo2 é de " + resultadoAtual + " m³.");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/esfera.csv", numLinesToSkip = 1, delimiter = ',')
    public void testeEsfera2(double raio, double resultadoEsperado, double tolerancia){
        // Configura
        // Dados de entrada e saída estão no csv
    

        // Executa
        double resultadoAtual = Math.round(((4.0/3.0) * Math.PI * Math.pow(raio, 3)));

        // Valida
        assertEquals(resultadoEsperado, resultadoAtual, tolerancia);
    }

    
}
