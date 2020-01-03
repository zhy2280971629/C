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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class 员工 extends JFrame {

	private JPanel contentPane;
	private JTextField condition1;
	private JTextField condition2;
	private JTextField condition3;
	private JTextField condition4;
	private JTextArea print;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					员工 frame = new 员工();
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
	public 员工() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5458\u5DE5\u4FE1\u606F");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(10, 10, 447, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u67E5\u8BE2");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		label_1.setBounds(20, 35, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u5458\u5DE5\u53F7\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(30, 60, 71, 15);
		contentPane.add(label_2);
		
		condition1 = new JTextField();
		condition1.setText("");
		condition1.setBounds(111, 57, 66, 21);
		contentPane.add(condition1);
		condition1.setColumns(10);
		
		JButton btn_select = new JButton("\u67E5\u8BE2");
		btn_select.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {                     //查询一个
				if(true) {
					print.append(condition1.getText());
					
				}
				else {
					
				}
			} 
		});
		btn_select.setFont(new Font("宋体", Font.PLAIN, 14));
		btn_select.setBounds(187, 56, 93, 23);
		contentPane.add(btn_select);
		
		JLabel label_3 = new JLabel("\u4FEE\u6539");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(20, 130, 54, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u5458\u5DE5\u53F7\uFF1A");
		label_4.setFont(new Font("宋体", Font.PLAIN, 14));
		label_4.setBounds(30, 155, 71, 15);
		contentPane.add(label_4);
		
		condition2 = new JTextField();
		condition2.setBounds(111, 152, 66, 21);
		contentPane.add(condition2);
		condition2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"position", "salary", "tel"}));
		comboBox.setBounds(43, 190, 134, 21);
		contentPane.add(comboBox);
		
		condition3 = new JTextField();
		condition3.setBounds(187, 190, 93, 21);
		contentPane.add(condition3);
		condition3.setColumns(10);
		
		JButton btn_updata = new JButton("\u4FEE\u6539");
		btn_updata.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {                       //修改
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
		btn_updata.setFont(new Font("宋体", Font.PLAIN, 14));
		btn_updata.setBounds(290, 189, 93, 23);
		contentPane.add(btn_updata);
		
		JLabel label_5 = new JLabel("\u5220\u9664");
		label_5.setFont(new Font("宋体", Font.PLAIN, 16));
		label_5.setBounds(20, 234, 54, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u5458\u5DE5\u53F7\uFF1A");
		label_6.setFont(new Font("宋体", Font.PLAIN, 14));
		label_6.setBounds(30, 261, 71, 15);
		contentPane.add(label_6);
		
		condition4 = new JTextField();
		condition4.setBounds(111, 258, 169, 21);
		contentPane.add(condition4);
		condition4.setColumns(10);
		
		JButton btn_delete = new JButton("\u5220\u9664");
		btn_delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {                            //删除
				if(true) {
					操作提示 c2 =new 操作提示();
					c2.setVisible(true);
					}
					else {
						操作提示1 c12 =new 操作提示1();
						c12.setVisible(true);
					}
			}
		});
		btn_delete.setFont(new Font("宋体", Font.PLAIN, 14));
		btn_delete.setBounds(290, 257, 93, 23);
		contentPane.add(btn_delete);
		
		JButton btn_return = new JButton("");
		btn_return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//返回
				dispose();			}
		});
		btn_return.setIcon(new ImageIcon(员工.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btn_return.setBounds(0, 0, 34, 25);
		contentPane.add(btn_return);
		
		print = new JTextArea();
		print.setBounds(30, 85, 538, 40);
		contentPane.add(print);
	}

}
