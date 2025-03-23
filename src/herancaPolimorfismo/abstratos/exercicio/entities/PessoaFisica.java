package herancaPolimorfismo.abstratos.exercicio.entities;

public class PessoaFisica extends Contribuinte {

    private Double gastosComSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public PessoaFisica(){};

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double imposto() {

        double imposto = 0;

        if (getRendaAnual() < 20000){
            imposto = getRendaAnual() * 0.15;
        } else if (getRendaAnual() >= 20000) {
            imposto = getRendaAnual() * 0.25;
        }

        if (gastosComSaude > 0){
            imposto -= (gastosComSaude * 0.50);
        }

        return imposto;
    }
}
