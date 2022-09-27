
public class Main {

	public static void main(String[] args) {
		int num = 5;
		int i = 2;
		boolean asalMi = true;
		
		if(num<2) {
			System.out.println("Geçersiz Sayı");
			return;
		}
		
		while(i<num) {
			if(num%i == 0) {
				asalMi = false;
			}
			i++;
		}
		
		if(asalMi == true) {
			System.out.println("Sayı asal");
		}else {
			System.out.println("Sayı asal değil");
		}
		
	}

}
