package canetaguanabara2;

public class Caneta {
    public String modelo; // Atributos
    public String cor; // Atributos
    public double ponta; // Atributos
    public int carga; // Atributos
    public boolean tampada; // Atributos


    public void statusCaneta() {
        System.out.println();
        System.out.println("-------- Informa��es sobre a caneta: --------");
        System.out.println("A caneta do modelo: " + this.modelo + "\nDe cor: " + this.cor
                + "\nCom a numera��o de ponta: " + this.ponta + "\nCom carga: " + this.carga + "%");


    }

    // M�todo
    public void tampar() {
        this.tampada = true;
        System.out.println("A sua caneta est� tampada");
    }

    public void destampar() {
        this.tampada = false;
        System.out.println("A sua caneta est� destampada");
    }

    //M�todo
    public void rabiscar() {
        if (tampada == true) {
            System.out.println("Erro, n�o posso rabiscar... destampe a caneta");
        } else {
            System.out.println("Rabiscando");
            System.out.println();

        }
    }


}
