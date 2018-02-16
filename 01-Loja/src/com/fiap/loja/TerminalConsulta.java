package com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
/**
 * Classe para consultar produtos 
 * 
 * @author Leonardo Nishida
 * 
 */
public class TerminalConsulta {

	static Scanner scanner = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	
	public static void main(String[] args) {
		String resp = "SIM";
		 do {

			Integer cod = lerCodigo();
			informarProduto(cod);
			
			System.out.print("Deseja consultar outro produto? ");
			scanner.next().toUpperCase();
		} while (resp.equalsIgnoreCase("SIM"));
	
		 System.out.println("Fim da consulta! ;)");
	}
	
	/**
	 * M�todo para ler o c�digo 
	 * 
	 */
	
	public static Integer lerCodigo() {
		
		Integer codigo = 0;
		
		System.out.print("Digite o codigo do prduto desejado: ");
		codigo=scanner.nextInt();
		
		return codigo;
		
	}
	
	/**
	 * M�todo para informar a descri��o dos produtos
	 * 
	 * @param codigo
	 * 
	 */
	
	public static void informarProduto(Integer codigo) {
		
		switch (codigo) {
		case 401:
			System.out.println("Camiseta Masculina Manga Curta Branca.");
			System.out.println("FIAP " + sdf.format(Calendar.getInstance().getTime()));
			break;
		case 402:
			System.out.println("Camiseta Feminina Manga Longa Rosa.");
			System.out.println("FIAP " + sdf.format(Calendar.getInstance().getTime()));
			break;
		default:
			System.out.println("Produto N�o Cadastrado!");
			System.out.println("FIAP " + sdf.format(Calendar.getInstance().getTime()));
			break;
		}
		
	}
}
