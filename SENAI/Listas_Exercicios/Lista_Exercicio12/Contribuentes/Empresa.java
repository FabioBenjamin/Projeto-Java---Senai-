package Lista_Exercicio12.Contribuentes;

public abstract class Empresa extends Contribuente{

    private int numeroFuncionario;


    // Construtor
    public Empresa( int numeroFuncionario, String nome, double rendaAnual) {
        super(nome, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    // Metodo de imposto por funcionario
    public double calculoImposto(){
        double impostao;

        if(numeroFuncionario <= 10) {
            impostao = 0.16;

        } else {
            impostao = 0.14;
        }
        return getRendaAnual();
    }

}
