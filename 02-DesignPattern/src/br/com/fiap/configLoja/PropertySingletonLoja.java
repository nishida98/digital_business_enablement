package br.com.fiap.configLoja;

import java.io.IOException;
import java.util.Properties;

public class PropertySingletonLoja {
	
	//3 - Construtor privado, para n�o ser instanciado
	private PropertySingletonLoja() {

	}
	
	
	//1 - atributo estatico que armazena a �nica inst�ncia na aplica��o
	private static Properties churros;
	
	//2 - m�todo est�tico getInstance() que retorna a �nica inst�ncia
	public static Properties getInstance() {
		if(churros == null) {
			churros = new Properties();
			//carregar o objeto com os dados do arquivo propriedades
			try {
				churros.load(PropertySingletonLoja.class.getResourceAsStream("/loja.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return churros;
	}
}
