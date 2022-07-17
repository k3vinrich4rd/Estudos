package estruturaderepeticao.exercicios;
// Utilizando o while (Enquanto) para mudar o fluxo de um c�digo utilizando o continue (continuar)
// e break (Parar)

public class ContadorComBreak {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10) {
            contador++;
            if (contador == 2 || contador == 3 || contador == 4) {  //Vai mostrar as cambalhotas, menos a 2, 3 e 4
                continue;
            }
            if (contador == 7) { // O c�digo vai parar quando chegar na cambalhota 7, por conta do break
                break; // (Parar)
            }
            System.out.println("Cambalhota" + contador);
        }
    }
}
