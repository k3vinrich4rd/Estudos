package estruturaderepeticao.exercicios;
// Utilizando estrutura de repeti��o (while)
public class ContadorBasicoWhileMultiplicacao {
    public static void main(String[] args) {
       int contador = 0;
       // Estrutura de repeti��o:
        while (contador <= 100000) {
            System.out.println(contador);
            contador += 1000;
        }
        System.out.print("Fim do programa.");
    }
}
