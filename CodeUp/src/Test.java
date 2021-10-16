import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		map.put("2020-09-11", "1");
		map.put("2020-09-12", "1");
		map.put("2020-09-13", "0");
		map.put("2020-09-14", "0");
		map.put("2020-09-15", "1");
		map.put("2020-09-16", "0");
		map.put("2020-09-17", "1");
		
		System.out.println(map.toString());
	}
}
