package kk;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class aa extends JFrame {

	private JPanel contentPane;
	private JTextField user_name;
	private JPasswordField pass_word;
	public JRadioButton r1;
	public JRadioButton r2;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aa frame = new aa();
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
	
	public aa() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u6B22\u8FCE\u8FDB\u5165\u4EBA\u4E8B\u7BA1\u7406\u7CFB\u7EDF");
		label.setForeground(Color.BLUE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("΢���ź�", Font.BOLD, 18));
		label.setBounds(10, 10, 363, 34);
		contentPane.add(label);
		
		JLabel Label_username = new JLabel("\u7528\u6237\u540D\uFF1A");
		Label_username.setFont(new Font("����", Font.PLAIN, 16));
		Label_username.setBounds(33, 92, 77, 34);
		contentPane.add(Label_username);
		
		JLabel label_password = new JLabel("\u5BC6\u7801\uFF1A");
		label_password.setFont(new Font("����", Font.PLAIN, 16));
		label_password.setBounds(33, 151, 77, 35);
		contentPane.add(label_password);
		
		user_name = new JTextField();                                                     //�û���
		user_name.setBounds(149, 100, 155, 21);
		contentPane.add(user_name);
		user_name.setColumns(10);
		
		pass_word = new JPasswordField();                                            //����
		pass_word.setBounds(149, 159, 155, 21);
		contentPane.add(pass_word);
		
		r1 = new JRadioButton("\u7BA1\u7406\u5458");              //����Աѡ��
		r1.setBounds(90, 217, 103, 23);
		contentPane.add(r1);
		
		r2 = new JRadioButton("\u5458\u5DE5");            //Ա��ѡ��
		r2.setBounds(208, 217, 83, 23);
		contentPane.add(r2);
		
		ButtonGroup group =new ButtonGroup();
		group.add(r1);
		group.add(r2);
		
		JButton btn_login = new JButton("\u767B\u5F55");                    //��¼
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				����ѡ�� frame = new ����ѡ��();
				����ѡ��1 frame1 = new ����ѡ��1();
				String p1 =new String(pass_word.getPassword());
				
				if(user_name.getText().equals("12345") && p1.equals("12345")&&r1.isSelected()) {
				frame.setVisible(true);
				
				}
				else if(user_name.getText().equals("12345") && p1.equals("12345")&&r2.isSelected()) {
					frame1.setVisible(true);
				}
				else
				{
					��½��ʾ frame2 = new ��½��ʾ();
					frame2.setVisible(true);
				}
			}
		});
		btn_login.setBounds(90, 272, 93, 23);
		contentPane.add(btn_login);
		
		JButton btn_exit = new JButton("\u9000\u51FA");               //�˳�
		btn_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btn_exit.setBounds(198, 272, 93, 23);
		contentPane.add(btn_exit);
	}
}
