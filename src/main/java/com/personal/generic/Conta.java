package com.personal.generic;

import com.personal.util.SituacaoConta;

/**
 * Representa um conta
 * 
 * @since 3.0.0
 */
public class Conta{

    private String descricao;
    private Double valor;
    private String dataVencimento;
    protected SituacaoConta situacaoConta;

    protected Conta(){
        this.situacaoConta = SituacaoConta.PENDENTE;
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

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

    public void cancelar(){
        if(SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.printf("esta conta ja foi cancelada!: %s\n", this.getDescricao());
        }

        else if(SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.printf("esta conta ja foi paga, nao pode ser cancelada!: %s\n", this.getDescricao());
        }

        else{
			System.out.printf("Cancelando a conta: " + this.getDescricao());
			System.out.println();
            
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }
    
}