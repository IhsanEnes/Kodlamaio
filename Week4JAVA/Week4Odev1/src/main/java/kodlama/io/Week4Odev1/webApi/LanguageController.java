package kodlama.io.Week4Odev1.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Week4Odev1.business.abstrac.LanguageService;
import kodlama.io.Week4Odev1.entities.ProgramingLanguages;

@RestController
@RequestMapping("/api/brands")
public class LanguageController {
	private LanguageService languageService;

	public LanguageController(LanguageService languageService) {

		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<ProgramingLanguages> getAll() {
		return languageService.getLanguage();
	}
	@GetMapping("/getname")
	public String getLanguageName() {
		return languageService.getLanguageName(6);
	}
	@GetMapping("/add")
	public void add() {
		languageService.addLanguage(58, "İhsan");
	}

	@GetMapping("/delete")
	public void delete() {
		languageService.deleteLanguage("Enes");
	}

	@GetMapping("/update")
	public void update() {
		languageService.updateLanguage("Enes", "Ceylan1");
	}

}
