package estruturaderepeticao.exercicios;
// Utilizando a estrutura de repeti��o (for):
public class ContadorDeNumerosImparesFor {
    public static void main(String[] args) {
        int numerosImpares = 0;
        // Estrutura de repeti��o
        for (int numeros = 1; numeros <= 50; numeros++) {
            if (numeros % 2 != 0) {
                numerosImpares = numeros;
                System.out.println(numerosImpares);
            }

        }
    }
}
