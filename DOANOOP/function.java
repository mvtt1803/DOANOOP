package DOANOOP;

import java.util.Scanner;

public interface function {
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

	void hienThiDanhSach();

    void capNhat();

	void timKiem();

	void Sua();

    void Xoa();

	void Them();
}
