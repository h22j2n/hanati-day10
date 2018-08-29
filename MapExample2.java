import java.util.Enumeration;
import java.util.Hashtable;

public class MapExample2 {
	public static void main(String[] args) {
		Hashtable<String, Account> set = new Hashtable<>();
		
		Account account1 = new Account("1111","조희진",1111,1000);
		Account account2 = new Account("2222","박희진",1111,1000);
		
		set.put(account1.getAccountNum(), account1);
		set.put(account2.getAccountNum(), account2);
		
		System.out.println(set.get("1111"));
		
		Enumeration<String> e = set.keys();
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			System.out.println(key);
		}
		
		Enumeration<Account> e2 = set.elements(); // 값을 가져올 때
		while (e2.hasMoreElements()) {
			Account account = (Account) e2.nextElement();
			System.out.println(account);
		}
	}

}
