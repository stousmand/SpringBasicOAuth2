package sto.spb.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="sto.spb.oauth2")
public class Oauth2BasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2BasicApplication.class, args);
	}
	
}
