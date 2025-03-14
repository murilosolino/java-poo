package introducaoPOO.exercicios.ex2;

public class Funcionario {
    public String name = "Joao Silva";
    public double salarioBruto = 6000.00;
    public double imposto = 1000.00;

    public double salarioLiquido(){
        return this.salarioBruto - this.imposto;
    }

    public void incrementaSalario(double porcentagem){
        this.salarioBruto += this.salarioBruto * (porcentagem / 100);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", salarioBruto=" + salarioBruto +
                ", imposto=" + imposto +
                '}';
    }
}
