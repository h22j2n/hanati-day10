# 하나금융티아이 20180829

## Collection API

- 인터페이스 특징이 가장 잘 나타나 있는 API

- Set은 프로그램에서 잘 안씀 (순서가 없고, 중복을 허용하지 않아서)

- **TreeSet**은 Tree 알고리즘이 적용된 클래스

  - Tree 알고리즘 : 데이터가 나열이 되어 있을 때 1차적으로 오름차순으로 정렬함 그리고 하나하나 검색하는 것이 아니라 반씩 접어가면서 검색함
  - 단점 : 담으면서 정렬하기 때문에 add 속도가 떨어짐

  ``` java
  import java.util.Set;
  import java.util.TreeSet;
  
  public class TreeSetExample {
  	public static void main(String[] args) {
  		Set<String> set = new TreeSet<String>(); //String만 담을 수 있는 전용Set이 됨
  		set.add("조희진");
  		set.add("김희진");
  		set.add("이희진");
  		set.add("박희진");
  		set.add("최희진");
  		set.add("bbbbbb");
  		set.add("aaaaaa");
  		
  		for (String string : set) {
  			System.out.println(string);
  		}				
  	}
  }
  
  /*
  aaaaaa
  bbbbbb
  김희진
  박희진
  이희진
  조희진
  최희진
  */
  ```

- **HashSet**은 Hash 알고리즘이 적용된 클래스

  - Hash 알고리즘 : 엑셀에 사용자이름을 300명 적었을 때(무작위 순서로) 검색하기 힘듬 그래서 이름별로 정렬해놓는다.

- **Stack**

  - peek : 제거 안하고 가져옴
  - pop : 제거하고 가져옴

  ``` java
  import java.util.Set;
  import java.util.Stack;
  import java.util.TreeSet;
  
  public class StackExample2 {
  	public static void main(String[] args) {
  		Stack<String> stack = new Stack<String>();
  		stack.push("조희진");
  		stack.push("aaa");
  		stack.push("bbb");
  		stack.push("ccc");
  		stack.push("ddd");
  		
  		System.out.println(stack.size());
  		
  		System.out.println(stack.pop());
  		System.out.println(stack.size());
  		
  		System.out.println(stack.peek());
  		System.out.println(stack.size());
  
  	}
  }
  /*
  5
  ddd
  4
  ccc
  4
  */
  ```

- **Queue**

  - 양쪽이 다 뚫려있는 파이프모양
  - FIFO 구조
  - 원래 자바에는 없었음 5버전 때 추가됨
  - linked list :  배열을 순차적으로 나열한게 아니라 데이터를 어떤 메모리에 나열하면 그 데이터에 헤더(꼬리물기하기 위해 필요)를 부착해서 연결! / Node가 쭉 연결된 개념
    - 장점 : 순차적이지 않아도됨 / 추가 삭제 유용
    - 단점 : 헤더를 붙여줘야해서 메모리낭비 / 검색속도가 떨어짐 / 알고리즘도 복잡..
    - Queue를 위해 만들어짐

  ``` java
  import java.util.LinkedList;
  public class QueueExample {
  	public static void main(String[] args) {
  		LinkedList<String> queue = new LinkedList<String>();
  		queue.offer("AAAA");
  		queue.offer("BBBB");
  		queue.offer("CCCC");
  		queue.poll();
  		queue.poll();
  		System.out.println(queue.poll());
  	}
  }
  ```



- **Map**

  - 순차적 접근이 아닌 테이블 구조

  - 첫번째 컬럼은 Key 두번째 컬럼은 Value

    - | Key(계좌번호) | Value |
      | :-----------: | :---: |
      |               |       |
      |               |       |
      |               |       |

  - 솔루션, 서버 등 정말 많이 사용

  - HashTable이 동기처리 되있음(Vector와 비슷)

    - 생성할 때 Hashtable 로 생성하는게 좋음

    ``` java
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
    /*
    초기화 블럭 실행입니다..1
    초기화 블럭 실행입니다..2
    1111	조희진	****	1000
    1111
    2222
    1111	조희진	****	1000
    2222	박희진	****	1000
    */
    ```

  - HashMap이 동기처리 안되어 있음(ArrayList와 비슷)

  ``` java
  import java.util.HashMap;
  import java.util.Map;
  
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
  
  /*
  존재하는 키입니다.
  조희진
  940204
  950204
  930204
  김희진
  조희진
  이희진
  */
  ```

  - Map은 동적객체(원하는 것만 저장)

  ``` java
  import java.util.HashMap;
  import java.util.Map;
  
  /**
   * 동적 객체 정의
   * @author 조희진
   *
   */
  public class Student {
  	Map<String, Object> prop;
  
  	public Student() {
  		prop = new HashMap<String, Object>();
  	}
  
  	public Map<String, Object> getProp() {
  		return prop;
  	}
  
  	public void setProp(Map<String, Object> prop) {
  		this.prop = prop;
  	}
  	
  	public void setProperty(String key, Object value) {
  		
  	}
  
  	public Object getProperty(String key) {
  		return prop.get(key);
  	}
  	
  	public static void main(String[] args) {
  		Student student = new Student();
  		student.setProperty("ssn", "87554");
  		student.setProperty("name", "조희진");
  		
  		Student student2 = new Student();
  		student2.setProperty("ssn", "87553");
  		student2.setProperty("name", "박희진");
  		student2.setProperty("address", "LA");		
  	}
  	
  }
  ```

