package br.com.jv.estudos.boleto.caixa;

import java.util.List;

import br.com.jv.estudos.boleto.Boleto;
import br.com.jv.estudos.nfe.NFe;
import br.com.jv.estudos.produto.Produto;

public class BoletoCaixa implements Boleto {

	@Override
	public void emitir(List<Produto> produtos, NFe nfe) {
		System.out.println("------------------------------------ Boleto - Caixa Econômica Federal ------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println("|              DESCRIÇÃO              |        QUANTIDADE        |        VALOR UNITÁRIO        |  IMPOSTO  |           VALOR TOTAL          |");
		produtos.forEach(p -> {
			System.out.println("|    " + p.getDescricao() + "    |   " + p.getQuantidade() + "   |   " + p.getValor() + "   |   " + nfe.calcularImposto(p) + "   |   " + p.getValorTotal());
		});
		System.out.println("----------------------------------------------------------------------------------------------------------");
	}

}
