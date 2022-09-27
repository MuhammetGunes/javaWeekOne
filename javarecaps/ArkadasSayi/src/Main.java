
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 220;
		int num2 = 284;
		int total = 0;
		int total2 = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				total = total + i;
			}
		}
		for (int j = 1; j < num2; j++) {
			if (num % j == 0) {
				total2 = total2 + j;
			}
		}
		if(num == total2 && num2 == total) {
			System.out.println("Arkadaş Sayı");
		}else {
			System.out.println("Arkadaş sayı değil");
		}
	}

}
