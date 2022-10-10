package abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator gameCalculator = new KidGameCalculator();
		gameCalculator.hesapla();
		GameCalculator[] gameCalculatorArray = {new ManGameCalculator(), new WomanGameCalculator()};
		for (GameCalculator gameCalculator2 : gameCalculatorArray) {
			gameCalculator2.hesapla();
		}
		

	}

}
