package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    /** Declarar Variaveis */

    String nome, email, endereco;
    long telefone, cfp, rg;

    double dinheiroDisponivel;

    /** Instanciar Scanner */
    Scanner teclado = new Scanner((System.in));

    List<Cliente> listCliente = new ArrayList<>();


    public void cadastrarCliente(){

        System.out.println("----------------------------------------");
        System.out.println("=0=0=0=0= Cadastro Cliente =0=0=0=0=");
        System.out.println("Qual é o nome do Cliente: ");
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

        System.out.println("Informe quanto você tem: [R$] ");
        dinheiroDisponivel = teclado.nextDouble();

        System.out.println("=0=0=0=0= Cadastro Finalizado =0=0=0=0=");
        System.out.println("----------------------------------------");




    }

    public void adicionarCliente(Cliente objCliente){
        listCliente.add(objCliente);

    }

    public void listarCliente(){
        for(Cliente objCliente : listCliente){
            System.out.println(objCliente.nome);


        }

    }

    public Cliente pesquisarComprador(String nome){

        for (Cliente cliente : listCliente){
            if (cliente.nome.equalsIgnoreCase(nome)){
                return cliente;
            }
        }
        return null;
    }
}
