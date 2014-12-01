package Main;
import java.awt.Frame;


public class Main {
	public static void main(String[] args) {
		Frame f = new App("App with Triangles - Ilinskyi");
		f.setVisible(true);
		f.setSize(240, 250);
		f.setLocation(500, 200);
		f.setResizable(false);
		App st1 = new App(null);
		st1.Stroka();
	}
}
