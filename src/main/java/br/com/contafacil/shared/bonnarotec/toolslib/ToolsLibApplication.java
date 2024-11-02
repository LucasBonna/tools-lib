package br.com.contafacil.shared.bonnarotec.toolslib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {
		HibernateJpaAutoConfiguration.class,
		DataSourceAutoConfiguration.class
})
public class ToolsLibApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToolsLibApplication.class, args);
	}

}
