package br.senai.sp.jandira;

import br.senai.sp.jandira.Model.Cliente;
import br.senai.sp.jandira.Model.Veiculo;

public class App {
    public static void main(String[] args) {

        /** Instanciar Cliente */

        Cliente objCliente = new Cliente();

        objCliente.CadastrarCliente();

        /** Instanciar Veiculo */
        Veiculo objVeiculo = new Veiculo();

        objVeiculo.CadastrarVeiculo();
    }

}
