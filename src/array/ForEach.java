package array;
// Usando ForEach com array:
public class ForEach {
    public static void main(String[] args) {
        int[] numero = new int[]{5, 4, 3, 2, 1};
        // ForEach n�o necessita de indices, pois ele se localiza atrav�s da chaves
        for (int num : numero) { // ForEach
            System.out.println(num + " ");
        }
    }
}