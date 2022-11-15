package kodlama.io.Week4Odev1.entities;

public class ProgramingLanguages {

	private int languagesId;
	private String languageName;

	public ProgramingLanguages(int languagesId, String languageName) {

		this.languagesId = languagesId;
		this.languageName = languageName;
	}

	public ProgramingLanguages() {

	}

	public int getLanguagesId() {
		return languagesId;
	}

	public void setLanguagesId(int languagesId) {
		this.languagesId = languagesId;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

}
