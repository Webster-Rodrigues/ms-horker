package com.webprojects.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	//Registra uma instância única de um obj do tipo RestTemplate. Essa instância fica disponível para injetar em outros componentes 
	//Cria um componente a partir de um método ao invés de colocar a @Component
	@Bean
	public RestTemplate registerRestTemplate() {
		return new RestTemplate();
	}
}
