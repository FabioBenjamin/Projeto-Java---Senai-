class numerosComplexo {
    private double inteiro;
    private double fracionado;

    // Construtor
    public numerosComplexo(double inteiro, double fracionado) {
        this.inteiro = inteiro;
        this.fracionado = fracionado;
    }

    // Metodo Somar
    public numerosComplexo soma(numerosComplexo valor1) {

        // (a+bi)+(c+di) = (a+c)+(b+d)i
        double novoInteiro = this.inteiro + valor1.inteiro;
        double novoFracionado = this.fracionado + valor1.fracionado;

        return new numerosComplexo(novoInteiro, novoFracionado);
    }

    // Metodo de substração
    public numerosComplexo subtracao(numerosComplexo valor2) {

        // (a+bi)−(c+di) = (a−c)+(b−d)i
        double novoInteiro = this.inteiro - valor2.inteiro;
        double novoFracionado = this.fracionado - valor2.fracionado;

        return new numerosComplexo(novoInteiro, novoFracionado);
    }

    // Metodo de multiplicação
    public numerosComplexo multiplicacao(numerosComplexo valor3) {

        // (a+bi) * (c+di) = (ac−bd)+(ad+bc)i;
        double novoInteiro = (this.inteiro * valor3.inteiro) - (this.fracionado * valor3.fracionado);
        double novoFracionado = (this.fracionado * valor3.fracionado) + (this.fracionado * valor3.inteiro);

        return new numerosComplexo(novoInteiro, novoFracionado);
    }

    // Metodo de divisão
    public numerosComplexo divisao(numerosComplexo valor4) {
        double a = this.inteiro;
        double b = this.fracionado;
        double c = valor4.inteiro;
        double d = valor4.fracionado;

        double denominador = Math.pow(c, 2) + Math.pow(d, 2);

        if (denominador == 0){
            throw new ArithmeticException("Não é possível dividir por zero, erro.");
        }

        // (a+bi) / (c+di) = (ac+bd)/(c2 + d2) + (bc-ad)/(c2 + d2)i
        double novoInteiro = (a * c + b * d) / denominador;
        double novoFracionado = (b * c - a * d) / denominador;

        return new numerosComplexo(novoInteiro, novoFracionado);
    }

    // Metodo Getters e Setters

    public double getFracionado() {
        return fracionado;
    }

    public void setFracionado(double fracionado) {
        this.fracionado = fracionado;
    }

    public double getInteiro() {
        return inteiro;
    }

    public void setInteiro(int inteiro) {
        this.inteiro = inteiro;
    }

    // Metodo comparação
    public boolean equals(Object outro) {
        if (this == outro){
            return true;
        }

        if ()
    }

    // Metodo transformação (Complexo para String)
    public void tranformacao() {}

    // Metodo retorno (Numero complexo)
    public void retorno() {}


}

// Classe main
public class NumeroComplexo {
}
