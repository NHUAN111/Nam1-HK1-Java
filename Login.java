package Login_sy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import java.awt.Toolkit;

import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import ViewLogin.View;

import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
public class Login {

	private JFrame frmngNhpH;
	private JTextField txtTen;
	private JPasswordField txtMk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmngNhpH.setVisible(true);
					window.frmngNhpH.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmngNhpH = new JFrame();
		frmngNhpH.getContentPane().setForeground(new Color(0, 0, 0));
		frmngNhpH.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frmngNhpH.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmngNhpH.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\BaiTHJava(nhom2)\\Book-icon (1).png"));
		frmngNhpH.setFont(new Font("Dialog", Font.PLAIN, 16));
		frmngNhpH.setTitle("\u0110\u0103ng nh\u1EADp h\u1EC7 th\u1ED1ng");
		frmngNhpH.setBounds(100, 100, 567, 346);
		frmngNhpH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmngNhpH.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(242, 40, 145, 25);
		frmngNhpH.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mật khẩu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(243, 130, 82, 25);
		frmngNhpH.getContentPane().add(lblNewLabel_1);
		
		txtTen = new JTextField();
		txtTen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTen.setBounds(243, 75, 159, 24);
		frmngNhpH.getContentPane().add(txtTen);
		txtTen.setColumns(10);
		
		txtMk = new JPasswordField();
		txtMk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMk.setBounds(242, 162, 160, 25);
		frmngNhpH.getContentPane().add(txtMk);
		
		//Đăng nhập
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\Sign-Select-icon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mk = txtMk.getText();
				String ten = txtTen.getText();
				
				if(mk.contains("Nhuan123@") && ten.contains("Nhuan")) {
					txtMk.setText(null);
					txtTen.setText(null);
					
					//View1 input = new View1();
					//View1.main(null);
					View input = new View();
					View.main(null);
					
				}else {
					JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu sai!", "Lỗi", JOptionPane.ERROR_MESSAGE);
					txtMk.setText(null);
					txtTen.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(98, 232, 135, 33);
		frmngNhpH.getContentPane().add(btnNewButton);
		
		//Thoát
		JButton btnNewButton_1 = new JButton("Thoát");
		btnNewButton_1.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\logout-icon (1).png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(391, 232, 96, 33);
		frmngNhpH.getContentPane().add(btnNewButton_1);
		
		//Xóa
		JButton btnNewButton_2 = new JButton("Xóa");
		btnNewButton_2.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\Sign-Error-icon.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTen.setText(null);
				txtMk.setText(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(264, 232, 96, 33);
		frmngNhpH.getContentPane().add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 210, 533, 2);
		frmngNhpH.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\NEN.png"));
		lblNewLabel_2.setBounds(66, 40, 126, 134);
		frmngNhpH.getContentPane().add(lblNewLabel_2);
		
	}
}
