package Orientacao_Objeto;

import java.util.Scanner;

// Classe ponto
class Ponto {

    private double x;
    private double y;

    // Construtor
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Metodo de calculo de distancia entre os pontos
    public double calculo(Ponto outro) {
        double x1 = this.x;
        double y1 = this.y;
        double x2 = outro.x;
        double y2 = outro.y;

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}

// Classe guarda triangulo
class criaTriangulo {

    private Ponto valor1;
    private Ponto valor2;
    private Ponto valor3;

    // Construtor
    public criaTriangulo(Ponto valor1, Ponto valor2, Ponto valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    // Metodo calculo de perimetro
    public double perimetro() {
        double lado1 = valor1.calculo(valor2);
        double lado2 = valor2.calculo(valor3);
        double lado3 = valor3.calculo(valor1);

        return lado1 + lado2 + lado3;
    }
}

// Classe principal (main)
public class triangulo {
    public static void main(String[] args) {

        Scanner triangulando = new Scanner(System.in);

        // Pontos
        double ax, ay;
        double bx, by;
        double cx, cy;

        // Usuario
        System.out.println("Digite o ponto A (x e y): ");
        ax = triangulando.nextDouble();
        ay = triangulando.nextDouble();

        System.out.println("Digite o ponto B (x e y): ");
        bx = triangulando.nextDouble();
        by = triangulando.nextDouble();

        System.out.println("Digite o ponto C (x e y): ");
        cx = triangulando.nextDouble();
        cy = triangulando.nextDouble();

        // Criação dos pontos
        Ponto A = new Ponto(ax, ay);
        Ponto B = new Ponto(bx, by);
        Ponto C = new Ponto(cx, cy);

        criaTriangulo triangulin = new criaTriangulo(A, B, C);

        // Exibição
        System.out.printf("O perimetro do triangulo é %.2f ", triangulin.perimetro());

        triangulando.close();
    }
}
