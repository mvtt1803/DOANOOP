package DOANOOP.NHANVIEN;

import java.util.Scanner;

public class Menu {
    private DS_NHANVIEN dsNhanVien;
    private Scanner scanner;

    public Menu() {
        dsNhanVien = new DS_NHANVIEN();
        scanner = new Scanner(System.in);
    }

    public void run() {
        dsNhanVien.docFile("output.txt");

        int luaChon;
        do {
            hienThiMenu();
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    dsNhanVien.Them();
                    break;
                case 2:
                    dsNhanVien.Xoa();
                    break;
                case 3:
                    dsNhanVien.Sua();
                    break;
                case 4:
                    System.out.println("Danh sach nhan vien:");
                    dsNhanVien.hienThiDanhSach();
                    break;
                case 5:
                    dsNhanVien.timKiem();
                    break;
                case 6:
                    dsNhanVien.ghiFile("output.txt");
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
            }
        } while (luaChon != 0);
    }

    private void hienThiMenu() {
        System.out.println("------ MENU ------");
        System.out.println("1. Them nhan vien");
        System.out.println("2. Xoa nhan vien");
        System.out.println("3. Sua thong tin nhan vien");
        System.out.println("4. Hien thi danh sach nhan vien");
        System.out.println("5. Tim kiem nhan vien");
        System.out.println("6. Ghi vao file");
        System.out.println("0. Thoat");
    }
}

