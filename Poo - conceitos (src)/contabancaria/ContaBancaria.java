package contabancaria;

// Modelando uma classe conta banco:
public class ContaBancaria { // Classe
    public int numeroDaConta; // Atributo
    protected String tipo;  // Atributo

    private String donoDaConta;  // Atributo
    private double saldo; // Atributo
    private boolean status;  // Atributo


    public ContaBancaria() { // M�todo construtor
        this.saldo = 0;
        this.status = false;


    }

    // M�todo personalizado

    public void estadoAtual() {
        System.out.println();
        System.out.println("Conta: " + this.getNumeroDaConta());
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono da conta " + this.getDonoDaConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status : " + this.getStatus());

    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo); // Acessando a informa��o diretamente do m�todo modificador
        this.setStatus(true);
        if (tipo == "Conta corrente") {
            this.setSaldo(50);
        } else if (tipo == "Conta poupan�a") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    // M�todo personalizado

    public void fecharConta() {
        if (this.getSaldo() > 0) { // Acessando a informa��o diretamente do m�todo de acesso
            System.out.println("Impossivel executar est� a��o, saldo existente na conta");
        } else if (this.getSaldo() < 0) { // Acessando a informa��o diretamente do m�todo de acesso
            System.out.println("Impossivel executar est� a��o, d�bito existente na conta");
        } else {
            this.setStatus(false); // Acessando a informa��o diretamente do m�todo modificador
            System.out.println("A sua conta foi fechada com sucesso");
        }
    }

    // M�todo personalizado
    public void depositar(double valor) {
        if (this.getStatus()) {
            // this.saldo += this.saldo + valor;
            this.setSaldo(this.getSaldo() + valor);// Acessando a informa��o diretamente do m�todo modificador e de acesso
            System.out.println("O seu deposito foi realizado na conta de " + this.getDonoDaConta());
        } else {
            System.out.println("Impossivel fazer um deposito, a sua conta est� fechada");
        }
    }

    // M�todo personalizado
    public void sacar(double valor) {
        if (this.getStatus()) {
            //if (status == true) {
            if (this.getSaldo() >= valor) { // Acessando a informa��o diretamente do m�todo modificador
                // saldo -= valor;
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDonoDaConta());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel efetuar saques de uma conta fechada!");
        }
    }

    // M�todo personalizado
    public void pagarMensal() {
        double v= 0;
        if (this.getTipo() == "CC") {
            v = 12;

        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDonoDaConta());
        } else {
            System.out.println("Impossivel pagar os d�bitos de uma conta fechada!");
        }

    }

    //M�todo especial
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    //M�todo especial
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    //M�todo especial
    public String getTipo() {
        return tipo;
    }

    //M�todo especial
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //M�todo especial
    public String getDonoDaConta() {
        return donoDaConta;
    }
    //M�todo especial

    public void setDonoDaConta(String donoDaConta) {
        this.donoDaConta = donoDaConta;
    }

    //M�todo especial
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

