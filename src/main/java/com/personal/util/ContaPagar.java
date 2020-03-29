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

    public ContaPagar(){}

	public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
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
    
    public void pagar(){
        System.out.println("******************************");
        System.out.printf("Descricao da conta: %s\n", this.getDescricao());
        System.out.printf("Valor: %f\n", this.getValor());
        System.out.printf("Data de Vencimento: %s\n", this.getDataVencimento());
        System.out.printf("Fornecedor: %s\n", this.getFornecedor().getNome());
        System.out.println();
    }


}