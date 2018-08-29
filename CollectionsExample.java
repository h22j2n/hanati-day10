import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<Account>();
		list.add(new Account("3333","조희진",1111,20000));
		list.add(new Account("1111","박희진",1111,50000));
		list.add(new Account("2222","김희진",1111,10000));
		
		Collections.sort(list, new NumberCompare());
		
		for (Account account : list) {
			System.out.println(account);
		}
		
		System.out.println();
		
		Collections.sort(list, new MoneyCompare());
		
		for (Account account : list) {
			System.out.println(account);
		}
	}

}
