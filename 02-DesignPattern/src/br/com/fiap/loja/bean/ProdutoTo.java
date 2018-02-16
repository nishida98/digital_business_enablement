package br.com.fiap.loja.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProdutoTo implements Serializable{
	
	private Integer codProduto;
	private String nome;
	private Double preco;
	private Integer quant;
	
	public Integer getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuant() {
		return quant;
	}
	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	
}
