
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayi = {1,2,3,4,5};
		int aranan = 5;
		for(int i = 0;i<sayi.length;i++) {
			if(sayi[i]==aranan) {
				System.out.println("Aranan sayı mevcut");
				break;
			}
		}
		
	}

}
