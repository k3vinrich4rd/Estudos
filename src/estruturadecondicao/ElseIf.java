package estruturadecondicao;

public class ElseIf {
    public static void main(String[] args) {
        int idade = 19;
        if (idade < 15){
            System.out.println("Categoria infatil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Cat�goria juvenil ");
        } else {
            System.out.println("Cat�goria adulta");
        }
    }
}
