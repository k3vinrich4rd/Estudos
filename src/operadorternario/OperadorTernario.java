package operadorternario;

public class OperadorTernario { // utilizando operador tern�rio e if (se) e else (se n�o)
    public static void main(String[] args) {
        double salario = 5000;
        String doar = "Eu vou doar 500 R$ para institui��o Kevin Richard";
        String naoDoar = "Eu n�o vou doar para institui��o Kevin Richard";
        String resultado = null;

        if (salario > 5000){
            resultado = doar;
        }else{
            resultado = naoDoar;
        }
        System.out.println(resultado);
    }
}
