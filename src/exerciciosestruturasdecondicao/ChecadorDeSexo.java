package exerciciosestruturasdecondicao;

import java.util.Scanner;

/* Utilizando a estrutura condicional switch (trocar, alternar e interruptor)
Para informar os dias da da semana para o usu�rio.
 */
public class ChecadorDeSexo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe seu sexo, Digite 'm' para Masculino, 'f' para Feminino e 'nb' Para N�o Bin�rio: ");
        String sexo = entrada.nextLine();
        entrada.close();

        switch (sexo) {
            case "m":
                System.out.println("O seu g�nero � masculino");
                break;
            case "f":
                System.out.println("O seu g�nero � feminino");
                break;
            case "nb":
                System.out.println("Voc� � n�o bin�rio");
                break;
            default:
                System.out.println("Valor inv�lido, informe as op��es indicadas ");

        }

    }
}
