package kk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class 考勤 extends JFrame {

	private JPanel contentPane;
	private JTextField condition1;
	private JTextArea print;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					考勤 frame = new 考勤();
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
	public 考勤() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//返回
				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(考勤.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		button_1.setBounds(10, 0, 36, 31);
		contentPane.add(button_1);
		
		JLabel label = new JLabel("\u8003\u52E4");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(10, 10, 414, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8BBE\u5B9A\u8003\u52E4\u65F6\u95F4");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(20, 41, 112, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u8F93\u5165\u65F6\u95F4\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(30, 66, 102, 15);
		contentPane.add(label_2);
		
		condition1 = new JTextField();
		condition1.setBounds(125, 63, 185, 21);
		contentPane.add(condition1);
		condition1.setColumns(10);
		
		JButton btn_set = new JButton("\u8BBE\u5B9A");
		btn_set.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {                //设定时间
				if(true) {
					操作提示 c1 =new 操作提示();
					c1.setVisible(true);
					}
					else {
						操作提示1 c11 =new 操作提示1();
						c11.setVisible(true);
					}
			}
		});
		btn_set.setFont(new Font("宋体", Font.PLAIN, 14));
		btn_set.setBounds(331, 62, 93, 23);
		contentPane.add(btn_set);
		
		JLabel label_3 = new JLabel("\u67E5\u8BE2\u5168\u4F53\u5458\u5DE5\u8003\u52E4\u4FE1\u606F");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(20, 112, 171, 15);
		contentPane.add(label_3);
		
		JButton btn_select = new JButton("\u67E5\u8BE2");
		btn_select.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {              //查询全体
				//	print.append();
				
			}
		});
		btn_select.setFont(new Font("宋体", Font.PLAIN, 14));
		btn_select.setBounds(331, 109, 93, 23);
		contentPane.add(btn_select);
		
		print = new JTextArea();
		print.setFont(new Font("宋体", Font.PLAIN, 13));
		print.setBounds(30, 143, 394, 169);
		contentPane.add(print);
	}

}
