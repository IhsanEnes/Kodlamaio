package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManager = {new BaseKrediManager(),new TarimKrediManager(), new OgretmenKrediManager()};
		for (BaseKrediManager baseKrediManager2 : baseKrediManager) {
			System.out.println("Tutar: " + baseKrediManager2.hesapla(10.2));
		}

	}

}
