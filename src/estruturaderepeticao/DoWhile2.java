package estruturaderepeticao;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        int numero, soma = 0;
        String resposta;
        Scanner numeroDeEntrada = new Scanner(System.in);
        do {
            System.out.print("Digite um n�mero: ");
            numero = numeroDeEntrada.nextInt();
            soma += numero; // s = s + n;
            System.out.println("Quer continuar? [Sim/N�o]");
            resposta = numeroDeEntrada.next(); // resposta do teclado
        }while (resposta.equalsIgnoreCase("sim")); // enquanto a resposta for sim, caso for n�o, o la�o acaba
        System.out.print(" A soma de todos os valores �: " + soma );
        // equals (� igual a )
        // IgnoreCase (Ignore caso)
    }
}
