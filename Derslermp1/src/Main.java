
//Asal say� kontrol�


public class Main {

	public static void main(String[] args) {
		int number = 7919;
		int remainder;
		int cons = 0;
		
		for(int i = 2;i <= number;i++) {
			remainder = number % i;
			if(remainder == 0 && i != number ) {
				
				cons++;
			}
			
			
		}
		
		if(cons != 0  || number == 1) {
			System.out.println("Say� asal de�idir...");
		}
		else{
			System.out.println("Say� asald�r...");
		}

	}

}