- hashCode() 

  - JVM은 레퍼런스로 접근하는 것이 아님
  - 모든 객체에는 식별자를 만듬 그게 hashCode (주소를 기반으로 만듬)

  ``` java
  		String str1 = "조희진";
  		String str2 = "조희진";
  		String str3 = "김희진";
  		System.out.println(str1.hashCode());
  		System.out.println(str2.hashCode());
  		System.out.println(str3.hashCode());
  
  
  		Student student = new Student();
  		System.out.println(student.toString());
  
  /*
  51072072
  51072072
  44629528
  Student@7852e922  -> 얘가 해쉬코드!!
  */
  ```

  - equals 는 주소를 비교
  - Hash라고 시작하는 애들은 담기 전에 hashcode()를 수행함(hashcode값을 비교) 같으면 2차작업으로 equals 수행 / 다르면 equals 수행X
  - Hash로 시작하는 애들 작업할 때는 무조건 hashcode() 오버라이딩 해야함!

  ``` java
      @Override
      public int hashCode() {
          // return 0; 이렇게 하면 hashcode를 다 0으로 주어지니까 같은 그룹으로 묶겠다! 이다음에 equals 연산 수행~
      	return toString().hashCode();
      }
  ```

  - getenv() : os에 환경변수 값을 다 읽어들임

------

``` java
import java.util.Comparator;

public class NumberCompare implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// 앞에 있는 값이 크면 양수, 같으면 0, 뒤에 값이 크면 음수
		
		return o1.getAccountNum().compareTo(o2.getAccountNum()); // compareTo 도 똑같이 int 반환
	}

}
```

``` java
import java.util.Comparator;

public class MoneyCompare implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// 앞에 있는 값이 크면 양수, 같으면 0, 뒤에 값이 크면 음수
		return (int)(o1.getRestMoney() - o2.getRestMoney());
		}

}
```

``` java
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
```



------

## AWT API 

- AWT : Abstract Window Toolkit(초창기에 만들어놓고 업데이트를 안해서 기본)

- SWT : Eclipse 화면을 이걸로 만듬

- Swing은 쓸 줄 알아야 UI 만들 수 있음

- Visual Component : Button, Label, TextField, TextArea, Checkbox, List, Choice 클래스 등… 

- Container : Window, Frame, Dialog, FileDialog, Panel 등 

  ``` java
  //프레임 만들기
  		Frame frame = new Frame("처음으로 만드는 프레임");
  		frame.setSize(600, 500);
  		frame.setVisible(true);
  
  		frame.setResizable(false); // 화면 크기조정 못하게
  ```

  ``` java
  // 버튼 생성
  		Button button1 = new Button("OK");
  		Button button2 = new Button("OK");
  		button1.setBackground(Color.GREEN);
  		button2.setBackground(Color.BLUE);
  		
  		frame.setLayout(new FlowLayout());
  		frame.add(button1);
  		frame.add(button2);
  ```

  ``` java
  // 라벨 생성
  		Label label = new Label("AWT Label1");
  		frame.add(label);
  ```

  ``` java
  // TextField 생성
  		TextField textField = new TextField("id", 10);
  		frame.add(textField);
  ```

  ``` java
  // TextArea 생성
  		TextArea textarea = new TextArea(5,30);
  		frame.add(textarea);
  ```

  ``` java
  // CheckBox 생성
  		Checkbox checkbox = new Checkbox("Female", true);
  		frame.add(checkbox);
  
  //CheckBox Group 생성
  		CheckboxGroup cg = new CheckboxGroup();
  		Checkbox cb1 = new Checkbox("Male", true, cg);
  		Checkbox cb2 = new Checkbox("Feale", false, cg);
  		frame.add(cb1);
  		frame.add(cb2);
  ```

  ``` java
  // Choice (ComboBox) 생성
  		Choice selectBox = new Choice();
  		selectBox.add("Java");
  		selectBox.add("C");
  		selectBox.add("C++");
  		selectBox.add("C#");
  		frame.add(selectBox);
  ```

  
