/*
 * MainWnd.java
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MainWnd {

    public static void main(String[] args) {

        // ウィンドウを作成する
        JFrame frame = new JFrame("MainWnd");

        // ウィンドウイベントのリスナーを追加する
        frame.addWindowListener(new AppCloser());

        // 最小サイズを設定する
        frame.setMinimumSize(new java.awt.Dimension(250, 160));

        // パックして表示する
        frame.pack();
        frame.setVisible(true);
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

