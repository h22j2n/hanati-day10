import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionQuiz {
	public static void main(String[] args) {
		Set<Account> set = new HashSet<Account>();
		set.add(new Account("1111","조희진",1111,10000));
		set.add(new Account("2222","박희진",1111,10000));
		set.add(new Account("1111","조희진",1111,10000));
		
		System.out.println(set.size());
		
		String str1 = "조희진";
		String str2 = "조희진";
		String str3 = "김희진";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		Student student = new Student();
		System.out.println(student.toString());
		
		
		Map<String, String> map = System.getenv();
		Set<String> keySet = map.keySet();
		for (String name : keySet) {
			String value = System.getenv(name);
			System.out.println(name + " = "+ value);
		}
	}
}
