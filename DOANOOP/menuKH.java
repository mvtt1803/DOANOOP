package DOANOOP;

import java.util.Scanner;

public class menuKH {
    private list dsKhachHang;
    private Scanner scanner;

    public menuKH() {
        dsKhachHang = new list();
        scanner = new Scanner(System.in);
    }

    public void run() {
        dsKhachHang.docFile("output.txt");

        int luaChon;
        do {
            hienThiMenu();
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    dsKhachHang.Them();
                    break;
                case 2:
                    dsKhachHang.Xoa();
                    break;
                case 3:
                    dsKhachHang.Sua();
                    break;
                case 4:
                    System.out.println("Danh sach khach hang:");
                    dsKhachHang.hienThiDanhSach();
                    break;
                case 5:
                    dsKhachHang.timKiem();
                    break;
                case 6:
                    dsKhachHang.ghiFile("output.txt");
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
        System.out.println("1. Them khach hang");
        System.out.println("2. Xoa khach hang");
        System.out.println("3. Sua thong tin khach hang");
        System.out.println("4. Hien thi danh sach khach hang");
        System.out.println("5. Tim kiem khach hang");
        System.out.println("6. Ghi vao file");
        System.out.println("0. Thoat");
    }
}
