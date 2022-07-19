package array.array;

public class ArrayAula {
    public static void main(String[] args) {
        double[] horarioAcordados = new double[60];

        horarioAcordados[0] = 9.00;
        horarioAcordados[1] = 10.0;
        horarioAcordados[2] = 7.39;
        horarioAcordados[4] = 6.54;
        horarioAcordados[5] = 8.54;
        horarioAcordados[6] = 7.54;

        System.out.println( "O hor�rio do 3� dia foi:  " + horarioAcordados[2]);
        // Array utiliza length para pegar o tamanho da lista
        System.out.println(horarioAcordados.length);


        for (int i = 0; i < horarioAcordados.length; i++) {
            System.out.println("O hor�rio que voc� acordou no : " + (i + 1) + "� dia foi: " + horarioAcordados[i] );
        }

        int contador = 0;
        while (contador < horarioAcordados.length){
            System.out.println("O hor�rio que voc� acordou no : " + (contador + 1) + "� dia foi: " + horarioAcordados[contador] );
            contador++;
        }
    }
}
