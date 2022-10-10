package polymorphismDemo;

public class BaseLogger {
	public void log(String message) { // BaseLogger'da log methodu olmazsa referans type (polymorphism) tan�mlamalarda extend edilen classlardaki log methodunu kullanamzs�n sadece o class� direk tan�mlayarak kullan�rs�n.
		System.out.println("Default logger: " + message);
	}
}
