package introducaoPOO.exercicios.ex1;

public class Retangulo {

    public double base;
    public double altura;

    public double area(){
        return this.base * this.altura;
    }

    public double perimetro(){
        return 2 * (this.base + this.altura);
    }

     public double diagonal() {
        double baseQuadrado = Math.pow(this.base, 2);
        double alturaQuadrado = Math.pow(this.altura, 2);
        return Math.sqrt(baseQuadrado + alturaQuadrado);
    }

}
