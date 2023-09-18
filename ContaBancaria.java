package Estudos;

public class ContaBancaria {
    private String cliente;
    private Integer numConta;
    protected Double saldo;

    public ContaBancaria(String cliente, int numConta){
        this.cliente = cliente;
        this.numConta = numConta;
    }

    public ContaBancaria(String cliente, int numConta, double saldo){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor){
        if(saldo > valor){
            double saldoAposSaque = saldo -= valor;
            setSaldo(saldoAposSaque);
            System.out.println("SALDO ATUALIZADO APÓS SAQUE\nR$"+getSaldo());
        }else{
            System.out.println("O valor do saque não pode ser maior do que o valor em conta!");
        }
    }
    public void depositar(double valor){
        double saldoAposDeposito = saldo += valor;
        setSaldo(saldoAposDeposito);
        System.out.println("SALDO ATUALIZADO APÓS DEPÓSITO\nR$" +getSaldo());

    }
}
