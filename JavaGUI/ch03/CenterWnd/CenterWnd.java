/*
 * CenterWnd.java
 */
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CenterWnd extends JFrame {

    CenterWnd() {

    	// ラベルを作って表示する
    	JLabel lbl = new JLabel("ウィンドウを中心に表示するサンプル");
        add(lbl);

        // 画面のサイズを取得して画面の中央に表示するようにする
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gs = ge.getScreenDevices();
        GraphicsDevice gd = gs[0];
        GraphicsConfiguration[] gc = gd.getConfigurations();
        GraphicsConfiguration gc0 = gc[0];
        Rectangle rect = gc0.getBounds();
        int dw = rect.width;
        int dh = rect.height;
        int ww = 300;
        int wh = 200;
        Rectangle rct = new Rectangle( (dw-ww)/2, (dh-wh)/2, ww, wh);
        this.setBounds(rct);

        // ウィンドウのサイズを変更できないようにする
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CenterWnd");
        setVisible(true);
    }

    public static void main(String[] args) {
        new CenterWnd();
    }

    /**
     * アプリケーションを終了するためのクラス
     */
    final class AppCloser extends WindowAdapter {

        @Override
        public void windowClosing(final WindowEvent e) {
            System.exit(0);
        }
    }
}
