package array.list;

import java.util.ArrayList;

//Utilizando ArrayList e seus m�todos Contains (cont�m)
public class ListExemplo7Contains {
    public static void main(String[] args) {

        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Felipe");
        clientes.add("Rafael");
        clientes.add("Pedro");
        System.out.println(clientes.contains("Felipe")); // Contains (cont�m)
        // verifica se tem um valor espec�fico na lista, se tiver retorna true se n�o retorna false
    }
}
