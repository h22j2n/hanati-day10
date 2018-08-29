import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.LayoutManager;

import javax.swing.border.Border;

public class UserFrame extends Frame {
//	String title;
	Button eButton, wButton, sButton, nButton, cButton;

	public UserFrame()  {
		this("이름없음");
		
	}
	
	public UserFrame(String title)  {
		super(title);
		this.eButton = new Button("East");
		this.wButton = new Button("West");
		this.sButton = new Button("South");
		this.nButton = new Button("North");
		this.cButton = new Button("Center");
		
	}
	
	//화면 배치
	public void setContents() {
		//레이아웃 매니저 교체
		setLayout(new FlowLayout());
		add(eButton, BorderLayout.EAST);
		add(wButton, BorderLayout.WEST);
		add(sButton, BorderLayout.SOUTH);
		add(nButton, BorderLayout.NORTH);
		add(cButton, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		UserFrame frame = new UserFrame("타이틀입니다.");
		frame.setContents();
		frame.setSize(1000,800);
		frame.setVisible(true);
	}

}
