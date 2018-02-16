package br.com.fiap.config;

import java.io.IOException;
import java.util.Properties;

public class PropertySingleton {
	
	//3 - Construtor privado, para não ser instanciado
	private PropertySingleton() {

	}
	
	
	//1 - atributo estatico que armazena a única instância na aplicação
	private static Properties churros;
	
	//2 - método estático getInstance() que retorna a única instância
	public static Properties getInstance() {
		if(churros == null) {
			churros = new Properties();
			//carregar o objeto com os dados do arquivo propriedades
			try {
				churros.load(PropertySingleton.class.getResourceAsStream("/config.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return churros;
	}
}
