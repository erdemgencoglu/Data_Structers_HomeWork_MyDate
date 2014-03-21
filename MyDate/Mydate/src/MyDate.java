/**
 *
 * @author Erdem Gençoğlu
 *	 number:12253030
 */
public class MyDate {// MyDate clasımız ve değişkenlerimizin tanımlandığı yer
	private int year;//
	private int month;
	private int day;

	public int getYear() {
		return year;
	}
	public void setYear(int year) {//0 dan büyük bir int değer alınır 
		if(year>0)
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {//setDay metodunda ayın 1-31 günden olması sorgulandı
		if(day<=31 && day>=1)	
		this.day = day;
		else
			System.out.println("Day is include 1 to 31 number!");
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {//setMonth metodunda 12 tane ay olduğu sorgulandı
		if(month>=1 && month<=12)
			this.month = month;
		else
			System.out.println("Month is include 1 to 12 number!");
	}
	/**************************************************************************/
	public String getDate(){//getDate metodu tarihi 14 Ocak 2014 şeklinde geri döndürür.		
		String day=Integer.toString(getDay());
		String year=Integer.toString(getYear());
		
		if(getMonth()==1){
			String ay="Ocak";
			return (day+" "+ay+" "+year);
		}
		else if(getMonth()==2){
			String ay="Şubat";
			return (day+" "+ay+" "+year);
		}
		else if(getMonth()==3){
			String ay="Mart";
			return (day+" "+ay+" "+year);
		}
		else if(getMonth()==4){
			String ay="Nisan";
			return (day+" "+ay+" "+year);
		}
		else if(getMonth()==5){
			String ay="Mayıs";
			return (day+" "+ay+" "+year);
		}
		else if(getMonth()==6){
			String ay="Haziran";
			return (day+" "+ay+" "+year);
		}
		else if(getMonth()==7){
			String ay="Temmuz";
			return (day+" "+ay+" "+year);
		}
		else if(getMonth()==8){
			String ay="Ağustos";
			return (day+" "+ay+" "+year);
		}
		else if(getMonth()==9){
			String ay="Eylül";
			return (day+" "+ay+" "+year);
		}else if(getMonth()==10){
			String ay="Ekim";
			return (day+" "+ay+" "+year);
		}else if(getMonth()==11){
			String ay="Kasım";
			return (day+" "+ay+" "+year);
		}
		else if(getMonth()==12){
			String ay="Aralık";
			return (day+" "+ay+" "+year);
			
		}
		return "   ";//boş karakter döndürür.
	}
	/*******************************************************************/
	static boolean isBigger(MyDate ay,MyDate ay2){//Boolean isBigger metodu alınan tarihleri karşılaştırmada kullanıldı.
		if(ay.getYear()>ay2.getYear()){
			return true;
		}
		else
			return false;
		
	}
	
}
