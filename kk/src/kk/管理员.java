package kk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class 管理员 extends JFrame {

	private JPanel contentPane;
	private JTextField condition1;
	private JTextField textField_1;
	private JTextField condition2;
	private JTextField condition3;
	private JTextArea print;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					管理员 frame = new 管理员();
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
	public 管理员() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7BA1\u7406\u5458\u4FE1\u606F");
		label.setForeground(Color.RED);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("宋体", Font.PLAIN, 18));
		label.setBounds(10, 10, 456, 15);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\u67E5\u8BE2");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 46, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8F93\u5165\u7BA1\u7406\u5458\u7F16\u53F7\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 71, 129, 15);
		contentPane.add(lblNewLabel_1);
		
		condition1 = new JTextField();
		condition1.setBounds(169, 68, 108, 21);
		contentPane.add(condition1);
		condition1.setColumns(10);
		
		JButton btn_select = new JButton("\u67E5\u8BE2");
		btn_select.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {                      //查询
				if(true) {
					print.append(condition1.getText());
					
				}
				else {
					
				}
				
			}
		});
		btn_select.setFont(new Font("宋体", Font.PLAIN, 14));
		btn_select.setBounds(319, 67, 93, 23);
		contentPane.add(btn_select);
		
		JLabel lblNewLabel_2 = new JLabel("\u4FEE\u6539");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(20, 179, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 248, 108, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
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
		btn_updata.setBounds(319, 247, 93, 23);
		contentPane.add(btn_updata);
		
		JLabel lbll = new JLabel("\u5220\u9664\uFF1A");
		lbll.setFont(new Font("宋体", Font.PLAIN, 16));
		lbll.setBounds(20, 292, 54, 15);
		contentPane.add(lbll);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(20, 217, 54, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u7BA1\u7406\u5458\u7F16\u53F7\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 14));
		label_2.setBounds(30, 217, 102, 15);
		contentPane.add(label_2);
		
		condition2 = new JTextField();
		condition2.setBounds(169, 217, 108, 21);
		contentPane.add(condition2);
		condition2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u7BA1\u7406\u5458\u7F16\u53F7\uFF1A");
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		label_3.setBounds(30, 317, 108, 15);
		contentPane.add(label_3);
		
		condition3 = new JTextField();
		condition3.setBounds(169, 315, 108, 21);
		contentPane.add(condition3);
		condition3.setColumns(10);
		
		JButton btn_delete = new JButton("\u5220\u9664");
		btn_delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {                       //删除
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
		btn_delete.setBounds(319, 314, 93, 23);
		contentPane.add(btn_delete);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"position", "salary", "tel"}));
		comboBox.setBounds(30, 242, 102, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {//返回
				dispose();
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(管理员.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btnNewButton_3.setBounds(20, 10, 35, 26);
		contentPane.add(btnNewButton_3);
		
		print = new JTextArea();
		print.setBounds(128, 99, 396, 67);
		contentPane.add(print);
	}
}
