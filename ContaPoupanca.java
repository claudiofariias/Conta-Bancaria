package Estudos;

public class ContaPoupanca extends ContaBancaria {
    private Integer diaRendimento;

    public ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    public Integer getDiaRendimento(){
        return diaRendimento;
    }
    public void setDiaRendimento(int diaRendimento){
        this.diaRendimento = diaRendimento;
    }
    public void calcularNovoSaldo(double taxaRendimento){
        double novoValor = (taxaRendimento/100) * saldo + saldo; // taxa de rendimento é acrescentandata em porcentagem
        setSaldo(novoValor);
    }
}
