
//Super sayý kontrolü


public class Main {

	public static void main(String[] args) {
		int enteredNumber = 496;
		double remainder;
		int total = 0;

		for (int i = 1; i < enteredNumber; i++) {
			// remainder = enteredNumber % i;

			remainder = enteredNumber - i * (Math.floor(enteredNumber / i)); // mod iþlemi

			if (remainder == 0) {
				total = total + i;
			}
		}
		if (total == enteredNumber) {
			System.out.println(enteredNumber+ " SuperSayý....");
		} else {
			System.out.println(enteredNumber+ " SuperSayýDeðil....");
		}

	}

}
