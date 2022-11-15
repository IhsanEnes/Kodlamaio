package kodlama.io.Week4Odev1.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Week4Odev1.entities.ProgramingLanguages;

public interface LanguageRepository {
	void addLanguage(int id, String languageName);
	void deleteLanguage(int indexLanguage, String languageName);
	void updateLanguage(int indexLanguage, String languageName);
	List<ProgramingLanguages> getLanguage();

}
