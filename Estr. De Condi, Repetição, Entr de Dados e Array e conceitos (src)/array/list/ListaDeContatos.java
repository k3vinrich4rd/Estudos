package array.list;

import java.util.ArrayList;
import java.util.List;
public class ListaDeContatos {
    public static void main(String[] args) {
        List<String> listaDeContatos = new ArrayList<>();
        listaDeContatos.add("Kevin Richard");
        listaDeContatos.add("Ketelyn Mayara");
        listaDeContatos.add("Vilma Regiane");
        listaDeContatos.add("Carlos Eduardo");
        listaDeContatos.add("Paulo Renan");

        //Imprimindo com o for:
        for (int contador = 0; contador < listaDeContatos.size(); contador++) {
            System.out.println("Indice " + contador + " temos: " + listaDeContatos.get(contador));
        }


    }
}

