
public class eNumber {

	static double enumber(double step){//Kullanıcıdan bir x sayısı double şeklinde alınır.
		int factorial=1;
		double e=1;
		for (int i = 1; i <=step; i++) {
			factorial=factorial*i;//payda kısmı
			e+=Math.pow((double)step,i)/factorial;//x değerinin hesaplandığı kısım
		}
		return e;
	}	
}
