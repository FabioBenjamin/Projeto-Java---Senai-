package Exercicios_Extras;

import java.util.ArrayList;
import java.util.List;

public class media {
    public static void main(String[] args) {

        // Listas 

        List<Double> numero1 = new ArrayList<>();
        numero1.add(9.0);
        numero1.add(8.0);
        numero1.add(7.0);

        List<Double> numeros2 = new ArrayList<>();
        numeros2.add(4.0);
        numeros2.add(5.0);
        numeros2.add(6.0);
        
        double resultado = 0;

        // Soma dos dois array

        for (Double soma : numero1) { // Usa for Each 
            resultado += soma;
        
        }

        for (Double soma : numeros2) { // Uso de for Each
            resultado += soma;
        
        }

        // Media dos dois array 

        int mediaGeral = numero1.size() + numeros2.size(); // size() - retorna o número de elementos armazenados  
        Double MediaFinal = resultado / mediaGeral;
        
        // Exibição dos valores

        System.out.println("A soma dos valores: " + resultado); // Resposta: 39.0
        System.out.println("A média dos valores: " + MediaFinal); // Resposta: 6.5


    }
}
