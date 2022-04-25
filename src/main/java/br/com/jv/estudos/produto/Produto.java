package br.com.jv.estudos.produto;

import java.math.BigDecimal;

public class Produto {

	private String descricao;
	private Integer quantidade;
	private BigDecimal valor;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValorTotal() {
		return valor.multiply(new BigDecimal(quantidade));
	}
	
}
