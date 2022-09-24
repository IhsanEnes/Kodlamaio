
public class Main {

	public static void main(String[] args) {
		int[] number = {220, 284};
		int remainder;
		int[] sumOfTotal = {0,0};

		for (int i = 0; i < number.length; i++) {

			for (int j = 0; j < number[i]; j++) {
				remainder = number[i] % (j+1);

				if (remainder == 0) {
					sumOfTotal[i] = sumOfTotal[i] + (j+1);
				}

			}

		}
		
		if (sumOfTotal[0] == sumOfTotal[1]){
			
			System.out.println(number[0] + " ve " + number[1] + " arkadaþ sayýdýr...");
		}
		else{
			
			System.out.println(number[0] + " ve " + number[1] + " arkadaþ sayý deðildir...");
		}

	}

}
