/**
 * BMExercicio3
 */
public class BMExercicio03 {
    public static void main(String[] args) {
        // letra A
        double precoItem1 = 2.95, precoItem2 = 3.50;

        // letra B
        System.out.println("O item 1 custa " + precoItem1 + " e o item 2 custa " + precoItem2);

        // letra C
        double custoTotalDosItens = precoItem1 + precoItem2;
        System.out.println("A soma do preco dos itens é de " + custoTotalDosItens);

        // letra D
        final double TAXA = 8.25 / 100;
        double taxaCalculada = custoTotalDosItens * TAXA;
        double taxaTotal = taxaCalculada + custoTotalDosItens;
        System.out.printf("A taxa cobrada será de %.2f e somada ao valor do custo total dos itens será de %.2f.\n", taxaCalculada, taxaTotal);

        // letra E
        precoItem1 += taxaCalculada;
        precoItem2 += taxaCalculada;
        double novoCusto = precoItem1 + precoItem2;

        // letra F
        boolean muitoCaro = (novoCusto > 10);
        System.out.println(muitoCaro);
    }
}