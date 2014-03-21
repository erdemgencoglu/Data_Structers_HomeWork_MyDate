/**
 * Erdem Gençoğlu
 * 12253030
 * 
*/
import java.util.Scanner;
public class MyDateTest {
	public static void main(String[] args) {
		
			Scanner input =new Scanner(System.in);
			int gun;//kullanıcıdan alınan değerlerin saklandığı değişkenler.
			int ay;
			int yil;
			boolean Compare;//Tarih buyukluk karşılaştırması
			
			MyDate test1=new MyDate();//nesne1 tanımlaması
			MyDate test2=new MyDate();//nesne2 tanımlaması
		
			try{//herhangi bir kullanıcı girdi hatası için tray catch kondu
				/*************First Date ****************************/
				for(;;){//for ile sonsuz döngüye sokuldu
				System.out.print("(1)Enter day:");
				gun=input.nextInt();
				if (gun<=31 && gun>=1) {
					break;//kullanıcadan 1 ile 31 arasında sayı girene kadar sorar.
				}
				else if (gun>31||gun<=0) {//Burada 1-31 arası sayı girilmesi istendi
					System.out.println("Please use less than 31 and  greater than 0 ");
				}
				}
				for (;;) {
					System.out.print("(1)Enter month:");
					ay=input.nextInt();
					if (gun<=12 && gun>=1) {
						break;//kullanıcadan 1 ile 12 arasında sayı girene kadar sorar.
					}
					else if (gun>12||gun<=0) {//Burada 1-31 arası sayı girilmesi istendi
						System.out.println("Please use less than 12 and  greater than 0 ");
					}
				}
									
				System.out.print("(1)Enter year:");
				yil=input.nextInt();
				test1.setDay(gun);
				test1.setMonth(ay);
				test1.setYear(yil);		
				System.out.println("First Date:"+test1.getDate());
				
				/*************Second Date ****************************/
				for(;;){
				System.out.print("(2)Enter day:");
				gun=input.nextInt();
				if (gun<=31 && gun>=1) {
					break;//kullanıcadan 1 ile 31 arasında sayı girene kadar sorar.
				}
				else if (gun>31||gun<=0) {//Burada 1-31 arası sayı girilmesi istendi
					System.out.println("Please use less than 31 and  greater than 0 ");
				}
				}
				for(;;){
				System.out.print("(2)Enter month:");
				ay=input.nextInt();
				if (gun<=12 && gun>=1) {
					break;//kullanıcadan 1 ile 12 arasında sayı girene kadar sorar.
				}
				else if (gun>12||gun<=0) {//Burada 1-31 arası sayı girilmesi istendi
					System.out.println("Please use less than 12 and  greater than 0 ");
				}
				}
				System.out.print("(2)Enter year:");
				yil=input.nextInt();
				
				test2.setDay(gun);
				test2.setMonth(ay);
				test2.setYear(yil);
				
				System.out.println("Second Date:"+test2.getDate());
			}
			catch(Exception hata)
			{
				System.out.println("Please use int number ");
				MyDateTest.main(args);
			}

			Compare=MyDate.isBigger(test1,test2);
			if(Compare==true){
				System.out.println("First is bigger than Seconds");
			}
			else
				{System.out.println("First is smaller than Second");}
			
		}
}
