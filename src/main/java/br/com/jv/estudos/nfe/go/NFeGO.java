package br.com.jv.estudos.nfe.go;

import java.math.BigDecimal;

import br.com.jv.estudos.nfe.NFe;
import br.com.jv.estudos.produto.Produto;

public class NFeGO implements NFe {

	@Override
	public Double calcularImposto(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.12");
		
		return imposto.multiply(produto.getValor()).doubleValue();
	}

}
