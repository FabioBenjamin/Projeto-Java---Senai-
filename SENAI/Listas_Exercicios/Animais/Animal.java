package Lista_Exercicio11.Animais;

public abstract class Animal {

    String nome;

    // Construtor
    public Animal(String nome){
    this.nome = nome;
    }

    // Metodo imprimir (imprime nome)

    public void imprimir(){
        System.out.println(getNome());
    }

    // Metodo Falar
    abstract void falar();

    // Getters

    public String getNome() {
        return nome;
    }

}

