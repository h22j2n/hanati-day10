import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.border.Border;

public class ChatFrame extends Frame {
//	String title;
	Label serverL;
	TextField serverTF, inputTF;
	Button connectB, sendB;
	TextArea messageTA;
	List userList;
	
	public ChatFrame()  {
		this("이름없음");
		
	}
	
	public ChatFrame(String title)  {
		super(title);
		serverL = new Label("Server");
		serverTF = new TextField();
		inputTF = new TextField();
		connectB = new Button("Connect");
		sendB = new Button("Sned");
		messageTA = new TextArea();
		userList = new List(10);
		
	}
	
	//화면 배치
	public void setContents() {
		Panel northP = new Panel(); //default는 FlowLayout
		northP.setLayout(new BorderLayout());//화면에 꽉차게 바꾸려고
		northP.add(serverL, BorderLayout.WEST);
		northP.add(serverTF, BorderLayout.CENTER);
		northP.add(connectB, BorderLayout.EAST);
		
		
		Panel southP = new Panel(); //default는 FlowLayout
		southP.setLayout(new BorderLayout());//화면에 꽉차게 바꾸려고
		southP.add(inputTF, BorderLayout.CENTER);
		southP.add(sendB, BorderLayout.EAST);
		
		add(northP, BorderLayout.NORTH);
		add(southP, BorderLayout.SOUTH);
		add(messageTA,BorderLayout.CENTER);
		add(userList,BorderLayout.EAST);
		
	}
	
	public static void main(String[] args) {
		ChatFrame frame = new ChatFrame("Kotalk");
		frame.setContents(); //배치
		frame.setSize(400,500);
		frame.setVisible(true);
	}

}
