package interfacee;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // M�todo construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;

    }

    //M�todos Abstratos:
    @Override
    public void ligar() {
        this.setLigado(true);

    }

    //M�todos Abstratos:
    @Override
    public void desligar() {
        this.setLigado(false);
    }

    //M�todos Abstratos:
    @Override
    public void abrirMenu() {
        if (getLigado()) {
            System.out.println("Voc� est� no menu do seu controle: ");
            System.out.println("Est� ligado? " + this.getLigado());
            System.out.println("Est� tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());

            for (int contador = 0; contador <= this.getVolume(); contador += 10) {
                System.out.print("[]");
            }
        }else {
            System.out.println("Impossivel efetuar essa a��o a Tv est� desligada");
        }

    }


    //M�todos Abstratos:
    @Override
    public void fecharMenu() {
        System.out.println("Ok, fechando menu...");
    }

    //M�todos Abstratos:
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossivel aumentar volume");
        }

    }

    //M�todos Abstratos:
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);

        } else {
            System.out.println("Impossivel diminuir volume");
        }
    }

    //M�todos Abstratos:
    @Override
    public void ligarMudo() {
        if (this.getLigado() && getVolume() > 0) {
            this.setVolume(0);
        }else {
            System.out.println("A sua televis�o j� est� sem volume");
        }
    }

    //M�todos Abstratos:
    @Override
    public void deligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }else {
            System.out.println("O modo mudo da sua televis�o j� est� desabilitado");
        }
    }

    //M�todos Abstratos:
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("N�o consegui reproduzir ");
        }
    }

    //M�todos Abstratos:
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);

        } else {
            System.out.println("N�o consegui pausar");
        }
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

}
