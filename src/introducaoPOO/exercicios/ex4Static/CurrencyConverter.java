package introducaoPOO.exercicios.ex4Static;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double valorTotalAPagar(double cotacao, double qtdDolar){
        double valorTotal = cotacao * qtdDolar;
        valorTotal += valorTotal * IOF;
        return  valorTotal;
    }

}
