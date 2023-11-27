package DOANOOP.KHACHHANG;

import java.util.Scanner;
import java.io.*;

public class list implements function, read {
	private static final int INITIAL_CAPACITY = 10;
    private KHACHHANG[] danhSachKhachHang;
    private int soLuongKhachHang;
    private Scanner sc = new Scanner(System.in);

    public list() {
        danhSachKhachHang = new KHACHHANG[INITIAL_CAPACITY];
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

        KHACHHANG KhachHang = null;

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
        String maKH = sc.nextLine();

        int index = -1;
        for (int i = 0; i < soLuongKhachHang; i++) {
            KHACHHANG kh = danhSachKhachHang[i];
            if (kh != null && kh.getMaKH().equals(maKH)) {
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
        String maKH = sc.nextLine();

        for (KHACHHANG kh : danhSachKhachHang) {
            if (kh != null && kh.getMaKH().equals(maKH)) {
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

        for (KHACHHANG kh : danhSachKhachHang) {
            if (kh != null && (kh.getMaKH().toLowerCase().contains(key) || kh.getTenKH().toLowerCase().contains(key))) {
                kh.output();
                System.out.println("--------------------");
            }
        }
    }

    @Override
    public void hienThiDanhSach() {
        for (KHACHHANG kh : danhSachKhachHang) {
            if (kh != null) {
                kh.output();
                System.out.println("--------------------");
            }
        }
    }


    public void docFile(String tenFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(tenFile))) {
            soLuongKhachHang = Integer.parseInt(br.readLine());
            danhSachKhachHang = new KHACHHANG[soLuongKhachHang];
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
                KHACHHANG kh = danhSachKhachHang[i];
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
        
        dsKhachHang.ghiFile("danhsachkhachhang.text");
    }
}