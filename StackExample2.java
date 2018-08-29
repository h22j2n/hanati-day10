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
