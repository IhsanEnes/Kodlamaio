
// Dizide sayý var mý yok mu kontrolü


public class Main {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int searchNumber = 11;
		int checkBit = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (searchNumber == numbers[i]) {
				checkBit++;
			}

		}

		if (checkBit != 0) {

			System.out.println("Sayý var...");
		} else {

			System.out.println("Sayý yok...");
		}

	}

}
