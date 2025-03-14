package introducaoPOO.exercicios.ex3;

public class Student {
    private String name;
    private double nota1;
    private double nota2;
    private double nota3;

    public Student(String name, double nota1, double nota2, double nota3) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double notaFinal() {
        return nota1 + nota2  + nota3;
    }

    public boolean isAprovado() {
        return notaFinal() >= 60.0;
    }

    public double pontosFaltando() {
        if (isAprovado()) {
            return 0.0;
        } else {
            return 60.0 - notaFinal();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", notaFinal=" + notaFinal() +
                ", status=" + (isAprovado() ? "PASS" : "FAILED") +
                (isAprovado() ? "" : ", pontosFaltando=" + pontosFaltando()) +
                '}';
    }
}
