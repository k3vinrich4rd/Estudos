package estruturaderepeticao;
//Utilizando estrutura de repeti��o (for)
import java.util.Scanner;

public class ForExemploAula2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double [] notas = new double[4];
        //Estrutura de repeti��o
        for (int i = 0; i < notas.length ; i++) { //length = tamanho
            System.out.print("Digite a "+  (i + 1) + "� nota: "); //Para fazer mais sentido no texto de saida para o usu�rio
            notas[i] = input.nextDouble(); // � para fazer mais sentido para o usu�rio, mas o indice  SEMPRE come�a no zero

        }
        System.out.println("Fim do programa");
    }
}
