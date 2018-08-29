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
