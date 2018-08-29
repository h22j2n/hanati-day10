import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class AWTExample {

	public static void main(String[] args) {
		Frame frame = new Frame("처음으로 만드는 프레임");
		frame.setSize(1000, 800);
		frame.setVisible(true);
		
		Button button1 = new Button("AWT Button1");
		Button button2 = new Button("AWT Button2");
		button1.setBackground(Color.GREEN);
		button2.setBackground(Color.BLUE);
		
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		
		Label label = new Label("AWT Label1");
		frame.add(label);
		
		TextField textField = new TextField("id", 10);
		frame.add(textField);
		
		TextArea textarea = new TextArea(5,30);
		frame.add(textarea);
		
		Checkbox checkbox = new Checkbox("Female", true);
		frame.add(checkbox);
		
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("Male", true, cg);
		Checkbox cb2 = new Checkbox("Feale", false, cg);
		frame.add(cb1);
		frame.add(cb2);
		
		Choice selectBox = new Choice();
		selectBox.add("Java");
		selectBox.add("C");
		selectBox.add("C++");
		selectBox.add("C#");
		frame.add(selectBox);
		
//		frame.setResizable(false);
		

	}

}
