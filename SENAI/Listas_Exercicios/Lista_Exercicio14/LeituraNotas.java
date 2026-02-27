
package Lista_Exercicio14.src;

import java.io.File;
import java.util.Scanner;

public class LeituraNotas {
    public static void main(String[] args) throws Exception {

        int notaCorte = 80;
        int maiorNota = Integer.MIN_VALUE;
        String alunoMaiorNota = "";

        // Media
        int quantidadeAlunos = 0;
        int SomaNotas = 0;


        // Leitura do arquivo
        File arquivo = new File("src/arquivos/notas.txt");
        Scanner scanner = new Scanner(arquivo);

        while (scanner.hasNext()) {
            String[] linha = scanner.nextLine().strip().split(",");

            int nota = Integer.parseInt(linha[1]);
            String nome = String.valueOf(linha[0]);

            // Contagem de alunos para media
            quantidadeAlunos++;
            SomaNotas += nota; // Soma as notas


            // Verifica os alunos que reprovaram
            if (nota < notaCorte) {
                System.out.println("\nAlunos " + linha[0] + " reprovados " + nota);

            }
            // Verifica alunos aprovados
            else {
                System.out.println("\nAluno " + linha[0] + " aprovado " + nota);
            }

            // Comparação dos valores
            if (nota > maiorNota) {
                maiorNota = nota; // Atualiza caso encontre a maior nota
                alunoMaiorNota = nome; // Armazena o aluno com a maior nota
            }

            scanner.close();

            // Calcula média
            double media = (double) SomaNotas / quantidadeAlunos;

            // Imprime o aluno com o maior nota
            System.out.println("\nA maior nota é do aluno " + alunoMaiorNota + " com a nota " + maiorNota);
            System.out.println("A media foi " + media);
        }
    }
}
