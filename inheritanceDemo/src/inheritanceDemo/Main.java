package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		/*TarimKrediManager tarimKrediMaganer = new TarimKrediManager();
		krediUI.krediHesapla(tarimKrediMaganer);*/
		krediUI.krediHesapla(new TarimKrediManager());

	}

}
