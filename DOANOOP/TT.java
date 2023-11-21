package DOANOOP;

import java.io.*;

public class TT extends KH {
    private float heSoThuong = 0.08f;
    
	public TT() {
		super();
	}

	public TT(KH nv) {
		super(nv);
	}

	public TT(String Loai, String maKH, String tenKH, String SDT, String diaChi, Boolean gioiTinh, float heSoThuong) {
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
    public void output() {
        super.output();
        if (getLoai().equalsIgnoreCase("TT")) {
            System.out.println("Luong thang: " + tinhLuong());
        }
    }
    
    @Override
    public void docFile(String tenFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(tenFile))) {
            String chucVu = br.readLine();
            String maKH = br.readLine();

            this.setLoai(chucVu);
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

    @Override
    public long tinhLuong() {
        throw new UnsupportedOperationException("Unimplemented method 'tinhLuong'");
    }
}