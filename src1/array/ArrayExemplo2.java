package array;
//Declarando uma array:
public class ArrayExemplo2 {
    public static void main(String[] args) {
        // Quando tenho o tamanho, mas n�o a informa��o:
        int [] idades = new int[5]; // � um tipo de refer�ncia
        idades[0] = 20;
        idades[1] = 23;
        idades[2] = 44;
        idades[3] = 42;
        idades[4] = 20;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        System.out.println(idades[3]);
        System.out.println(idades[4]);

    }
}
