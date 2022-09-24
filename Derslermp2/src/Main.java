

// ince, kalýn harf kontrolü


public class Main {

	public static void main(String[] args) {
		char character = 'x';
		String kalinHarf = "aýou";
		String inceHarf = "eiöü";
		int state = 0;
		int control = 0;

//		boolean deneme;
//		
//		if(kalinHarf.charAt(0) == character) {
//			
//			deneme = true;
//			System.out.println(deneme);
//		}

		for (int i = 0; i <= 3; i++) {

			if (kalinHarf.charAt(i) == character) {

				state++;

			}

			if (kalinHarf.charAt(i) == character || inceHarf.charAt(i) == character) {

				control++;

			}

		}

		if (state != 0 && control != 0) {

			System.out.println("kalin");
		} else if (state == 0 && control != 0) {

			System.out.println("ince");
		} else {
			System.out.println("Sessiz harf");
		}

	}

}
