package br.com.fiap.teste;

import java.util.Properties;

import br.com.fiap.config.PropertySingleton;

public class Teste {

	public static void main(String[] args) {
		
		//Recuperar as config do sistema
		Properties prop = PropertySingleton.getInstance();
		
		System.out.println(prop.getProperty("url"));
		
	}

}
