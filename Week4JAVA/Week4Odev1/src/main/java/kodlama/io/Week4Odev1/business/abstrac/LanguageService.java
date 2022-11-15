package kodlama.io.Week4Odev1.business.abstrac;

import java.util.List;

import kodlama.io.Week4Odev1.entities.ProgramingLanguages;

public interface LanguageService {
	List<ProgramingLanguages> getLanguage();
	void addLanguage(int id, String languageName);
	void deleteLanguage(String languageName);
	void updateLanguage(String languageNameOld, String languageName);
	public String getLanguageName(int languageId);
}
