
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int total = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				total = total + i;
			}
		}
		if(total == num) {
			System.out.println("Mükemmel Sayı");
		}else {
			System.out.println("Mükemmel sayı değil");
		}
	}

}
