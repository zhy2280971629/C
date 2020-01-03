package kk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ¿¼ÇÚ1 extends JFrame {

	private JPanel contentPane;
	private JTextArea print;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					¿¼ÇÚ1 frame = new ¿¼ÇÚ1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ¿¼ÇÚ1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//·µ»Ø
				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(¿¼ÇÚ.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		button_1.setBounds(10, 0, 36, 31);
		contentPane.add(button_1);
		
		JLabel label = new JLabel("\u8003\u52E4");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("ËÎÌå", Font.PLAIN, 18));
		label.setBounds(10, 10, 414, 21);
		contentPane.add(label);
		
		JLabel label_3 = new JLabel("\u67E5\u8BE2\u5168\u4F53\u5458\u5DE5\u8003\u52E4\u4FE1\u606F");
		label_3.setFont(new Font("ËÎÌå", Font.PLAIN, 16));
		label_3.setBounds(20, 41, 171, 15);
		contentPane.add(label_3);
		
		JButton btn_select = new JButton("\u67E5\u8BE2");
		btn_select.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {              //²éÑ¯È«Ìå
				//	print.append();
				
			}
		});
		btn_select.setFont(new Font("ËÎÌå", Font.PLAIN, 14));
		btn_select.setBounds(331, 41, 93, 23);
		contentPane.add(btn_select);
		
		print = new JTextArea();
		print.setFont(new Font("ËÎÌå", Font.PLAIN, 13));
		print.setBounds(10, 72, 414, 155);
		contentPane.add(print);
	}

}
