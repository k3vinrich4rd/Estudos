package calculadora;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); // Objeto
        calculadora.calculadoraDeDoisNumeros(); // Executando o m�todo
        System.out.println("Finalizando clculos");
        calculadora.subtracaoDeDoisNumeros();
    }
}
