package estruturaderepeticao.exercicios;
// Utilizando estrutura de repeti��o (for):
import java.util.Scanner;

public class LeitorDeNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        entrada.close();
        // Estrutura de repeti��o:
        for (int contador = 0; contador <= 20; contador++) {
            System.out.println(nome);

        }

    }
}
