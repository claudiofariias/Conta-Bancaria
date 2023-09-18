package Estudos;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("1. CONTA POUPANÇA");
        System.out.println("2. CONTA ESPECIAL");
        System.out.println("ESCOLHA O TIPO DE CONTA:");
        String funcao = input.nextLine();

        switch (funcao){
            case "1":
                System.out.print("NOME: ");
                String nome = input.nextLine();
                System.out.print("NUMERO DA CONTA: ");
                int numConta = input.nextInt();
                input.nextLine();
                System.out.print("DEPOSITO PARA INICIAR SALDO: ");
                double saldo = input.nextDouble();
                input.nextLine();
                System.out.print("DIA DE RENDIMENTO: ");
                int diaRendimento = input.nextInt();
                input.nextLine();

                ContaPoupanca cp1 = new ContaPoupanca(nome, numConta, saldo,diaRendimento);
                cp1.setCliente(nome);
                cp1.setSaldo(saldo);
                cp1.setNumConta(numConta);
                cp1.setDiaRendimento(diaRendimento);
                System.out.println("CONTA POUPANÇA CADASTRADA COM SUCESSO!");

                while(true) {
                    System.out.println("1. SACAR");
                    System.out.println("2. DEPOSITAR");
                    System.out.println("3. MOSTRAR SALDO (COM RENDIMENTO ps: apenas poupança)");
                    System.out.println("4. MOSTRAR DADOS CONTA");
                    System.out.print("Informe uma função: ");
                    funcao = input.nextLine();

                    switch (funcao) {
                        case "1":
                            System.out.print("QUANTO GOSTARIA DE SACAR: ");
                            double valor = input.nextDouble();
                            input.nextLine();
                            cp1.sacar(valor);
                            break;
                        case "2":
                            System.out.print("QUANTO GOSTARIA DE DEPOSITAR: ");
                            valor = input.nextDouble();
                            input.nextLine();
                            cp1.depositar(valor);
                            break;
                        case "3":
                            System.out.println("QUAL A TAXA DE RENDIMENTO");
                            double taxaRendimento = input.nextDouble();
                            input.nextLine();
                            cp1.calcularNovoSaldo(taxaRendimento);
                            System.out.println(cp1.getSaldo());
                            break;
                        case "4":
                            System.out.println("NOME: "+cp1.getCliente());
                            System.out.println("CONTA: "+cp1.getNumConta());
                            System.out.println("SALDO: "+cp1.getSaldo());
                            break;
                        case "0":
                            return;
                        default:
                            System.out.println("Função inválida");
                            break;
                    }
                }
            case "2":
                System.out.print("NOME: ");
                nome = input.nextLine();
                System.out.print("NUMERO DA CONTA: ");
                numConta = input.nextInt();
                input.nextLine();
                System.out.print("SALDO: ");
                saldo = input.nextDouble();
                input.nextLine();
                //System.out.print("LIMITE: ");
                //double limite = input.nextDouble();
                //input.nextLine();

                ContaEspecial ce1 = new ContaEspecial(nome, numConta, saldo);
                ce1.setCliente(nome);
                ce1.setNumConta(numConta);
                //ce1.setLimite(limite);
                System.out.println("CONTA ESPECIAL CADASTRADA COM SUCESSO!\n");

                while(true) {
                    System.out.println("1. SACAR");
                    System.out.println("2. DEPOSITAR");
                    System.out.println("3. MOSTRAR SALDO");
                    System.out.println("4. MOSTRAR DADOS CONTA");
                    System.out.println("0. SAIR");
                    System.out.print("Informe uma função: ");
                    funcao = input.nextLine();

                    double valor;
                    switch (funcao) {
                        case "1":
                            System.out.print("QUANTO GOSTARIA DE SACAR: ");
                            valor = input.nextDouble();
                            input.nextLine();
                            ce1.sacar(valor);
                            break;
                        case "2":
                            System.out.print("QUANTO GOSTARIA DE DEPOSITAR: ");
                            valor = input.nextDouble();
                            input.nextLine();
                            ce1.depositar(valor);
                            break;
                        case "3":
                            System.out.println("SALDO: " + ce1.getSaldo());
                            break;
                        case "4":
                            System.out.println("NOME: " + ce1.getCliente());
                            System.out.println("CONTA: " + ce1.getNumConta());
                            System.out.println("SALDO: " + ce1.getSaldo());
                            break;
                        case "0":
                            return;
                        default:
                            System.out.println("Função inválida");
                            break;
                    }
                }
        }
    }
}
