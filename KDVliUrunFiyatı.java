
import java.util.Scanner;
public class KDVliUrunFiyatı {

	public static void main(String[] args) {
		double KdvTutarı = 0.18,KdvsizFiyat,KdvliFiyat,UrununKdvTutarı;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Urun fiyatini giriniz : ");
		KdvsizFiyat = inp.nextDouble();
		System.out.println("Urunun KDV'siz fiyati: "+KdvsizFiyat);
		UrununKdvTutarı = KdvsizFiyat*KdvTutarı;
		System.out.println("Urunun KDV tutari: "+ UrununKdvTutarı);
		
		KdvliFiyat = KdvsizFiyat*KdvTutarı+KdvsizFiyat;
		
		System.out.println("Urunun KDV'li fiyati : " + KdvliFiyat);
		
		
		
		
		
		
		

	}

}
