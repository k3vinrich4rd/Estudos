public class If {
    public static void main(String[] args) {
        int idade = 25;
        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;

        System.out.println("Voc� pode comprar bebida alc�lica");

        if (!isAutorizadoComprarBebidaAlcolica) {
            System.out.println("Voc� n�o pode comprar bebida alcolica");
        }
    }
}
