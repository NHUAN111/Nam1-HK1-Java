package ViewLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SinhVienDao extends DatabaseSV{
	
	//Đổ dữ liệu
	public static List<SinhVien> findAll(){
		List<SinhVien>sv1= new ArrayList<>();
		String query = "select * from QL_sv1";
		try {
			Connection connection = openConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				SinhVien sv = new SinhVien(rs.getString("MASV"), rs.getString("TEN"), 
						rs.getString("LOP"), rs.getString("DIACHI"), rs.getString("SODT"), 
						rs.getString("EMAIL"), rs.getInt("GIOITINH"), rs.getString("NGAYSINH"),
						rs.getString("MATKHAU"));
				        sv1.add(sv);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sv1;
	}
	
	//Thêm
	public boolean insert (SinhVien sv)throws Exception{
	String sql = "insert into QL_sv1 (MASV, TEN, LOP, DIACHI, SODT, GIOITINH, EMAIL, NGAYSINH, MATKHAU) values(?,?,?,?,?,?,?,?,?)";
	try(
			Connection conn = DatabaseSV.openConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
		pstmt.setString(1, sv.getMASV());
		pstmt.setString(2, sv.getTEN());
		pstmt.setString(3, sv.getLOP());
		pstmt.setString(4, sv.getDIACHI());
		pstmt.setString(5, sv.getSODT());
		pstmt.setInt(6, sv.getGIOITINH());
		pstmt.setString(7, sv.getEMAIL());
		pstmt.setString(8, sv.getNGAYSINH());
		pstmt.setString(9, sv.getMATKHAU());
		
		return pstmt.executeUpdate()>0;
		}
	}
	
	//Cập nhật
	public boolean update (SinhVien sv)throws Exception{
		String sql = "update QL_sv1 set TEN = ?, LOP = ?, DIACHI = ?, SODT = ?, GIOITINH = ?, EMAIL = ?, NGAYSINH = ?, MATKHAU = ? "
				+ "where MASV = ?";
		try(
				Connection conn = DatabaseSV.openConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setString(9, sv.getMASV());
			pstmt.setString(1, sv.getTEN());
			pstmt.setString(2, sv.getLOP());
			pstmt.setString(3, sv.getDIACHI());
			pstmt.setString(4, sv.getSODT());
			pstmt.setInt(5, sv.getGIOITINH());
			pstmt.setString(6, sv.getEMAIL());
			pstmt.setString(7, sv.getNGAYSINH());
			pstmt.setString(8, sv.getMATKHAU());
			
			return pstmt.executeUpdate()>0;
			}
		}
	
	//Xóa
	public boolean delete (String string)throws Exception{
		String sql = "delete from QL_sv1 where MASV = ?";
		try(
				Connection conn = DatabaseSV.openConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setString(1, string);
			
			return pstmt.executeUpdate()>0;
			}
		}
	
	//Tìm kiếm
	public SinhVien findById (String string)throws Exception{
		String sql = "select * from QL_sv1 where MASV = ? ";
		try(
				Connection conn = DatabaseSV.openConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
			){
			pstmt.setString(1, string);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				SinhVien sv1 = new SinhVien();
				sv1.setMASV(rs.getString("MASV"));
				sv1.setTEN(rs.getString("TEN"));
				sv1.setLOP(rs.getString("LOP"));
				sv1.setDIACHI(rs.getString("DIACHI"));
				sv1.setSODT(rs.getString("SODT"));
				sv1.setGIOITINH(rs.getInt("GIOITINH"));
				sv1.setEMAIL(rs.getString("EMAIL"));
				sv1.setNGAYSINH(rs.getString("NGAYSINH"));	
				sv1.setMATKHAU(rs.getString("MATKHAU"));
				
				return sv1;
			}
			return null;
		}
	}
}
