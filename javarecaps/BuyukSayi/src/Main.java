
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi = 15;
		int sayi2 = 45;
		int sayi3 = 30;
		
		int buyuk = sayi3;
		
		if (sayi>buyuk) {
			buyuk = sayi;
		}
		else if (sayi2>buyuk) {
			buyuk = sayi2;
		}
		else if (sayi3>buyuk) {
			buyuk = sayi3;
		}
		
		System.out.println(buyuk);
	}

}
