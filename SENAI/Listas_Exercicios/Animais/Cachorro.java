package Lista_Exercicio11.Animais;

public class Cachorro extends Mamifero {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("Au Au");
    }
}


