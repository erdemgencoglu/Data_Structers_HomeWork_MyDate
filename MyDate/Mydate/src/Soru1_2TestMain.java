import java.util.Scanner;
public class Soru1_2TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		PiCalculator test1=new PiCalculator();//Pi hesaplama sorusu için test1 objesinin tanımlanması
		eNumber test2=new eNumber();//e^x sorusunun nesnesi
		test1.Pi();//Pi Clasının testi
		try{//try catch kullanıcının istenilen dışında bir değer girmesini önlemek için konuldu.
		System.out.printf("\nQuestion2\nEnter step:");
		double adim=input.nextDouble();
		System.out.println("e değeri= "+test2.enumber(adim));
		}
		catch (Exception hata){
			System.out.println("Please check your write!");
	}
	}

}
