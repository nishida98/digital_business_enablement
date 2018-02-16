package br.com.fiap.loja.bo;


import br.com.fiap.loja.bean.ProdutoTo;

public class EstoqueBO {

	public ProdutoTo consultarProduto(Integer cdProd) {

		ProdutoTo to = null;

		switch (cdProd) {

		case 401:
			to = new ProdutoTo();
			to.setCodProduto(401);
			to.setPreco(40.00);
			to.setNome("Camiseta Masculina Manga Curta Branca");
			to.setQuant(50);
			break;
		case 402:
			to = new ProdutoTo();
			to.setCodProduto(402);
			to.setPreco(90.99);
			to.setNome("Camiseta Feminina Manga Longa Azul");
			to.setQuant(10);
			break;
		}

		return to;
	}

}
