package estruturaderepeticao.exercicios;
// Utilizando uma estrutura de repeti��o:
public class ContadorBasico2 {
    public static void main(String[] args) {

        int contador = 0; // caso esse n�mero for maior que dez, ele n�o executa
        // Estrutura de repeti��o:
        while (contador < 10) { // S� vai executar se o resultado do contador for verdadeiro
            System.out.println(++contador);
        }
    }
}
