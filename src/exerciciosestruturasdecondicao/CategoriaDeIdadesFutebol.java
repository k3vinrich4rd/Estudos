package exerciciosestruturasdecondicao;
/*
Else (se n�o) defini��o:
A declara��o if-else em java tamb�m testa uma condi��o.
Executa se a condi��o do bloco if � verdadeira caso contr�rio o bloco else � executado
 */
// Utilizando a estrutura else if (se n�o se) para outros contextos al�m do if (se)
public class CategoriaDeIdadesFutebol {
    public static void main(String[] args) {
        int idade = 19;
        String categoria = null; // null = nulo

        if (idade < 15) {
            categoria = "Cat�goria infatil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Cat�goria juvenil";
        } else if (idade > 18) {
            categoria = "Cat�goria adulta";
        }
        System.out.println(categoria);
    }
}
