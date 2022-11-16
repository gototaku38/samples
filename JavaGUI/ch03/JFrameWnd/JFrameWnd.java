/*
 * JFrameWnd.java
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class JFrameWnd extends JFrame{

    public static void main(String[] args) {
		new JFrameWnd();
	}

    public JFrameWnd(){

        // ウィンドウイベントのリスナーを追加する
        addWindowListener(new AppCloser());

        // 最小サイズを設定する
        setMinimumSize(new java.awt.Dimension(250, 160));

        // パックして表示する
        pack();
        setVisible(true);
    }
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

