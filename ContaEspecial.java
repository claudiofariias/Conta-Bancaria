package Estudos;

public class ContaEspecial extends ContaBancaria{
    private Double limite;

    public ContaEspecial(String cliente, int numConta, double saldo){
        super(cliente, numConta, saldo);
        this.limite = -100.0;
    }
    public Double getLimite(){
        return limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    @Override
    public void sacar(double valor) {
        if(getSaldo() <= limite){
            System.out.println("LIMITE ATINGIDO!");
        }else{
            double saldoAposSaque = saldo -= valor;
            setSaldo(saldoAposSaque);
            System.out.println("SALDO ATUALIZADO APÓS SAQUE\nR$"+getSaldo());

        }
    }
}
