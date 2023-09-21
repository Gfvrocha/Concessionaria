package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Venda {

    Scanner teclado = new Scanner(System.in);

    public boolean realizarVenda(Veiculo objVeiculo, Cliente objCliente){

        if(objCliente.dinheiroDisponivel >= objVeiculo.preco){
            System.out.println("=0=0=0=0=0=0=0=    Parabéns     =0=0=0=0=0=0=0=0=0=");
            System.out.println("Olá " + objCliente.nome);
            System.out.println("Você acaba de adquirir um " + objVeiculo.modelo);
            System.out.println("No preço de " + objVeiculo.preco);
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

            return true;

        } else {
            System.out.println("Escolha um veiculo mais compativel com sua realidade!");
            return false;
        }

    }

    public boolean avaliaFormaPagamento(){
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
        System.out.println("Informe como deseja pagar");
        System.out.println("1 - À vista");
        System.out.println("2 - Financiamento");
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

        int formarPagamento = teclado.nextInt();
        teclado.nextLine();

        if (formarPagamento == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean realizarFinanciamento(Cliente cliente, Veiculo veiculo){

        System.out.println("=0=0=0= --- Financiamento --- =0=0=0=");
        System.out.println("Informe o Valor da Entrada: ");
        double valorEntrada = teclado.nextDouble();

        System.out.println("Informe em quantas parcelas: ");
        int parcelas = teclado.nextInt();
        teclado.nextLine();

        if (valorEntrada <= cliente.dinheiroDisponivel && valorEntrada > 0) {

            double valorFinanciado = veiculo.preco - valorEntrada;
            double valorParcelas = valorFinanciado / parcelas;

            System.out.println("O valor das parcelas será de " + valorParcelas);

            return true;
        }
        return false;
    }

}
