/*
 * SplashScrn.java
 */
import java.awt.AWTEvent;
import java.awt.SplashScreen;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SplashScrn extends JFrame {

    SplashScrn() {
        JLabel lbl = new JLabel("このウィンドウはメインウィンドウ");
        add(lbl);
        setSize(300, 200);
        setAlwaysOnTop(true);
        setTitle("SplashScrn");
        setVisible(true);
    }

    public static void main(String[] args) {

        // スプラッシュウィンドウを作成する
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash == null) {
            System.out.println("使い方");
            System.out.println("java -splash:Sample.gif SplashScrn");
            System.exit(0);
        };

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }  //スリープ2.5秒

        splash.close();

        // メインウィンドウを作成する
        new SplashScrn();
    }

    protected void processEvent(AWTEvent e) {
        if(e.getID() == WindowEvent.WINDOW_CLOSING)
                System.exit(0);    //フレームが閉じたらプログラム終了
    }
}
