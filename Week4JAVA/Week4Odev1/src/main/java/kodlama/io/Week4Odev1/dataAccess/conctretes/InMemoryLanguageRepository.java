package kodlama.io.Week4Odev1.dataAccess.conctretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.Week4Odev1.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Week4Odev1.entities.ProgramingLanguages;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	List<ProgramingLanguages> programingLanguages; // Liste!!!

	public InMemoryLanguageRepository() {
		programingLanguages = new ArrayList<ProgramingLanguages>();
		this.programingLanguages.add(new ProgramingLanguages(0, "Enes"));
		this.programingLanguages.add(new ProgramingLanguages(1, "Ceylan1"));
		this.programingLanguages.add(new ProgramingLanguages(2, "Ceylan2"));
		this.programingLanguages.add(new ProgramingLanguages(3, "Ceylan3"));
		this.programingLanguages.add(new ProgramingLanguages(4, "Ceylan4"));
		this.programingLanguages.add(new ProgramingLanguages(5, "Ceylan5"));
	}

	public void addLanguage(int id, String languageName) {
		programingLanguages.add(new ProgramingLanguages(id, languageName));
		// programingLanguages.add(new ProgramingLanguages(id, languageName));
		System.out.println(languageName + " dili eklendi.");
	}

	@Override
	public void deleteLanguage(int indexLanguage, String languageName) {

		programingLanguages.remove(indexLanguage);
		System.out.println(languageName + " dili silindi");

	}

	@Override
	public void updateLanguage(int indexLanguage, String languageName)  {

		programingLanguages.get(indexLanguage).setLanguageName(languageName);
		System.out.println(languageName + " dili güncellendi");

	}

	@Override
	public List<ProgramingLanguages> getLanguage() {

		return programingLanguages;
	}

}
