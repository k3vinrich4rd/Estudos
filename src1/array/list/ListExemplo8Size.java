package array.list;
// Utilizando ArrayList e seus m�todos size (Tamanho) e add (Adicionar):
import java.util.ArrayList;

public class ListExemplo8Size {
    public static void main(String[] args) {

        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Silvio");
        clientes.add("Kleber");
        clientes.add("Jacira");
        System.out.println("O tamanho da sua lista �: " + clientes.size());
        //Retorna o tamanho da lista conforme a quantidade de itens
    }
}
