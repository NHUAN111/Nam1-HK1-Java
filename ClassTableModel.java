package ViewLogin;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ClassTableModel {
	public DefaultTableModel setTableSinhVien(List<SinhVien> listItem, String[] listColumn) {
		DefaultTableModel dtm = new DefaultTableModel() {
			public boolean isCellEditTable(int row, int column) {
				return false;
			}
		};
		dtm.setColumnIdentifiers(listColumn);
		int column = listColumn.length;
		Object[] obj = null;
		int row = listItem.size();
		if(row > 0)
		{
			for (int i = 0; i < row; i++)
			{
				SinhVien sinhVien = listItem.get(i);
				obj = new Object[column];
				obj[0] = sinhVien.getMASV();
				obj[1] = sinhVien.getTEN();
				obj[2] = sinhVien.getLOP();
				obj[3] = sinhVien.getDIACHI();
				obj[4] = sinhVien.getSODT();
				obj[5] = sinhVien.getGIOITINH() == 1 ? "Nam" : "Nữ";
				obj[6] = sinhVien.getEMAIL();
				obj[7] = sinhVien.getNGAYSINH();
				obj[8] = sinhVien.getMATKHAU();
				dtm.addRow(obj);
			}
		}
		return dtm;
	}
	
}
