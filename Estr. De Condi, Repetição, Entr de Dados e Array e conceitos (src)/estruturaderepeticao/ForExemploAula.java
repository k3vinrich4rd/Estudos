package estruturaderepeticao;
//Utilizando a estrutura de repeti��o (for)
import java.util.Scanner;

public class ForExemploAula {
    public static void main(String[] args) {
        int [] idades = {10, 20, 30}; // vetor/ array
        //Estrutura de repeti��o
        for (int i = 0; i < idades.length; i++) { // i = index
            // o i soma a vari�vel de controle
            System.out.println(idades[i]);
            System.out.println("Estou na posi��o: " + i);

        }
    }
}
