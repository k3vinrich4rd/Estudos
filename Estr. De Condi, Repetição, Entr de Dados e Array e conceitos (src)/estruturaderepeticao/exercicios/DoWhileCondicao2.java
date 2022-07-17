package estruturaderepeticao.exercicios;
// Utilizando uma estrutura de repeti��o (do while):
import java.util.Scanner;

public class DoWhileCondicao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String respostaDaProfessora;
        double nota1;
        double nota2;
        double nota3;
        double media;
        int contadorDeVerificacao = 0;
        // Estrutura de repeti��o:
        do {
            System.out.print("Informe a primeira nota: ");
            nota1 = entrada.nextDouble();

            System.out.print("Informe a segunda nota: ");
            nota2 = entrada.nextDouble();

            System.out.print("Informe a terceira nota: ");
            nota3 = entrada.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;
            contadorDeVerificacao+=1;

            System.out.print("Quer continuar somando as m�dias dos alunos? [Sim/N�o]: ");
            respostaDaProfessora = entrada.next();
            if (respostaDaProfessora.equals("s")){
                contadorDeVerificacao += 1;
            }
            // loop
        }while (respostaDaProfessora.equalsIgnoreCase("sim"));
        System.out.printf("A m�dia do aluno �: %.2f " , media);
        System.out.println("\nVoc� verificou a m�dia dos alunos " + contadorDeVerificacao + " vez(es)");
    }
}