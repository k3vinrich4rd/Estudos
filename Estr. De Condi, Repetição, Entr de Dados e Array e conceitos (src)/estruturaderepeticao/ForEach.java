package estruturaderepeticao;

public class ForEach {
    //Declarando um for each:
    public static void main(String[] args) {
        int[] idades = {10, 20, 30}; // vetor/ array
        // for each = para cada
        // para cada idade do tipo int em idades fa�a
        // Estrutura de repeti��o:
        for (int idade : idades) {   // idade = nome que se d� para o que est� dentro do vetor
            System.out.println(idade); // N�o precisa de controlador, pois ele sabe onde parar
        } // O For Each conta somente de 1 em 1


    }
}

