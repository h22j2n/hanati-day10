import java.util.Comparator;

public class MoneyCompare implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// 앞에 있는 값이 크면 양수, 같으면 0, 뒤에 값이 크면 음수
		return (int)(o1.getRestMoney() - o2.getRestMoney());
		}
	
	

}
