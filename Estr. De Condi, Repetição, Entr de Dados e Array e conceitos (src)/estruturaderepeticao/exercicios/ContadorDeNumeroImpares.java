package estruturaderepeticao.exercicios;
//Utilizando estrutura de repeti��o (for):
public class ContadorDeNumeroImpares {
    public static void main(String[] args) {
        // Estrutura de repeti��o:
        for (int contador = 0; contador <= 100000; contador++) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
        }
    }
}
