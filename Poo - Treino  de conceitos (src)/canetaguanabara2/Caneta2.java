package canetaguanabara2;

public class Caneta2 {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public Caneta2(String modelo, String cor, double ponta, int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;

    }

    public void status() {
        System.out.println("----- Informa��es sobre a caneta -----");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta da cor: " + this.cor);
        System.out.println("Carga: " + this.carga + "% de tinta");
        System.out.println("Est� tampada? " + this.tampada);

    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void escrever() {
        if (this.tampada) {
            System.out.println("Impossivel escrever, a caneta est� tampada\n");
        } else {
            System.out.println("A caneta est� escrevendo\n");
        }
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Impossivel efetuar est� a��o, destampe a caneta\n");
        } else {
            System.out.println("A caneta est� rabiscando\n");
        }
    }

    public void pintar() {
        if (this.tampada) {
            System.out.println("Impossivel efetuar a pintura, destampe a caneta\n");
        } else {
            System.out.println("A caneta est� pitando\n");
        }

    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }



}


