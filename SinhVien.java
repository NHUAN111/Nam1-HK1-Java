package ViewLogin;

public class SinhVien {
	private String MASV, TEN, LOP, DIACHI, SODT, EMAIL;
	private int GIOITINH;
	private String NGAYSINH, MATKHAU;
	
	public SinhVien() {
		
	}

	public SinhVien(String mASV, String tEN, String lOP, String dIACHI, String sODT, String eMAIL, int gIOITINH,
			String nGAYSINH, String mATKHAU) {
		
		this.MASV = mASV;
		this.TEN = tEN;
		this.LOP = lOP;
		this.DIACHI = dIACHI;
		this.SODT = sODT;
		this.EMAIL = eMAIL;
		this.GIOITINH = gIOITINH;
		this.NGAYSINH = nGAYSINH;
		this.MATKHAU = mATKHAU;
	}

	public String getMASV() {
		return MASV;
	}

	public void setMASV(String mASV) {
		this.MASV = mASV;
	}

	public String getTEN() {
		return TEN;
	}

	public void setTEN(String tEN) {
		this.TEN = tEN;
	}

	public String getLOP() {
		return LOP;
	}

	public void setLOP(String lOP) {
		this.LOP = lOP;
	}

	public String getDIACHI() {
		return DIACHI;
	}

	public void setDIACHI(String dIACHI) {
		this.DIACHI = dIACHI;
	}

	public String getSODT() {
		return SODT;
	}

	public void setSODT(String sODT) {
		this.SODT = sODT;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		this.EMAIL = eMAIL;
	}

	public int getGIOITINH() {
		return GIOITINH;
	}

	public void setGIOITINH(int gIOITINH) {
		this.GIOITINH = gIOITINH;
	}

	public String getNGAYSINH() {
		return NGAYSINH;
	}

	public void setNGAYSINH(String nGAYSINH) {
		this.NGAYSINH = nGAYSINH;
	}

	public String getMATKHAU() {
		return MATKHAU;
	}

	public void setMATKHAU(String mATKHAU) {
		this.MATKHAU = mATKHAU;
	}	
}