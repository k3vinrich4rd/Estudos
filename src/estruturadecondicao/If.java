package estruturadecondicao;

public class If { // Utilizando a estrutura If (Se) com um conectivo l�gico (! = nega��o)
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;

        System.out.println("Voc� pode comprar bebida alc�lica");

        if (!isAutorizadoComprarBebidaAlcolica) { // ! = nega��o)
            System.out.println("Voc� n�o pode comprar bebida alcolica");
        }
    }
}
