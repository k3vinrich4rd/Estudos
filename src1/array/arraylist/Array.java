package array.arraylist;
/* Array (Vetor/ Conjunto)
Um grupo
Declarando um array:
(Para declarar um Array, � sempre necess�rio o tamanho do conjunto
N�o � poss�vel inicializar um conjunto sem tamanho
 */

public class Array {
    // Quando j� sei os valores e o tamanho que preciso usar:
    public static void main(String[] args) {
        int[] idades = {19, 23, 42, 44};
        System.out.println(idades[0]); // indices
        System.out.println(idades[1]); // indices
        System.out.println(idades[2]); // indices
        System.out.println(idades[3]); // indices

        // Quando n�o sei os valores que ser�o inseridos:
        String[] nomes = new String[10]; // tamanho do Array // new = atribui��o de tamanho
        // recebe n�meros doubles, mas o correto � inteiro
        nomes [0] = "Kevin Richard";
        nomes [1] = "Ketelyn Mayara";
        nomes [2] = "Carlos Eduardo";
        nomes [3] = "Vilma Regiane";
        nomes [4] = "Jhonatan";
        nomes [5] = "Paulo Renan";
        nomes [6] = "F�bio Roberto";
        nomes [7] = "Jo�o";
        nomes [8] = "Zelia Regina";
        nomes [9] = "Marli Ribeiro";

        System.out.println(nomes[0]); // indices
        System.out.println(nomes[1]); // indices
        System.out.println(nomes[2]); // indices
        System.out.println(nomes[3]); // indices
        System.out.println(nomes[4]); // indices
        System.out.println(nomes[5]); // indices
        System.out.println(nomes[6]); // indices
        System.out.println(nomes[7]); // indices
        System.out.println(nomes[8]); // indices
        System.out.println(nomes[9]); // indices

        boolean [] tabelaDaVerdade = new boolean[100];
    }
}
/*
Usado mais em:
Arvore Binaria
Grafos
Arvore de decis�o
Pila
Fila
 */