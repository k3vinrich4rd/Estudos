package estruturadecondicao;

/* Else if (se n�o) defini��o:
A declara��o else if em java tamb�m testa uma condi��o.
Executa se a condi��o do bloco if � verdadeira caso contr�rio o bloco else � executado
 */
// Utilizando a estrutura else if (se n�o se) para outros contextos al�m do if (se)
public class ElseIf {
    public static void main(String[] args) {
        // Estrutura Condicional
        int idade = 19;
        if (idade < 15){
            System.out.println("Categoria infatil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Cat�goria juvenil ");
        } else {
            System.out.println("Cat�goria adulta");
        }
    }
}
