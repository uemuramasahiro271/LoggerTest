import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main extends JFrame {

	public static void main(String[] args) {

		JFrame frame = new Main("LoggerTest");
		frame.setVisible(true);

	}

	private Main(String title) {

		setTitle(title);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel panel = new JPanel();

		JButton button1 = createJButton("ボタン1");
		panel.add(button1);

		JButton button2 = createJButton("ボタン2");
		panel.add(button2);

	    Container contentPane = getContentPane();
	    contentPane.add(panel, BorderLayout.CENTER);
	}

	private JButton createJButton(String text) {

		JButton button = new JButton(text);
		setButtonClickAction(button);

		return button;
	}

	private void setButtonClickAction(JButton b) {

	    // ボタンにアクションリスナーを追加
	    b.addActionListener(new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	        // メッセージダイアログを表示
	        JOptionPane.showMessageDialog(null, "ログを出力しました!");
	      }
	    });
	}

}
