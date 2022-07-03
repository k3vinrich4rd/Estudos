package array.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExemplo {
    // Declarando um Arraylist (list)
// Array list permite repeti��o de informa��o e armazena informa��o de maneira ordenada
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a sua primeira nota: ");
        notas.add(input.nextDouble());
        System.out.print("Informe a sua segunda nota: ");
        notas.add(input.nextDouble());
        System.out.print("Informe a sua terceira nota: ");
        notas.add(input.nextDouble());
        System.out.print("Informe a sua quarta nota: ");
        notas.add(input.nextDouble());
        input.close();

        System.out.println(notas.get(0)); // Para verificar e a posi��o da nota
        System.out.println(notas.get(1)); // Para verificar e a posi��o da nota
        System.out.println(notas.get(2)); // Para verificar e a posi��o da nota
        System.out.println(notas.get(3)); // Para verificar e a posi��o da nota
                                            // em que voc� armazenou na lista


    }

    /*
    Para lista s� pode ser um tipo wrapper, N�o pode ser primitivo
    A lista � din�mica n�o � necess�rio um n�mero limite
    N�o � necess�rio trabalhar com posi��es (indices)
    Aceita n�meros repetidos
     */
}
