package estruturadecondicao.exercicios;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// C�digo feito em aula
public class JogoDetetive {
    public static void main(String[] args) {
        Scanner respostaUsuario = new Scanner(System.in);
        System.out.print("Telefonou para a v�tima? S/N: ");
        String resposta1 = respostaUsuario.next();

        List<Integer> listaDeSim = new ArrayList<>(); // Lista
        // Estrutura condicional
        if (resposta1.equalsIgnoreCase("S")) {
            listaDeSim.add(1);
        } else if (!resposta1.equalsIgnoreCase("s") && !resposta1.equalsIgnoreCase("n")) {
            System.out.println("Resposta inv�lida, tente novamente");
            System.exit(0);
        }

        System.out.print("Esteve no local do crime? S/N: ");
        String resposta2 = respostaUsuario.next();
        // Estrutura condicional
        if (resposta2.equalsIgnoreCase("S")) {
            listaDeSim.add(1);
        } else if (!resposta1.equalsIgnoreCase("s") && !resposta1.equalsIgnoreCase("n")) {
            System.out.println("Resposta inv�lida, tente novamente");
            System.exit(0);
        }
        // Estrutura condicional
        System.out.print("Mora perto da v�tima? S/N: ");
        String resposta3 = respostaUsuario.next();
        if (resposta3.equalsIgnoreCase("S")) {
            listaDeSim.add(1);
        } else if (!resposta1.equalsIgnoreCase("s") && !resposta1.equalsIgnoreCase("n")) {
            System.out.println("Resposta inv�lida, tente novamente");
            System.exit(0);
        }
        // Estrutura condicional
        System.out.print("Devia para a v�tima? S/N: ");
        String resposta4 = respostaUsuario.next();
        if (resposta4.equalsIgnoreCase("S")) {
            listaDeSim.add(1);
        } else if (!resposta1.equalsIgnoreCase("s") && !resposta1.equalsIgnoreCase("n")) {
            System.out.println("Resposta inv�lida, tente novamente");
            System.exit(0);
        }
        // Estrutura condicional
        System.out.print("J� trabalhou com a v�tima? S/N: ");
        String resposta5 = respostaUsuario.next();
        if (resposta5.equalsIgnoreCase("S")) {
            listaDeSim.add(1);
        } else if (!resposta1.equalsIgnoreCase("s") && !resposta1.equalsIgnoreCase("n")) {
            System.out.println("Resposta inv�lida, tente novamente");
            System.exit(0);
        }
        respostaUsuario.close();

        // Estrutura condicional
        if (listaDeSim.size() == 5) {
            System.out.println("Voc� � o assassino");
        } else if ((listaDeSim.size() >= 3) && (listaDeSim.size() < 5)) {
            System.out.println("Voc� � c�mplice");
        } else if (listaDeSim.size() == 2) {
            System.out.println("Voc� � suspeito");
        } else {
            System.out.println("Voc� � inocente");
        }
    }
}
