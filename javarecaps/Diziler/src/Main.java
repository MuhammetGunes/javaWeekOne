import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = {1,2,8,4,5};
		int total = 0;
		int buyuk = myList[0];
		for(int i=0;i<myList.length;i++) {
			if(myList[i]>buyuk) {
				buyuk = myList[i];
			}
			total = total + myList[i];
			System.out.println(myList[i]);
		}
		System.out.println("//////");
		System.out.println("Toplam : " + total);
		System.out.println("//////");
		System.out.println("Max : " + buyuk);
	}

}
