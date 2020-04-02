package com.personal.util;

import com.personal.generic.Conta;
import com.personal.model.Fornecedor;
/**
 * Classe resposnavel por gerenciar os pagamentos que o usuario tem com algum fornecedor.
 * 
 * @since 1.0.0
 */
public class ContaPagar extends Conta{

	private Fornecedor fornecedor;
	

    public ContaPagar(){
		super();
	}

	public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
		super();
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
		this.fornecedor = fornecedor;
    }

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	
	/**
	 * Classe responsavel por verificar o estado 
	 * da conta e realizar o pagamento a um fornecedor.
	 * 
	 * @since 2.0.0
	 */
    public void pagar(){
        if(SituacaoConta.PAGA.equals(this.getSituacaoConta())){
			System.out.println("Nao pode pagar algo que ja esta pago");
		}

		else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
			System.out.println("nao pode pagar algo que ja esta cancelado");
		}

		else{
			System.out.println("*******************");
			System.out.printf("Pagando Conta: %s\n" , this.getDescricao());
			System.out.printf("Valor: %.2f\n" , this.getValor());
			System.out.printf("Vencimento em: %s\n" , this.getDataVencimento());
			System.out.printf("Fornecedor: %s\n" , this.getFornecedor().getNome());
			System.out.println();

			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Conta a pagar");
		System.out.printf("Fornecedor: %s\n" , this.getFornecedor().getNome());
		System.out.printf("Descricao: %s\n" , this.getDescricao());
		System.out.printf("Valor: %.2f\n" , this.getValor());
		System.out.printf("Data de Vencimento: %s\n" , this.getDataVencimento());
		System.out.println("Situacao Conta: " + this.getSituacaoConta());
		System.out.println("*******************");
	}

}