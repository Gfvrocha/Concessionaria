package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {

    String nome, email, endereco;
    long telefone, cfp, rg;

    double comissao;

    /** Instanciar Scanner */
    Scanner teclado = new Scanner((System.in));

    List<Funcionario> listFuncionario = new ArrayList<>();


    public void cadastrarFuncionario(){

        System.out.println("----------------------------------------");
        System.out.println("=0=0=0=0= Cadastro Funcionario =0=0=0=0=");
        System.out.println("Qual é o nome do Funcionario: ");
        nome = teclado.nextLine();

        System.out.println("Informe o CPF: ");
        cfp = teclado.nextLong();

        System.out.println("Informe o Rg: ");
        rg = teclado.nextLong();

        System.out.println("Informe o Telefone: ");
        telefone = teclado.nextLong();
        teclado.nextLine();

        System.out.println("Informe o e-mail: ");
        email = teclado.nextLine();

        System.out.println("Informe o Endereço: ");
        endereco = teclado.nextLine();



        System.out.println("=0=0=0=0= Cadastro Finalizado =0=0=0=0=");
        System.out.println("----------------------------------------");

    }

    public void bonusVenda(Veiculo objVeiculo){

        comissao += objVeiculo.preco * 0.10;
        System.out.println("Você terá um bonus de R$" + comissao);
    }

    public void adicionarFuncionario(Funcionario objFuncionario){
        listFuncionario.add(objFuncionario);

    }

    public void listarFuncionario(){
        for(Funcionario objFuncionario : listFuncionario){
            System.out.println(objFuncionario.nome);


        }

    }
}
