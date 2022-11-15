package kodlama.io.Week4Odev1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kodlama.io.Week4Odev1.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Week4Odev1.dataAccess.conctretes.InMemoryLanguageRepository;

@SpringBootApplication
public class Week4Odev1Application {

	public static void main(String[] args) {
		SpringApplication.run(Week4Odev1Application.class, args);
		
		
	}

}
