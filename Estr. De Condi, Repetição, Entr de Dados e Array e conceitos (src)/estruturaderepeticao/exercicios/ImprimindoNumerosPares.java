package estruturaderepeticao.exercicios;
//Utilizando estrutura de repeti��o (for):
public class ImprimindoNumerosPares {
    public static void main(String[] args) {
        // Estrutura de repeti��o
        for (int contador = 1; contador <= 100000; contador++) {
           if (contador % 2 == 0 ){ // N�meros pares
               // N�meros impares = contador % 2 != 0
               System.out.println(contador);
           }
        }
    }
}
