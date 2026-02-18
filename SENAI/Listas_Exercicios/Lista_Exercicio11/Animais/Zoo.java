package Lista_Exercicio11.Animais;

import java.util.ArrayList;

// Main
public class Zoo {
    public static void main(String[] args) {

        Vaca v = new Vaca("Moana");
        Papagaio p = new Papagaio("Teco");
        Cachorro c = new Cachorro("Totó");
        BemTeVi b = new BemTeVi("Paçoca");

        // Array dos tipos
        ArrayList<Passaro> passaros = new ArrayList<>();
        ArrayList<Mamifero> mamiferos = new ArrayList<>();

        ArrayList<Animal> animals = new ArrayList<>();

        // Adição das subclasses animais

        // Passaro
        passaros.add(p);
        passaros.add(b);

        // Mamifero
        mamiferos.add(c);
        mamiferos.add(v);

        // Aceita os dois tipos
        animals.add(b);
        animals.add(c);

        for(Animal animal : passaros) {
            System.out.println(animal.getNome());
        }

    }
}
