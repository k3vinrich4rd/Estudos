package estruturaderepeticao.exercicios;

public class ImprimindoNumerosPares {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 100000; contador++) {
           if (contador % 2 == 0 ){ // N�meros pares
               // N�meros impares = contador % 2 != 0
               System.out.println(contador);
           }
        }
    }
}
