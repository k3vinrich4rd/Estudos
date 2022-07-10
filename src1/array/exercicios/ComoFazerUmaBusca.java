package array.exercicios;
// Fazendo uma busca atrav�s da posi��o dos indices
import java.util.Arrays;

public class ComoFazerUmaBusca {
    public static void main(String[] args) {
        int [] vetor = {3, 7, 6, 1, 9, 4, 2}; // Vetor
        Arrays.sort(vetor); // coloca um vetor em ordem numerica
        for (int vet : vetor){ // ForEach
            System.out.print(vet + " ");
        }
        System.out.println(""); // O resultado da busca sempre vai ser n�mero -1
        int posicao = Arrays.binarySearch(vetor, 2); // Se o resultado for negativo � que o indices pesquisados n�o existem
        System.out.println("Encontrei o valor na posi��o " + posicao);
        System.out.println(posicao);
    }
}
