package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Veiculo {

    /** Declarar Variaveis */
    String modelo, marca, cor, placa, combustivel;
    double preco;
    int ano;

    /** Instanciar Scanner */
    Scanner teclado = new Scanner((System.in));

    List<Veiculo> listVeiculos = new ArrayList<>();

    public void cadastrarVeiculo(){

        System.out.println("----------------------------------------");
        System.out.println("=0=0=0=0= Cadastro de Veiculo =0=0=0=0=");
        System.out.println("Informe a Marca: ");
        marca = teclado.nextLine();
        System.out.println("Informe o Modelo: ");
        modelo = teclado.nextLine();
        System.out.println("Informe a Cor: ");
        cor = teclado.nextLine();
        System.out.println("Informe o Combustivel: ");
        combustivel = teclado.nextLine();
        System.out.println("Informe o Ano: ");
        ano = teclado.nextInt();
        System.out.println("Informe o Preço: ");
        preco = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("=0=0=0=0= Cadastro Finalizado =0=0=0=0=");
        System.out.println("----------------------------------------");


    }

    public void adicionarVeiculo(Veiculo objVeiculo){
        listVeiculos.add(objVeiculo);

    }

    public void listarVeiculos(){
        for(Veiculo objVeiculo : listVeiculos){
            System.out.println(objVeiculo.modelo);
        }
    }

    public boolean pesquisarVeiculo(String veiculoPesquisado){
        for(Veiculo objVeiculo : listVeiculos){
            if (objVeiculo.modelo.equalsIgnoreCase(veiculoPesquisado)){
                return true;
            }
        }
        return false;
    }
}
