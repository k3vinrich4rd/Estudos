package estruturadecondicao;
// Declarando uma array:
public class ForEachGuanabara {
    public static void main(String[] args) {
        int[] numeros = {20, 30, 50, 40};
        // Quando tiver dois elementos e dois pontos (:) � um ForEach
        // A vari�vel num vai ser alimentada pelos elementos de da variavel n�meros (a cada loop)
        for (int num : numeros) { // N�o precisa de indices
            System.out.print(num + " " );
        }
    }
}