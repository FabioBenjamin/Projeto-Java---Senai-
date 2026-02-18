package Lista_Exercicio11.Animais;

public class Papagaio extends Passaro {

    public Papagaio(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("Pra Pra");
    }
}
