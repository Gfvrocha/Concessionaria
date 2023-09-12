package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {

    public void menu(){

        Scanner teclado = new Scanner(System.in);

        Cliente objCliente = new Cliente();
        Funcionario objFuncionario = new Funcionario();
        Venda objVenda = new Venda();
        Veiculo objVeiculo = new Veiculo();


        boolean continuar = true;

        while(continuar){

            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
            System.out.println("=0=0=        MENU       =0=0=");
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Veiculo");
            System.out.println("3 - Cadastrar Funcionario");
            System.out.println("4 - Realizar Venda");
            System.out.println("5 - Sair");
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

            int escolaUsuario = teclado.nextInt();

            switch (escolaUsuario){
                case 1:
                    objCliente.cadastrarCliente();
                    break;

                case 2:
                    objVeiculo.cadastrarVeiculo();
                    break;

                case 3:
                    objFuncionario.cadastrarFuncionario();
                    break;

                case 4:
                    boolean validaVenda =  objVenda.realizarVenda(objVeiculo, objCliente);

                    if (validaVenda){
                        objCliente.dinheiroDisponivel -= objVeiculo.preco;
                        System.out.println("O saldo do cliente é: " + objCliente.dinheiroDisponivel);

                        objFuncionario.bonusVenda(objVeiculo);
                    }

                    break;

                case 5:
                    continuar = false;
                    break;
            }

            if(escolaUsuario < 1 || escolaUsuario > 5){
                System.out.println("Escolha uma opção Válida!");
            }



        }



    }
}
