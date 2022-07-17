package estruturaderepeticao.exercicios;
//Utilizando estrutura de repeti��o (While):
// Tabuada b�sica com o While
import java.util.Scanner;

public class TabuadaBasicaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um n�mero e saiba a sua tabuada: ");
        int nunmeroDeEntrada = entrada.nextInt();
        entrada.close();

        int multiplicador = 1;
        // Estrutura de repeti��o:
        while (multiplicador <= 10) {

            int resultado = nunmeroDeEntrada * multiplicador;
            System.out.println(nunmeroDeEntrada + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }

    }
}
