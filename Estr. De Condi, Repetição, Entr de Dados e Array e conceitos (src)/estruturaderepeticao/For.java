package estruturaderepeticao;
/*
For (para) defini��o:
Executa a declara��o e express�o de la�o repetidamente,
at� que a condi��o da express�o se torne falsa
 */
//Utilizando a estrutura de repeti��o for (Para) para contar de 1 a 3
public class For {
    public static void main(String[] args) {
        int contadorCambalhotas = 0;
        //  Estrutura de repeti��o:
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) +" � Cambalhota");
            contadorCambalhotas += 1;
        }
        System.out.println("Voc� deu: " + contadorCambalhotas + " cambalhotas");
    }
}
