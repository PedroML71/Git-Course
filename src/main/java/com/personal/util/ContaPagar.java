package com.personal.util;

import com.personal.model.Fornecedor;
/**
 * Classe resposnavel por gerenciar os pagamentos que o usuario tem com algum fornecedor.
 * 
 */
public class ContaPagar{

    private String descricao;
    private Double valor;
    private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;

    public ContaPagar(){
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
		this();

		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
    }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}
	
	/**
	 * Classe responsavel por verificar o estado da conta e realizar o pagamento.
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

	/**
	 * Classe responsavel por verificar o estado da conta e realizar o cancelamento.
	 * 
	 * @since 2.0.0
	 */
	public void cancelar(){
		if(SituacaoConta.PAGA.equals(this.getSituacaoConta())){
			System.out.println("Esta conta ja esta paga!");
		}

		else if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
			System.out.println("esta conta ja foi cancelada!");
		}

		else{
			System.out.printf("Cancelando a conta: %s\n" , this.getDescricao());
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
	}

}