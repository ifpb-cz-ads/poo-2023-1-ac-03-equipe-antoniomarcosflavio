/**
 * CBBAtividadePratica2
 * Crie um programa e declare nele 3 variáveis numéricas int, inicializando-as com algum valor
 * e obtenha a soma dessas variaveis e a média delas, imprimindo esses resultados na tela.
 */
public class CBBAtividadePratica2 {
    public static void main(String[] args) {
        int valorA = 8, valorB = 9, valorC = 5;
        int soma = valorA + valorB + valorC;
        
        double media = soma/3.0;

        System.out.printf("A soma das variaveis numericas é %d, e a sua média é %.2f.", soma, media);
    }
}