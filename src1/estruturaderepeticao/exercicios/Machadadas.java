package estruturaderepeticao.exercicios;

public class Machadadas {
    public static void main(String[] args) {
        System.out.println("Derrube uma arvore com 11 machadadas");
        int machadada = 10;
        for (int contador = 0; contador < machadada; contador++) {
            System.out.println((contador + 1) + "� machadada");
        }
        if (machadada == 11) {
            System.out.println("voc� conseguiu derrubar a arvore");
        }else{
            System.out.println("Tente de novo, voc� n�o conseguiu");
            System.out.println();
        }

        int contadorMachadada = 0;
        while (contadorMachadada < 11){
            System.out.println((contadorMachadada + 1) + "� machadada");
            contadorMachadada++;
        }
        if (contadorMachadada == 11){
            System.out.println("Parab�ns, voc� conseguiu derrubar a arvore.");
        }else {
            System.out.println("Voc� n�o conseguiu derrubar a arvore, tente novamente.");
        }
    }
}

