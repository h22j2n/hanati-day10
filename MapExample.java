import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); 
		map.put("950204", "조희진");
		map.put("940204", "김희진");
		map.put("930204", "이희진");
		
		if(map.containsKey("950204")) {
			System.out.println("존재하는 키입니다.");
		}else
			map.put("950204", "박희진");
		// 같은 키 입력하면 덮어씀 그래서 저장하기전에 검색해봐야함
		
		System.out.println(map.get("950204"));
		
		Set<String> keyLsit = map.keySet();
		
		for (String string : keyLsit) {
			System.out.println(string);
		}
		
		Collection<String> values = map.values();
		for (String string : values) {
			System.out.println(string);
		}
	}

}
