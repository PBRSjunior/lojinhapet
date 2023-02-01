package br.com.shoppingdosbichos.lojinhapet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class LojinhapetApplication {
	
	@GetMapping
	public String getHomeTeste() {
		return "Teste Lojinha Pet";
	}


	public static void main(String[] args) {
		SpringApplication.run(LojinhapetApplication.class, args);
	}

}
