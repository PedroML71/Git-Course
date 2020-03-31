package com.personal;

import com.personal.model.Fornecedor;
import com.personal.util.ContaPagar;

/**
 * Classe responsavel por inicializar a aplicacao
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negocios Imobiliarios");
       
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado so joao");

        ContaPagar ContaImo = new ContaPagar();
        ContaImo.setDataVencimento("10/05/2020");
        ContaImo.setDescricao("Aluguel da matriz");
        ContaImo.setFornecedor(mercado);
        ContaImo.setValor(1230d);

        ContaPagar ContaMerc = new ContaPagar("Compras do mes",
         390d, "10/12/2020", mercado);

        //pagamento de conta pendente, deve funcionar.
        ContaImo.pagar();
        
        //pagamento de conta cancelada , nao deve funcionar
        ContaMerc.cancelar();
        ContaMerc.pagar();

        //pagamento de conta que ja esta paga, nao deve funcionar
        ContaImo.pagar();
    }
}
