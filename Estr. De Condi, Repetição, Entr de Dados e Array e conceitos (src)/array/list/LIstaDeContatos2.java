package array.list;

import java.util.ArrayList;
import java.util.Collections;
//Utilizando um Arraylist e seus m�todos:
public class LIstaDeContatos2 {
    public static void main(String[] args) {
        ArrayList<String> listaDeContatos = new ArrayList<>();
        listaDeContatos.add("Kevin Richard"); //add (adicionar) itens na lista
        listaDeContatos.add("Jo�o"); //add (adicionar) itens na lista
        listaDeContatos.add("Vilma Regiane"); //add (adicionar) itens na lista
        listaDeContatos.add("Carlos eduardo"); //add (adicionar) itens na lista
        Collections.sort(listaDeContatos); // Coloca em ordem alfab�tica
        // : (em)
        for (String contatos : listaDeContatos) { //ForEach
            System.out.println(contatos);

        }
    }
}
