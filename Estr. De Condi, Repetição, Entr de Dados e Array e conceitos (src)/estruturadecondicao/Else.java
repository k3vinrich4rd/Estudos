package estruturadecondicao;


// Utilizando a estrutura Else (se n�o), em cotexto de aprova��o n�o permitida

public class Else {

    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18; // or = false
        // Estrutura condicional:
        if (isAutorizadoComprarBebida){
            System.out.println("Voc� pode comprar bebida alc�lica");
        }else{
            System.out.println("Voc� n�o pode comprar bebida alc�lica");
        }
    }
}
