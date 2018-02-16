package br.com.fiap.loja.teste;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Scanner;

import br.com.fiap.configLoja.PropertySingletonLoja;
import br.com.fiap.loja.bean.ProdutoTo;
import br.com.fiap.loja.bo.EstoqueBO;

public class TerminalConsultaProdutos {

	static DecimalFormat df = new DecimalFormat("R$ #,###.00");
	static Scanner scanner = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm");

	public static void main(String[] args) {

		Integer cdProd = 0;
		EstoqueBO bo = new EstoqueBO();

		do {

			System.out.println("Digite o código que deseja consultar: ");
			cdProd = scanner.nextInt();

			ProdutoTo prod = bo.consultarProduto(cdProd);
			Properties prop = PropertySingletonLoja.getInstance();
			if (prod != null) {

					System.out.println(
							"Loja: " +prop.getProperty("nomeLoja") + " Hora: " + sdf.format(Calendar.getInstance().getTime()));
				System.out.println(prod.getNome());
				System.out.println(prod.getPreco());
				System.out.println(prod.getQuant());

			} else if(cdProd !=0)
				System.out.println("Produto não cadastrado!");
			  else 
				System.out.println("Fim da consulta!");
			
		} while (cdProd != 0);
	}
}
