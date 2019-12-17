package hashMap;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("orkun", 20);
		map.put("baturay", 40);
		map.put("ahmet", 15);
		map.put("mehmet", 19);
		
		System.out.println("orkun".hashCode());
		System.out.println("baturay".hashCode());
		System.out.println("ahmet".hashCode());
		System.out.println("mehmet".hashCode());
		System.out.println(map);

	}

}
