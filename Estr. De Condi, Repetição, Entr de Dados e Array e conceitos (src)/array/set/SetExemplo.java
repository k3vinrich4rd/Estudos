package array.set;
// set (definir)
import java.util.HashSet;
import java.util.Set;
// Declarando um set:
public class SetExemplo {
    public static void main(String[] args) {
        Set<String> emails = new  HashSet<>(); // Hash � como se fosse um cpf virtual para cada informa��o
        emails.add("kevinrichadve@gmail.com");
        emails.add("kevinrichadve@gmail.com");
        emails.add("kevin.candido@zup.com.br");
        emails.add("kevin.candido@zup.com.br");
        System.out.println("O tamanho da lista do tipo set acima �: " + emails.size()); // conta o tamanho da lista
                                                                                    // e descarta valores repetidos
    }
}
/*
Se a aplica��o ou regra exige n�o ter informa��es duplicadas, o set
� o tipo de lista mais recomendado por ter essa utilidade
 */