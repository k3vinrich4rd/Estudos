package exerciciosestruturasdecondicao;
// Estrutura condicional composta, utilizando o if (se) e else (se n�o)
import java.util.Scanner;

public class ClassificacaoDeIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int anoDeNascimento = entrada.nextInt();
        int idade = 2022 - anoDeNascimento;
        if (idade >= 18) {
            System.out.println("Voc� � maior de idade");
        }else {
            System.out.print("Voc� � menor de idade");
        }
        System.out.println("Voc� tem: " + idade + " anos de idade");
    }
}
