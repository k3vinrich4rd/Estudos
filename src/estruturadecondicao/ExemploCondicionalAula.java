package estruturadecondicao;

import java.util.Scanner;

public class ExemploCondicionalAula {
    public static void main(String[] args) {
        /*
        Se a m�dia for menor ou igual a 6, est� reprovado
        se a m�dia for menor ou igual a 8, est� aprovado
        Se a m�dia for maior que 8 est� aprovado com louvor
         */
        double media = 7;
        // Estrutura condicional:
        if (media <= 6) {
            System.out.println("Est� reprovado");
        } else if ((media <= 6) && (media <= 8)) {
            System.out.println("Est� aprovado");
        } else {
            System.out.println("Aprovado com louvor");
        }


    }
}
