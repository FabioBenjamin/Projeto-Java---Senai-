package Lista_Exercicio12.Contribuentes;

public class Individual {

    double gastoSaude = 0;

    // Contrutor
    public Individual(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    // Getters
    public double getGastoSaude() {
        return gastoSaude;
    }

    // Metodo para desconto

    public double abatimento() {
        // 50% de desconto
        return gastoSaude * 0.5;
    }
}
