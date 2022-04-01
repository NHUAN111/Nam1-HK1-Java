package ViewLogin;

import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class View {

	private JFrame frmQunLSinh;
	private JTextField txtMasv;
	private JTextField txtTen;
	private JTextField txtLop;
	private JTextField txtDiachi;
	private JTextField txtSdt;
	private JTextField txtEmail;
	private JTextField txtNgaySinh;
	private static JTable table;
	private JTextField txtMakhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frmQunLSinh.setVisible(true);
					window.frmQunLSinh.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public View() {
		initialize();
	}

	private void initialize() {
		frmQunLSinh = new JFrame();
		frmQunLSinh.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmQunLSinh.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\BaiTHJava(nhom2)\\Student-3-icon (1).png"));
		frmQunLSinh.setFont(new Font("Dialog", Font.BOLD, 14));
		frmQunLSinh.setTitle("Quản lý tài khoản");
		frmQunLSinh.setBounds(100, 100, 977, 531);
		frmQunLSinh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQunLSinh.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Tài khoản sinh viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(425, 20, 310, 46);
		frmQunLSinh.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("M\u00E3 sinh vi\u00EAn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(49, 72, 120, 26);
		frmQunLSinh.getContentPane().add(lblNewLabel_1);

		txtMasv = new JTextField();
		txtMasv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMasv.setBounds(179, 73, 175, 26);
		frmQunLSinh.getContentPane().add(txtMasv);
		txtMasv.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("H\u1ECD v\u00E0 t\u00EAn");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(49, 128, 120, 26);
		frmQunLSinh.getContentPane().add(lblNewLabel_2);

		txtTen = new JTextField();
		txtTen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTen.setBounds(179, 129, 175, 26);
		frmQunLSinh.getContentPane().add(txtTen);
		txtTen.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("L\u1EDBp");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(49, 182, 120, 26);
		frmQunLSinh.getContentPane().add(lblNewLabel_3);

		txtLop = new JTextField();
		txtLop.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLop.setBounds(179, 183, 175, 25);
		frmQunLSinh.getContentPane().add(txtLop);
		txtLop.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(49, 229, 96, 31);
		frmQunLSinh.getContentPane().add(lblNewLabel_4);

		JRadioButton btnNam = new JRadioButton("Nam");
		btnNam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNam.setBounds(179, 234, 63, 21);
		frmQunLSinh.getContentPane().add(btnNam);

		JRadioButton btnNu = new JRadioButton("N\u1EEF");
		btnNu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNu.setBounds(291, 234, 63, 21);
		frmQunLSinh.getContentPane().add(btnNu);

		JLabel lblNewLabel_5 = new JLabel("\u0110\u1ECBa ch\u1EC9");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(49, 283, 107, 26);
		frmQunLSinh.getContentPane().add(lblNewLabel_5);

		txtDiachi = new JTextField();
		txtDiachi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDiachi.setBounds(179, 284, 500, 25);
		frmQunLSinh.getContentPane().add(txtDiachi);
		txtDiachi.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(387, 130, 109, 26);
		frmQunLSinh.getContentPane().add(lblNewLabel_6);

		txtSdt = new JTextField();
		txtSdt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSdt.setBounds(504, 131, 175, 26);
		frmQunLSinh.getContentPane().add(txtSdt);
		txtSdt.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Email");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(387, 183, 109, 24);
		frmQunLSinh.getContentPane().add(lblNewLabel_7);

		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEmail.setBounds(504, 182, 175, 26);
		frmQunLSinh.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);

		// Lưu
		JButton btnNewButton = new JButton("L\u01B0u");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				if (txtMasv.getText().equals("")) {
					sb.append("Mã sinh viên không được để trống");
					txtMasv.setBackground(Color.red);
				} else {
					txtMasv.setBackground(Color.white);
				}
				if (sb.length() > 0) {
					JOptionPane.showMessageDialog(null, sb);
					return;
				}

				try {
					SinhVien sv = new SinhVien();
					sv.setMASV(txtMasv.getText());
					sv.setTEN(txtTen.getText());
					sv.setLOP(txtLop.getText());
					sv.setDIACHI(txtDiachi.getText());
					sv.setSODT(txtSdt.getText());
					sv.setEMAIL(txtEmail.getText());
					sv.setGIOITINH(btnNam.isSelected() ? 1 : 0);
					sv.setNGAYSINH(txtNgaySinh.getText());
					sv.setMATKHAU(txtMakhau.getText());

					SinhVienDao dao = new SinhVienDao();
					dao.insert(sv);

					JOptionPane.showMessageDialog(null, "Tài khoản đã được lưu");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Tài khoản đã tồn tại!", "Lỗi ", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\add.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(783, 183, 120, 27);
		frmQunLSinh.getContentPane().add(btnNewButton);

		// Cập nhật
		JButton btnNewButton_1 = new JButton("C\u1EADp nh\u1EADt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				if (txtMasv.getText().equals("")) {
					sb.append("Mã sinh viên không được để trống");
					txtMasv.setBackground(Color.red);
				} else {
					txtMasv.setBackground(Color.white);
				}
				if (sb.length() > 0) {
					JOptionPane.showMessageDialog(null, sb);
					return;
				}
				if (JOptionPane.showConfirmDialog(null, "Bạn có muốn cập nhật tài khoản này không ?", "Thông báo", 0) == JOptionPane.NO_OPTION) {
					return;
				}
				try {
					SinhVien sv = new SinhVien();
					sv.setMASV(txtMasv.getText());
					sv.setTEN(txtTen.getText());
					sv.setLOP(txtLop.getText());
					sv.setDIACHI(txtDiachi.getText());
					sv.setSODT(txtSdt.getText());
					sv.setEMAIL(txtEmail.getText());
					sv.setGIOITINH(btnNam.isSelected() ? 1 : 0);
					sv.setNGAYSINH(txtNgaySinh.getText());
					sv.setMATKHAU(txtMakhau.getText());

					SinhVienDao dao = new SinhVienDao();
					dao.update(sv);

					JOptionPane.showMessageDialog(null, "Tài khoản đã được cập nhật");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Thất bại", "Lỗi ", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\update.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(783, 232, 120, 26);
		frmQunLSinh.getContentPane().add(btnNewButton_1);

		// Xóa
		JButton btnNewButton_2 = new JButton("X\u00F3a");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				if (txtMasv.getText().equals("")) {
					sb.append("Mã sinh viên không được để trống");
					txtMasv.setBackground(Color.red);
				} else {
					txtMasv.setBackground(Color.white);
				}
				if (sb.length() > 0) {
					JOptionPane.showMessageDialog(null, sb);
					return;
				}
				if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa tài khoản này không ?", "Thông báo", JOptionPane.ERROR_MESSAGE) == JOptionPane.NO_OPTION) {
					return;
				}
				try {
					SinhVienDao dao = new SinhVienDao();
					dao.delete(txtMasv.getText());

					JOptionPane.showMessageDialog(null, "Tài khoản đã được xóa ");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Thất bại", "Lỗi ", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\Sign-Error-icon.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(783, 284, 120, 26);
		frmQunLSinh.getContentPane().add(btnNewButton_2);

		// Thoát
		JButton btnNewButton_3 = new JButton("Tho\u00E1t");
		btnNewButton_3.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\logout-icon (1).png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(867, 0, 96, 28);
		frmQunLSinh.getContentPane().add(btnNewButton_3);

		JLabel lblNewLabel_8 = new JLabel("Ng\u00E0y sinh");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(387, 76, 96, 24);
		frmQunLSinh.getContentPane().add(lblNewLabel_8);

		txtNgaySinh = new JTextField();
		txtNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNgaySinh.setBounds(504, 76, 175, 26);
		frmQunLSinh.getContentPane().add(txtNgaySinh);
		txtNgaySinh.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\icon1.png"));
		lblNewLabel_9.setBounds(349, 0, 75, 73);
		frmQunLSinh.getContentPane().add(lblNewLabel_9);

		// Tìm kiếm
		JButton btnNewButton_5 = new JButton("T\u00ECm ki\u1EBFm");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMasv.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Cần nhập mã sinh viên", "Lỗi", JOptionPane.ERROR_MESSAGE);
					return;
				}

				try {
					SinhVienDao sv1 = new SinhVienDao();

					SinhVien sv = sv1.findById(txtMasv.getText());

					if (sv != null) {
						txtTen.setText(sv.getTEN());
						txtLop.setText(sv.getLOP());
						txtDiachi.setText(sv.getDIACHI());
						txtSdt.setText(sv.getSODT());
						btnNam.setSelected(sv.getGIOITINH() == 1);
						btnNu.setSelected(sv.getGIOITINH() == 0);
						txtEmail.setText(sv.getEMAIL());
						txtDiachi.setText(sv.getDIACHI());
						txtNgaySinh.setText(sv.getNGAYSINH());
						txtMakhau.setText(sv.getMATKHAU());
					} else {
						JOptionPane.showMessageDialog(null, "Tài khoản không tìm thấy");
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\Search-icon.png"));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.setBounds(783, 71, 120, 31);
		frmQunLSinh.getContentPane().add(btnNewButton_5);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 335, 943, 2);
		frmQunLSinh.getContentPane().add(separator);

		// Nhập mới
		JButton btnNewButton_4 = new JButton("Nhập mới");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMasv.setText(null);
				txtTen.setText(null);
				txtLop.setText(null);
				txtDiachi.setText(null);
				txtSdt.setText(null);
				txtEmail.setText(null);
				txtNgaySinh.setText(null);
				txtMakhau.setText(null);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("D:\\BaiTHJava(nhom2)\\new-icon.png"));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBounds(783, 127, 120, 31);
		frmQunLSinh.getContentPane().add(btnNewButton_4);		
		
		
		String[] listColumn = {"MASV", "TEN", "LOP", "DIACHI", "SODT", "GIOITINH", "EMAIL", "NGAYSINH", "MATKHAU"};
		List<SinhVien> listItem = SinhVienDao.findAll();
		DefaultTableModel model = new ClassTableModel().setTableSinhVien(listItem, listColumn);
		JTable table = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		scrollPane.setBounds(10, 347, 943, 137);
		frmQunLSinh.getContentPane().add(scrollPane);
//		
//		JTable table = new JTable();
//		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null, null, null },
//				{ null, null, null, null, null, null, null, null, null },
//				{ null, null, null, null, null, null, null, null, null },
//				{ null, null, null, null, null, null, null, null, null },
//				{ null, null, null, null, null, null, null, null, null },
//				{ null, null, null, null, null, null, null, null, null },
//				{ null, null, null, null, null, null, null, null, null },
//				{ null, null, null, null, null, null, null, null, null },
//				{ null, null, null, null, null, null, null, null, null },
//				{ null, null, null, null, null, null, null, null, null },
//
//		}, new String[] { "M\u00E3 SV", "H\u1ECD v\u00E0 t\u00EAn", "L\u1EDBp", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh",
//				"\u0110\u1ECBa ch\u1EC9", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "Email", "M\u1EADt kh\u1EA9u Email" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(37);
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(83);
		table.getColumnModel().getColumn(2).setPreferredWidth(35);
		table.getColumnModel().getColumn(4).setPreferredWidth(58);
		table.getColumnModel().getColumn(5).setPreferredWidth(105);
		table.getColumnModel().getColumn(7).setPreferredWidth(81);
//		scrollPane.setViewportView(table);
//		showwData(SinhVienDao.findAll());

		JLabel lblNewLabel_10 = new JLabel("Mật khẩu Email");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(387, 232, 120, 24);
		frmQunLSinh.getContentPane().add(lblNewLabel_10);

		txtMakhau = new JTextField();
		txtMakhau.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMakhau.setBounds(504, 231, 175, 25);
		frmQunLSinh.getContentPane().add(txtMakhau);
		txtMakhau.setColumns(10);
	}

	public void showwData(List<SinhVien> sv) {
		List<SinhVien> svv = new ArrayList<>();
		svv = sv;
		DefaultTableModel tableModel;
		table.getModel();
		tableModel = (DefaultTableModel) table.getModel();
		tableModel.setRowCount(0);
		svv.forEach((SinhVien) -> {
			tableModel.addRow(new Object[] { SinhVien.getMASV(), SinhVien.getTEN(), SinhVien.getLOP(),
					SinhVien.getGIOITINH(), SinhVien.getEMAIL(), SinhVien.getDIACHI(), SinhVien.getSODT(),
					SinhVien.getMATKHAU(), SinhVien.getNGAYSINH() });
		});
	}
}
