package DOANOOP.NHANVIEN;

import java.util.Date;
import java.io.*;

public class BANHANG extends NHANVIEN {
	private int ngayCong;
	private float heSoThuong = 0.05f;
	
	public BANHANG() {
		super();
	}
	
	public BANHANG(NHANVIEN nv) {
		super(nv);
	}
	
	public BANHANG(String chucVu, String maNhanVien, String tenNhanVien, String sDT, String diaChi, Boolean gioiTinh,
			long luongCoBan, Date ngaySinh, Date ngayVaoLam, int ngayCong, float heSoThuong) {
		super(chucVu, maNhanVien, tenNhanVien, sDT, diaChi, gioiTinh, luongCoBan, ngaySinh, ngayVaoLam);
		this.ngayCong = ngayCong;
		this.heSoThuong = heSoThuong;
	}

	public int getNgayCong() {
		return ngayCong;
	}

	public void setNgayCong(int ngayCong) {
		this.ngayCong = ngayCong;
	}

	public float getHeSoThuong() {
		return heSoThuong;
	}

	public void setHeSoThuong(float heSoThuong) {
		this.heSoThuong = heSoThuong;
	}
	
	@Override
    public long tinhLuong() {
        long luong = getLuongCoBan() + (long) (ngayCong * getLuongCoBan() * heSoThuong);
        return luong;
    }
	
    @Override
    public void input() {
        super.input();
        System.out.println("Nhap so ngay cong: ");
        while (true) {
            try {
                ngayCong = Integer.parseInt(sc.nextLine());
                break; 
            } catch (NumberFormatException e) {
            }
        }
    }

    @Override
    public void output() {
        super.output();
        if (getChucVu().equalsIgnoreCase("Ban hang")) {
            System.out.println("So ngay cong: " + getNgayCong());
            System.out.println("Luong thang: " + tinhLuong());
        }
    }
    
    @Override
    public void docFile(String tenFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(tenFile))) {
            String chucVu = br.readLine();
            String maNhanVien = br.readLine();
            this.setChucVu(chucVu);
            this.setMaNhanVien(maNhanVien);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ghiFile(String tenFile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(tenFile))) {
            bw.write(this.getChucVu());
            bw.newLine();
            bw.write(this.getMaNhanVien());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


