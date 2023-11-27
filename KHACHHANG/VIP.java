package DOANOOP.KHACHHANG;

import java.io.*;

public class VIP extends KHACHHANG {
    private float heSoThuong = 0.03f;
    
	public VIP() {
		super();
	}

	public VIP(KHACHHANG nv) {
		super(nv);
	}

	public VIP(String Loai, String maKH, String tenKH, String SDT, String diaChi, Boolean gioiTinh, float heSoThuong) {
		super(Loai, maKH, tenKH, SDT, diaChi, gioiTinh);
		this.heSoThuong = heSoThuong;
	}

    public float getHeSoThuong() {
        return heSoThuong;
    }

    public void setHeSoThuong(float heSoThuong) {
        this.heSoThuong = heSoThuong;
    }
    
    @Override
    public void docFile(String tenFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(tenFile))) {
            String Loai = br.readLine();
            String maKH = br.readLine();

            this.setLoai(Loai);
            this.setMaKH(maKH);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ghiFile(String tenFile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(tenFile))) {
            bw.write(this.getLoai());
            bw.newLine();
            bw.write(this.getMaKH());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}