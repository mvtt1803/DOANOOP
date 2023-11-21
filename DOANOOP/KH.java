package DOANOOP;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class KH implements read {
	private String Loai, maKH, tenKH, SDT, DiaChi;
	private Boolean GioiTinh;
	Scanner sc = new Scanner(System.in);

	public KH() {
	}

	
	public KH(String Loai, String maKH, String tenKH, String SDT, String DiaChi, Boolean GioiTinh) {
		this.Loai = Loai;
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.SDT = SDT;
		this.DiaChi = DiaChi;
		this.GioiTinh = GioiTinh;
	}
	
	public KH(KH kh) {
		this.Loai = kh.Loai;
		this.maKH = kh.maKH;
		this.tenKH = kh.tenKH;
		this.SDT = kh.SDT;
		this.DiaChi = kh.DiaChi;
		this.GioiTinh = kh.GioiTinh;
	}
	
	@Override
    public void docFile(String tenFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(tenFile))) {
			setLoai(reader.readLine());
            setMaKH(reader.readLine());
            setTenKH(reader.readLine());
            setSDT(reader.readLine());
            setDiaChi(reader.readLine());
            setGioiTinh(Boolean.parseBoolean(reader.readLine()));

        } catch (IOException e) {
            System.out.println("Loi khi doc file: " + e.getMessage());
        }
    }

    @Override
    public void ghiFile(String tenFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tenFile))) {
            writer.write(getMaKH() + "\n");
			writer.write(getLoai() + "\n");
            writer.write(getTenKH() + "\n");
            writer.write(getSDT() + "\n");
            writer.write(getDiaChi() + "\n");
            writer.write(String.valueOf(getGioiTinh()) + "\n");

        } catch (IOException e) {
            System.out.println("Loi khi ghi file: " + e.getMessage());
        }
    }

	public String getLoai() {
		return Loai;
	}

	public void setLoai(String Loai) {
		this.Loai = Loai;
	}
	
	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String SDT) {
		this.SDT = SDT;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String DiaChi) {
		this.DiaChi = DiaChi;
	}
	
	public Boolean getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(Boolean GioiTinh) {
		this.GioiTinh = GioiTinh;
	}
	
	public abstract long tinhLuong();
	
	public void input() {
        do {
            System.out.println("Nhap ma khach hang: ");
            setMaKH(sc.nextLine());
        } while (getMaKH() == null || getMaKH().isEmpty());

        do {
            System.out.println("Nhap ten khach hang: ");
            setTenKH(sc.nextLine());
        } while (getTenKH() == null || getTenKH().isEmpty());

        do {
            System.out.println("Nhap so dien thoai: ");
            setSDT(sc.nextLine());
        } while (getSDT() == null || !getSDT().matches("\\d{10}"));

        System.out.println("Nhap dia chi: ");
        setDiaChi(sc.nextLine());

        System.out.println("Nhap gioi tinh (true/false): ");
        setGioiTinh(sc.nextBoolean());

		System.out.println("Chon loai: ");
		System.out.println("  1. Than thiet");
		System.out.println("  2. VIP");
		System.out.println("Moi ban chon: ");
		boolean r = false;
		while (!r) {
			int luaChon = sc.nextInt();
			switch (luaChon) {
			case 1: {
				setLoai("Than thiet");
				System.out.println("Than thiet");
				r = true;
				break;
			}
			case 2: {
				setLoai("VIP");
				System.out.println("VIP");
				r = true;
				break;
			}
			default:
				System.out.println("Lua chon khong dung yeu cau! Vui long chon lai.");
			}
		}
    }			
	
	public void output() {
        System.out.println("Thong tin khach hang:");
        System.out.println("Ma khach hang: " + getMaKH());
        System.out.println("Ten khach hang: " + getTenKH());
        System.out.println("So dien thoai: " + getSDT());
        System.out.println("Dia chi: " + getDiaChi());
        System.out.println("Gioi tinh: " + (getGioiTinh() ? "Nam" : "Nu"));
		System.out.println("Chuc vu: " + (getLoai() != null ? getLoai() : "Chua xac dinh"));
    }
}
	
