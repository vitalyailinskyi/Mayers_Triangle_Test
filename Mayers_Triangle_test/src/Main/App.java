package Main;
import java.awt.*;
import java.awt.event.*;

public class App extends Frame implements ActionListener {

	private static final long serialVersionUID = 1;

	TextField text1, text2, text3;
	
	public int state = 0;
	
	public static String s1 = null,s2 = null,s3 = null;
	
	App(String title) {
		super(title);
		setLayout(null);

		Button b;
		add(b = new Button("Solve"));
		b.setBounds(70, 160, 100, 30);
		b.addActionListener(this);

		add(text1 = new TextField());
		text1.setBounds(65, 70, 110, 30);
		
		add(text2 = new TextField());
		text2.setBounds(65, 100, 110, 30);
		
		add(text3 = new TextField());
		text3.setBounds(65, 130, 110, 30);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g) {
		g.drawString("Insert the values of the sides:", 40, 55);
		g.clearRect(0, 100, 330, 230);
		if(state == 1){
			//g.clearRect(0, 100, 330, 230);
			g.drawString(Operations.Result(null), 15, 210);
		}
	}
	


	public void actionPerformed(ActionEvent ae) {
		Stroka();
		if(s1.length()!=0 && s2.length()!=0 && s3.length()!=0){
		Operations.FirstSide = Integer.parseInt(App.s1);
		Operations.SecondSide = Integer.parseInt(App.s2);
		Operations.ThirdSide = Integer.parseInt(App.s3);
		state = 1;}
		
		
		paint(getGraphics());
		state = 0;
	}
	
	public String Stroka(){
		s1 = text1.getText();
		s2 = text2.getText();
		s3 = text3.getText();
		
		//System.out.println("������� ������1 "+ s1);
		//System.out.println("������� ������2 "+ s2);
		//System.out.println("������� ������3 "+ s3);
		return null;
	}
}

