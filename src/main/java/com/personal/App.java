package com.personal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.personal.generic.Conta;
import com.personal.model.Cliente;
import com.personal.model.Fornecedor;
import com.personal.util.ContaPagar;
import com.personal.util.ContaReceber;
import com.personal.util.RelatorioContas;

/**
 * Classe responsavel por inicializar a aplicacao
 * 
 * @since 1.0.0
 */
public class App 
{
    public static void main( String[] args )
    {
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negocios Imobiliarios");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado so joao");

        Cliente atacadista = new Cliente();
        atacadista.setNome("Triangulo Quadrado Atacadista");
        Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicacoes");

        ContaPagar contaImo = new ContaPagar();
        contaImo.setDataVencimento("10/05/2020");
        contaImo.setDescricao("Aluguel da matriz");
        contaImo.setFornecedor(imobiliaria);
        contaImo.setValor(1230d);

        ContaPagar contaMerc = new ContaPagar("Compras do mes",
         390d, "10/12/2020", mercado);


        ContaReceber recAtacadista = new ContaReceber();
        recAtacadista.setDescricao("Desenvolvimento de projeto de logistica de Java");
        recAtacadista.setValor(89500d);
        recAtacadista.setDataVencimento("23/05/2020");
        recAtacadista.setCliente(atacadista);

        ContaReceber recTelecom = new ContaReceber(telecom, "Manutencao em sistema de conta online",
         52300d, "13/05.2012");

        
        RelatorioContas relatorio = new RelatorioContas();
        Set<Conta> conta = new HashSet<>();
        conta.add(contaImo);
        conta.add(contaMerc);
        conta.add(recAtacadista);
        conta.add(contaMerc);

        relatorio.exibirListagem(conta);

        //pagamento e calcelamento de contas a pagar.
        contaImo.pagar();
        contaMerc.cancelar();
        
        //pagamento e cancelamento de contas a receber
        recAtacadista.receber();
        recTelecom.cancelar();
    }
      
}
