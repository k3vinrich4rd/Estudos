package estruturaderepeticao;
/*
 Declarando o while (enquanto)
 (teste l�gico no inicio) e utilizando if (se)
 */
import java.util.Scanner;

public class WhileExemploAula2 {
    public static void main(String[] args) {

        boolean controlador = true;
        int contadorSim = 0; //Come�o
        // Estrutura de repeti��o:
        while (controlador) {
            System.out.println("Hello World ");
            System.out.print("Voc� deseja continuar rodando? S/N: ");
            Scanner input = new Scanner(System.in);
            String opcao = input.next(); // nesse caso pode ser usado o input.nextLine e next
            if (opcao.equalsIgnoreCase("n")) {
                System.out.println("Fechando programa...");
                System.out.println("Voc� apertou o sim " + contadorSim + " vezes");
                controlador = false;

            }
            contadorSim++;



        }
    }
}
