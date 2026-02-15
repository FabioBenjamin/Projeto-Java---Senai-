import java.util.Scanner;

class numerosComplexo {
    private double inteiro;
    private double fracionado;

    // Construtor
    public numerosComplexo(double inteiro, double fracionado) {
        this.inteiro = inteiro;
        this.fracionado = fracionado;
    }

    // Metodo Somar
    public numerosComplexo soma(numerosComplexo valor3) {

        // (a+bi)+(c+di) = (a+c)+(b+d)i
        double novoInteiro = this.inteiro + valor3.inteiro;
        double novoFracionado = this.fracionado + valor3.fracionado;

        return new numerosComplexo(novoInteiro, novoFracionado);
    }

    // Metodo de substração
    public numerosComplexo subtracao(numerosComplexo valor3) {

        // (a+bi)−(c+di) = (a−c)+(b−d)i
        double novoInteiro = this.inteiro - valor3.inteiro;
        double novoFracionado = this.fracionado - valor3.fracionado;

        return new numerosComplexo(novoInteiro, novoFracionado);
    }

    // Metodo de multiplicação
    public numerosComplexo multiplicacao(numerosComplexo valor3) {

        // (a+bi) * (c+di) = (ac−bd)+(ad+bc)i;
        double novoInteiro = (this.inteiro * valor3.inteiro) - (this.fracionado * valor3.fracionado);
        double novoFracionado = (this.inteiro * valor3.fracionado) + (this.fracionado * valor3.inteiro);

        return new numerosComplexo(novoInteiro, novoFracionado);
    }

    // Metodo de divisão
    public numerosComplexo divisao(numerosComplexo valor3) {
        double a = this.inteiro;
        double b = this.fracionado;
        double c = valor3.inteiro;
        double d = valor3.fracionado;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        double denominador = (c * c) + (d * d);

        if (denominador == 0) {
            throw new ArithmeticException("Não é possível dividir por zero, erro.");
        }

        // (a+bi) / (c+di) = (ac+bd)/(c2 + d2) + (bc-ad)/(c2 + d2)i
        double novoInteiro = ((a * c) + (b * d)) / denominador;
        double novoFracionado = ((b * c) - (a * d)) / denominador;

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

    public void setInteiro(double inteiro) {
        this.inteiro = inteiro;
    }

    @Override
    public String toString() {
        if (fracionado >= 0) {
            return String.format("%.2f + %.2fi", inteiro, fracionado);
        } else {
            return String.format("%.2f - %.2fi", inteiro, Math.abs(fracionado));
        }
    }

    // Metodo comparação
    @Override
    public boolean equals(Object outro) {
        if (this == outro) return true;

        // Verifica se é nulo ou de classe diferente
        if (outro == null || getClass() != outro.getClass())
            return false;

        // Conversão para numeros complexos
        numerosComplexo conversao = (numerosComplexo) outro;

        // Comparação dos atributos
        return Double.compare(inteiro, conversao.inteiro) == 0 &&
                Double.compare(fracionado, conversao.fracionado) == 0;
    }

    // Metodo transformação (Complexo para String)
    public void tranformacao() {

        String resultado;

        String transformadorInt = String.valueOf(inteiro);
        String transformadorFranc = String.valueOf(fracionado);

        resultado = String.format("Valores: %2.f e %2.f", transformadorInt, transformadorFranc);
        System.out.println(resultado);

    }

    // Metodo retorno (Numero complexo)
    public numerosComplexo retorno() {
        return this;
    }

}

// Classe main
public class numComplexo {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        String decisao;
        String entradaNumero;
        double real;

        // Para o usuário decidir o tipo de conta que quer fazer
        System.out.println("Para sua operação terminar e você saber o resultado coloque (=)");
        System.out.println("Tipos de contas a fazer!!!");
        System.out.println("Soma - (+)");
        System.out.println("Subtração - (-)");
        System.out.println("Multiplicação - (*)");
        System.out.println("Divisão - (/)");
        System.out.println("Insira - ");

        decisao = usuario.nextLine();

        // Guarda o resultado
        numerosComplexo resultado = null;

        // Loop do numero
        while (true) {
            System.out.println("Digite a parte real: ");
            entradaNumero = usuario.nextLine();

            // Verificação do '='
            if (entradaNumero.equals("=")) {
                break;
            }

            try {
                real = Double.parseDouble(entradaNumero);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido!");
                continue;
            }

            System.out.println("Digite a parte imaginaria: ");
            double imaginario = Double.parseDouble(usuario.nextLine());

            numerosComplexo numeroDigitado = new numerosComplexo(real, imaginario);

            // O primeiro número, ele vira o resultado inicial
            if (resultado == null) {
                resultado = numeroDigitado;
            } else {

                // Aplicação da operação escolhida
                switch (decisao) {
                    case "+":
                        resultado = resultado.soma(numeroDigitado);
                        break;
                    case "-":
                        resultado = resultado.subtracao(numeroDigitado);
                        break;
                    case "*":
                        resultado = resultado.multiplicacao(numeroDigitado);
                        break;
                    case "/":
                        resultado = resultado.divisao(numeroDigitado);
                        break;
                    default:
                        System.out.println("Operação inválida!");
                        return;
                }
            }
        }

        // Exibição
        if (resultado != null) {
            System.out.println("Resultado final (Numero Real e imaginario):  " + resultado);
        }

        usuario.close();

    }

}
