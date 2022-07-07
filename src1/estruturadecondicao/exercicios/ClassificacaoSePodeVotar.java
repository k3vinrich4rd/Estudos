package estruturadecondicao.exercicios;

import java.util.Scanner;

// Utilizando estrutura condicionais encadeadas e de multipla escolha
// utilizando if (se), else (se n�o) e conectivos l�gicos, como:
// && (e) e || (ou)
// Verificando se uma pessoa pode votar ou n�o, atrav�s do seu ano de nascimento.

public class ClassificacaoSePodeVotar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Scanner = ler
        System.out.print("Informe seu ano de nascimento: "); // Imprimir no sistema de sa�da
        int anoDeNascimento = entrada.nextInt();
        entrada.close();

        int idade = 2022 - anoDeNascimento;
        if (idade < 16) {
            System.out.print("N�o votar");
        }else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) { // Quando se trata do conectivo l�gico && (e)
                System.out.print("Opcional"); // Ambas condi��es t�m que ser verdadeiras, ou se encaixar no || (ou)
            }else {                             // Somente nesse caso
                System.out.print("Obrigat�rio\n");
                System.out.print("Voc� tem: " + idade + " anos de idade");
            }
        }
    }
}
