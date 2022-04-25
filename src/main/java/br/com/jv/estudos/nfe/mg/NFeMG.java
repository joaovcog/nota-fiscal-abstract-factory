package br.com.jv.estudos.nfe.mg;

import java.math.BigDecimal;

import br.com.jv.estudos.nfe.NFe;
import br.com.jv.estudos.produto.Produto;

public class NFeMG implements NFe {

	@Override
	public Double calcularImposto(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.17");
		
		return imposto.multiply(produto.getValor()).doubleValue();
	}

}
