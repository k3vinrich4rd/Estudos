package array.list;
//Utilizando ArrayList e seus m�todos isEmpty (Est� vazia) e add (Adicionar)
import java.util.ArrayList;

public class ListExemplo6IsEmpty {
    public static void main(String[] args) {
        ArrayList<String> clientes = new ArrayList<>();

        clientes.add("Vilma Regiane");
        clientes.add("Marcia Regina");
        System.out.println(clientes.isEmpty()); // Verifica se a lista est� vazia
        // Se estiver retorna (true) se n�o retorna (false)
    }
}
