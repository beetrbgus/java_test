import java.util.Date;

public class Test011 {
	public static void main(String[] args) {
		String birth = "1992";
		int birthYear = Integer.parseInt(birth);
		Date date = new Date();
		
		int year = date.getYear();
		System.out.println(date.getYear()-100);
	}
}
