package estruturaderepeticao;
/*
While (Enquanto) defini��o:
O termo while pode ser traduzido para o portugu�s como ?enquanto?.
Este termo � utilizado para construir uma estrutura de repeti��o que executa, repetidamente, uma �nica instru��o ou um bloco delas ?enquanto?
uma express�o booleana for verdadeira.
 */

// Contando a quantidade de cambalhotas utilizando a estrutura de repeti��o while (Enquanto)
public class While {
    public static void main(String[] args) {
        int contadorCambalhota = 0;
        int contador = 0; // come�o
        // Estrutura de repeti��o:
        while (contador < 4) { // fim
            System.out.println((contador + 1) +" � Cambalhota");
            contador++;
            contadorCambalhota += 1;
        }
        System.out.println("Voc� deu: " + contadorCambalhota + " cambalhotas");
        }
    }
