import javax.swing.*;

public class MyFrame extends JFrame {
	public static void main(String[] args) {
		new MyFrame();
	}

	MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
            setResizable(false);
	}
}
