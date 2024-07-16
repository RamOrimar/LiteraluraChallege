package com.challege.literalalura;

import com.challege.literalalura.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteralaluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteralaluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMeu();

	}
}
