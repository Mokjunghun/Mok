import java.awt.*;
import javax.swing.*;

public class Layout extends JFrame {
    public Layout() {
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();
        ct.add (top, BorderLayout.CENTER);
        ct.add(bottom, BorderLayout.SOUTH);

        top.setLayout(new BorderLayout(0,5));
        JLabel title = new JLabel("레이블은 여기");
        JTextArea ta = new JTextArea("입력하세요", 5,20);
        top.add(title, BorderLayout.NORTH);
        top.add(ta, BorderLayout.CENTER);

        bottom.setLayout(new FlowLayout());
        JButton ok = new JButton("OK");
        JButton cancle = new JButton("CANCLE");
        bottom.add(ok);
        bottom.add(cancle);
    }

    public static void main(String a[]) {
        Layout la = new Layout();
        la.setTitle("Layout예제");
        la.setSize(300,300);
        la.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        la.setVisible(true);
    }

}
