package estruturadecondicao;
/*
switch (Alternar/ Trocar/ Interruptor) defini��o:
Da mesma forma que o comando if,
o comando switch case controla o fluxo do programa permitindo ao programador
especificar c�digo diferente para ser executado em v�rias condi��es.
Em particular, um comando switch compara o valor de uma vari�vel
aos valores especificados nos comandos case.

 */

// utilizando a estrutura condicional switch (Alternar/ Trocar/ Interruptor)
import java.util.Scanner;
// Verificando a quantidade e seu tipo
public class Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um n�mero de pernas: ");
        int pernas = entrada.nextInt();
        String tipo;
        entrada.close();

        switch (pernas) { //(Alternar/ Trocar/ Interruptor)
            case 1:
                tipo = "Saci";
                break; // parar
            case 2:
                tipo = "B�pede";
                break;
            case 3:
                tipo = "trip�";
                break;
            case 4:
                tipo = "Quadr�pede";
                break;
            case 6:
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "Et";
        }
        System.out.println("O seu animal de estima��o � uma: " + tipo);
    }
}
