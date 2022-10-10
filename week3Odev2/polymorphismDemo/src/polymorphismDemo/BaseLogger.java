package polymorphismDemo;

public class BaseLogger {
	public void log(String message) { // BaseLogger'da log methodu olmazsa referans type (polymorphism) tanýmlamalarda extend edilen classlardaki log methodunu kullanamzsýn sadece o classý direk tanýmlayarak kullanýrsýn.
		System.out.println("Default logger: " + message);
	}
}
