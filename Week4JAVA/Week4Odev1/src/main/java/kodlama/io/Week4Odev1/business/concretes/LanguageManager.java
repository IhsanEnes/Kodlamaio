package kodlama.io.Week4Odev1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Week4Odev1.business.abstrac.LanguageService;
import kodlama.io.Week4Odev1.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Week4Odev1.entities.ProgramingLanguages;

@Service
public class LanguageManager implements LanguageService {

	LanguageRepository languageRepository;

	public LanguageRepository getLanguageRepository() {
		return languageRepository;
	}

	@Autowired
	public void setLanguageRepository(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	
	public List<ProgramingLanguages> getLanguage() {
		
		return languageRepository.getLanguage();
	}
	
	public String getLanguageName(int languageId) {  //Language id ile language name getirir.	
		boolean checkStateId = false;
		String LanguageName = "Null";
		List<ProgramingLanguages> programingLanguages = languageRepository.getLanguage();
		for (int i = 0; i < programingLanguages.size(); i++) {
			if (programingLanguages.get(i).getLanguagesId() == languageId) {
				LanguageName = programingLanguages.get(i).getLanguageName();
				checkStateId = true;
			}	
			else {
				checkStateId = false;
			}
		}
		if(checkStateId == false) {
			System.out.println(languageId + " Id'li dil mevcut değil.");
		}
		
		return LanguageName;
		
	}
	

	public void addLanguage(int id, String languageName) {
		boolean checkStateAdd = false;
		List<ProgramingLanguages> programingLanguages = languageRepository.getLanguage();
		for (int i = 0; i < programingLanguages.size(); i++) {
			if (programingLanguages.get(i).getLanguageName().equals(languageName)) {
				checkStateAdd = true;
				break;
			}

		}
		if (checkStateAdd) {
			System.out.println(languageName + " dili zaten mevcut.");
		} else {
			languageRepository.addLanguage(id, languageName);

		}

	}

	public void deleteLanguage(String languageName) {

		boolean checkStateAdd = false;
		List<ProgramingLanguages> programingLanguages = languageRepository.getLanguage();
		for (int i = 0; i < programingLanguages.size(); i++) {
			if (programingLanguages.get(i).getLanguageName().equals(languageName)) {
				checkStateAdd = true;

			} else {
				System.out.println(languageName + " dili bulunamadı.");
			}

			if (checkStateAdd) {
				languageRepository.deleteLanguage(i, languageName);
				break;
			}

		}

	}

	public void updateLanguage(String languageNameOld, String languageName) {
		boolean checkStateAdd = true;
		boolean checkStateUpdate = false;
		int size = 0;
		List<ProgramingLanguages> programingLanguages = languageRepository.getLanguage();
		for (int i = 0; i < programingLanguages.size(); i++) {
			
			if (programingLanguages.get(i).getLanguageName().equals(languageNameOld)) {

				checkStateUpdate = true;
				size = i;
			}
			if (programingLanguages.get(i).getLanguageName().equals(languageName)) {
				checkStateAdd = false;
				break;
			}
		}
		if (checkStateUpdate && checkStateAdd) {
			languageRepository.updateLanguage(size, languageName);
			
		} 
		else 
		{
			System.out.println(languageNameOld + " güncelleme yapılamadı.");
		}

	}
}
