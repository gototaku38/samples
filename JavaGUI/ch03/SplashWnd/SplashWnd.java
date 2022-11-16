/*
 * SplashWnd.java
 */
import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SplashWnd extends JFrame {

    SplashWnd() {
        JLabel label = new JLabel("このウィンドウはメインウィンドウ");
        add(label);
        setSize(400, 360);
        setAlwaysOnTop(true);
        setTitle("SplashWnd");
        setVisible(true);
    }

    public static void main(String[] args) {
        // スプラッシュウィンドウを作成する
        JFrame splushframe = new JFrame("スプラッシュウィンドウ");
        JLabel lbls = new JLabel("スプラッシュ！！");
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);   // 背景色を水色にする
        panel.add(lbls);
        splushframe.add(panel);
        splushframe.setSize(400, 300);
        splushframe.setVisible(true);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }  //スリープ2.5秒

        // メインウィンドウを作成する
        new SplashWnd();
        splushframe.setVisible(false);
        splushframe.dispose();
    }

    protected void processEvent(AWTEvent e) {
        if(e.getID() == WindowEvent.WINDOW_CLOSING)
                System.exit(0);    //フレームが閉じたらプログラム終了
    }
}
