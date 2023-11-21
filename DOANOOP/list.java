package DOANOOP;

import java.util.Scanner;
import java.io.*;

public class list implements function, read {
	private static final int INITIAL_CAPACITY = 10;
    private KH[] danhSachKhachHang;
    private int soLuongKhachHang;
    private Scanner sc = new Scanner(System.in);

    public list() {
        danhSachKhachHang = new KH[INITIAL_CAPACITY];
        soLuongKhachHang = 0;
    }

    @Override
    public void Them() {
        if (soLuongKhachHang == danhSachKhachHang.length) {
            danhSachKhachHang = java.util.Arrays.copyOf(danhSachKhachHang, danhSachKhachHang.length * 2);
        }

        System.out.println("Chon loai khach hang:");
        System.out.println("1. Than thiet");
        System.out.println("2. VIP");

        int choice = sc.nextInt();

        KH KhachHang = null;

        switch (choice) {
            case 1:
                KhachHang = new TT();
                break;
            case 2:
                KhachHang = new VIP();
                break;
            default:
                System.out.println("Lua chon khong hop le.");
                return;
        }

        if (KhachHang != null) {
            KhachHang.input();
            danhSachKhachHang[soLuongKhachHang] = KhachHang;
            soLuongKhachHang++;
            System.out.println("Them khach hang thanh cong!");
        }
    }

    @Override
    public void Xoa() {
        System.out.println("Nhap ma khach hang can xoa: ");
        String maNhanVien = sc.nextLine();

        int index = -1;
        for (int i = 0; i < soLuongKhachHang; i++) {
            KH kh = danhSachKhachHang[i];
            if (kh != null && kh.getMaKH().equals(maNhanVien)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < soLuongKhachHang - 1; i++) {
                danhSachKhachHang[i] = danhSachKhachHang[i + 1];
            }
            danhSachKhachHang[soLuongKhachHang - 1] = null;
            soLuongKhachHang--;
            System.out.println("Xoa khach hang thanh cong.");
        } else {
            System.out.println("Khong tim thay khach hang cung ma.");
        }
    }

    @Override
    public void Sua() {
        System.out.println("Nhap ma khach hang can sua: ");
        String maNhanVien = sc.nextLine();

        for (KH kh : danhSachKhachHang) {
            if (kh != null && kh.getMaKH().equals(maNhanVien)) {
                kh.input();
                System.out.println("Sua khach hang thanh cong!");
                return;
            }
        }

        System.out.println("Khong tim thay khach hang cung ma.");
    }

    @Override
    public void timKiem() {
        System.out.println("Nhap ma hoac ten khach hang can tim: ");
        String key = sc.nextLine().toLowerCase();

        for (KH kh : danhSachKhachHang) {
            if (kh != null && (kh.getMaKH().toLowerCase().contains(key) || kh.getTenKH().toLowerCase().contains(key))) {
                kh.output();
                System.out.println("--------------------");
            }
        }
    }

    @Override
    public void capNhat() {
        System.out.println("Nhap ma khach hang can cap nhat: ");
        String maNhanVien = sc.nextLine();

        for (KH kh : danhSachKhachHang) {
            if (kh != null && kh.getMaKH().equals(maNhanVien)) {
                File dataFolder = new File("data");
                if (!dataFolder.exists()) {
                    dataFolder.mkdirs(); 
                }
                kh.ghiFile("data/" + maNhanVien + ".dat");
                System.out.println("Cap nhat khach hang thanh cong!");
                return;
            }
        }

        System.out.println("Khong tim thay khach hang cung ma.");
    }

    @Override
    public void hienThiDanhSach() {
        for (KH kh : danhSachKhachHang) {
            if (kh != null) {
                kh.output();
                System.out.println("--------------------");
            }
        }
    }


    public void docFile(String tenFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(tenFile))) {
            soLuongKhachHang = Integer.parseInt(br.readLine());
            danhSachKhachHang = new KH[soLuongKhachHang];
            System.out.println("Doc file thanh cong!");
        } catch (IOException e) {
            System.out.println("Loi khi doc file: " + e.getMessage());
        }
    }

    public void ghiFile(String tenFile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(tenFile))) {
            bw.write(Integer.toString(soLuongKhachHang));
            bw.newLine();
            for (int i = 0; i < soLuongKhachHang; i++) {
                KH kh = danhSachKhachHang[i];
                if (kh != null) {
                    bw.write(kh.toString());
                    bw.newLine();
                }
            }
            System.out.println("Ghi file thanh cong!");
        } catch (IOException e) {
            System.out.println("Loi khi ghi file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        list dsKhachHang = new list();
        
        dsKhachHang.docFile("danhsachkhachhang.text");

        dsKhachHang.Them();
        dsKhachHang.hienThiDanhSach();
        dsKhachHang.Xoa();
        dsKhachHang.hienThiDanhSach();
        dsKhachHang.Sua();
        dsKhachHang.hienThiDanhSach();
        dsKhachHang.timKiem();
        dsKhachHang.capNhat();
        
        dsKhachHang.ghiFile("danhsachkhachhang.text");
    }

    default void chonChucNang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tu 1 den 6 de thuc hien:");
		System.out.println("1. Them khach hang");
		System.out.println("2. Xoa khach hang");
		System.out.println("3. Sua thong tin khach hang");
		System.out.println("4. Tim kiem khach hang");
		System.out.println("5. Cap nhat thong tin khach hang");
		System.out.println("6. Hien thi danh sach khach hang");
		int choice = sc.nextInt();

		switch (choice) {
			case 1:
				Them();
				break;
			case 2:
				Xoa();
				break;
			case 3:
				Sua();
				break;
			case 4:
				timKiem();
				break;
			case 5:
				capNhat();
				break;
			case 6:
				hienThiDanhSach();
				break;
			default:
				System.out.println("Lua chon khong hop le.");
				break;
		}
	}
}