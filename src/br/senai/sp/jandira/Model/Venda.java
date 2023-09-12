package br.senai.sp.jandira.Model;

public class Venda {

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
}
