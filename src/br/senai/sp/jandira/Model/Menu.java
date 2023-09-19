package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {

    public void menu(){

        Scanner teclado = new Scanner(System.in);


        Cliente refListCliente = new Cliente();
        Funcionario refListFuncionario = new Funcionario();
        Veiculo refListVenda = new Veiculo();
        Veiculo refListVeiculo = new Veiculo();

        Venda objVenda = new Venda();




        boolean continuar = true;

        while(continuar){

            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
            System.out.println("=0=0=        MENU       =0=0=");
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Veiculo");
            System.out.println("3 - Cadastrar Funcionario");
            System.out.println("4 - Realizar Venda");
            System.out.println("5 - Listar Veiculo");
            System.out.println("6 - Listar Cliente");
            System.out.println("7 - Listar Funcionario");
            System.out.println("8 - Pesquisar Veiculo");
            System.out.println("9 - Sair");
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
            System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=\n");

            int escolaUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (escolaUsuario){

                case 1:
                    Cliente objCliente = new Cliente();
                    objCliente.cadastrarCliente();
                    refListCliente.adicionarCliente(objCliente);
                    break;

                case 2:
                    Veiculo objVeiculo = new Veiculo();
                    objVeiculo.cadastrarVeiculo();
                    refListVenda.adicionarVeiculo(objVeiculo);
                    break;

                case 3:
                    Funcionario objFuncionario = new Funcionario();
                    objFuncionario.cadastrarFuncionario();
                    refListFuncionario.adicionarFuncionario(objFuncionario);
                    break;

              /*  case 4:
                    boolean validaVenda =  objVenda.realizarVenda(objVeiculo, objCliente);

                    if (validaVenda){
                        objCliente.dinheiroDisponivel -= objVeiculo.preco;
                        System.out.println("O saldo do cliente é: " + objCliente.dinheiroDisponivel);

                        objFuncionario.bonusVenda(objVeiculo);
                    }

                    break;

               */

                case 5:
                    refListVenda.listarVeiculos();

                    break;

                case 6:
                    refListCliente.listarCliente();
                    break;

                case 7:
                    refListFuncionario.listarFuncionario();
                    break;

                case 8:
                    System.out.println("Informe o modelo do veiculo: ");
                    String veiculoPesquisado = teclado.nextLine();
                    boolean validaVeiculo = false;

                    if (veiculoPesquisado != null && veiculoPesquisado != "") {
                        validaVeiculo = refListVeiculo.pesquisarVeiculo(veiculoPesquisado);
                    }

                    if (validaVeiculo){
                        System.out.println("Veiculo Disponivel para Compra !!");
                    } else {
                        System.out.println("Veiculo Indisponivel !!");
                    }

                    break;

                case 9:
                    continuar = false;
                    break;


            }

            if(escolaUsuario < 1 || escolaUsuario > 9){
                System.out.println("Escolha uma opção Válida!");
            }



        }



    }
}
