package introducaoPOO.exercicios.vetores.ex1.entidades;
// Classe referente ao exercicio do pensionato
public class Quarto {
    private Estudante estudante;

    public Quarto(Estudante estudante) {
        this.estudante = estudante;

    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
