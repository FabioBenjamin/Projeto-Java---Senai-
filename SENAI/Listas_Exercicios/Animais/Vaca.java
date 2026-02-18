package Lista_Exercicio11.Animais;

import Lista_Exercicio11.Animais.Mamifero;

public class Vaca extends Mamifero {
    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void falar() {
        System.out.println("Muuu");
    }
}

