package calculadora4;
// Criando uma classe:
public class Calculadora4 {
    public void imprimeDivisaoDeDoisNumeros(double numero1, double numero2){
        if (numero2 == 0){
            System.out.println("N�o existe divis�o por zero");
            return;
        }// else {
        System.out.println(numero1 / numero2);
    } // }  (Outra forma de fazer)
}
