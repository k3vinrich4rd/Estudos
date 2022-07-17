package estruturaderepeticao;
/*
Do (fa�a) While (Enquanto) defini��o:
O loop do while do java � usado para repetir uma parte do programa algumas vezes.
Se o n�mero de itera��es n�o � fixo e voc� precisa executar o loop pelo menos uma vez.
� recomendado o uso do loop do while.
O loop do while � executado pelo menos uma vez porque a condi��o � checada depois do corpo do loop.

 */
// Utilizando a estrutura de repeti��o do (fa�a) while (enquanto).
public class DoWhile {

    public static void main(String[] args) {
        int contadorCambalhota = 0;
        int contador = 0; // come�o
        do {
            System.out.println("Cambalhota");
            contador++; // contador do ciclo
            contadorCambalhota += 1 ;
        }while (contador < 4); // fim
        System.out.println("Voc� deu: " + contadorCambalhota + " cambalhotas");

    }
}
