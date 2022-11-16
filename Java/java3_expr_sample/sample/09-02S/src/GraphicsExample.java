import javax.swing.JFrame;

public class GraphicsExample extends JFrame {
	public static void main(String[] args) {
		new GraphicsExample();
	}

	GraphicsExample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new MyPanel());
		setSize(520, 550);
		setVisible(true);
	}
}
