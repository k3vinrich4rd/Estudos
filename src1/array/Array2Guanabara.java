package array;
// Outra maneira de se criar uma Array (Vetor)

public class Array2Guanabara {
    public static void main(String[] args) {
        // Quando tenho o tamanho, mas n�o a informa��o:
        int idades[] = new int[4]; // new = novo objeto
        idades[0] = 15; // informa��o
        idades[1] = 18; // informa��o
        idades[2] = 19; // informa��o
        idades[3] = 25; // informa��o

        // Quando tenho a informa��o e automaticamente o tamanho:

        int idades2[] = {20, 30, 50, 60};

        for (int contador = 0; contador <=idades.length - 1; contador++) {
            System.out.println("Na posi��o " + contador + " temos o valor: " + idades[contador]);

        }
        System.out.println();
        for (int contador2 = 0; contador2 <= idades.length - 1; contador2++) {
            System.out.println("Na posi��o " + contador2 + " temos o valor: " + idades2[contador2]);

        }

    }
}
