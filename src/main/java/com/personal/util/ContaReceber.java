package com.personal.util;

import com.personal.generic.Conta;
import com.personal.model.Cliente;

/**
 * Classe responsavel por gerenciar os recebimentos 
 * que o cliente tem com o usuario
 * 
 * @since 3.0.0
 */
public class ContaReceber extends Conta{

    private Cliente cliente;

    public ContaReceber(){
        super();
    }

	public ContaReceber(Cliente cliente,String descricao,Double valor,String dataVencimento){
        super();
        
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
    }
    

    /**
     * metodo que vai verificar a situacao e 
     * o valor da conta e cancela-la
     * 
     * @since 3.0.0
     */
    @Override
    public void cancelar(){
        if(this.getValor() > 50000){
            System.out.printf("Esta conta nao pode ser cancelada: %s\n",
            this.getDescricao());
            System.out.println("seu valor e grande de mais!");
        }

        else{
            super.cancelar();
        }
    }

    /**
     * Metodo que vai verificar a situacao da conta
     * e realizar o recebimento de um pagamento 
     * feito por um cliente
     * 
     * @since 3.0.0
     */
    public void receber(){
        if(SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.printf("nao pode receber algo que ja esta pago! %s\n",
            this.getDescricao());
        }

        else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.printf("nao pode receber algo que esta cancelado! %s\n",
            this.getDescricao());
        }

        else{
            System.out.println("****************");
            System.out.printf("Recenbendo Conta: %s\n", this.getDescricao());
            System.out.printf("Valor: %.2f\n", this.getValor());
            System.out.printf("Vencimento em: %s\n", this.getDataVencimento());
            System.out.printf("Cliente: %s\n", this.cliente.getNome());
            System.out.println();
        }
    }

}