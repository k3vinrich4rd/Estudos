package exerciciosestruturasderepeticao;
// Exerc�cio Web: Leia o nome um n�mero do usu�rio um n�mero N
// e escreva o nome dela(e) tela N vezes.
import java.util.Scanner;
// Utilizando o While
public class ContadorDeNomeWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nomeDoUsuario = entrada.nextLine();
        System.out.print("Digite um n�mero: ");
        int numeroDoUsuario = entrada.nextInt();
        entrada.close();

        // no caso deste exerc�cio o contador se inicia no 0
        // por conta que ele esta contando e n�o somando

        int contador = 0;
        while (contador <= numeroDoUsuario) {
            System.out.println(contador + nomeDoUsuario);
            contador++;

        }
    }
}
