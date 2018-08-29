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
