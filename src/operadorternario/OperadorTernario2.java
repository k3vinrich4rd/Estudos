package operadorternario;

public class OperadorTernario2 { // Utilizando operador tern�rio com String (Corda)
    public static void main(String[] args) {
        double salario = 6000;
        String doar = "Vou doar 500 R$, para institui��o Kevin Richard";
        String naoDoar = "N�o vou doar para institui��o Kevin Richard";
        String resultado = salario > 5000 ? doar : naoDoar;

        System.out.println(resultado);
    }
}
