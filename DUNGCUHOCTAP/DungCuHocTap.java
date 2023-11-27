package DOANOOP.DUNGCUHOCTAP;

import java.util.Scanner;

public class DungCuHocTap extends SanPham {
    private String chucNang;
    private String maDungCu;
    private String loai;
    private String tenSP;
    private int soluongtonkho;
    private int dongia;
    Scanner sc= new Scanner (System.in);
    public DungCuHocTap(String NSX, String tenSP, double giaBan, double giaNhap, int soLuong, String chucNang,
            String maDungCu) {
        super(NSX, tenSP, giaBan, giaNhap, soLuong);
        this.chucNang = chucNang;
        this.maDungCu = maDungCu;
    }
    public DungCuHocTap(String maDungCu, String tenSP, int string, int d, String loai) {
        this.maDungCu = maDungCu;
        this.tenSP=tenSP;
        this.soluongtonkho = string;
        this.dongia = d;
        this.loai=loai;
    }
    public DungCuHocTap(String maDungCu, String tenSP, String string, int giaBan, int i, String j) {
        super(tenSP, string, giaBan, i);
        this.maDungCu = maDungCu;
        this.loai = j;
    }
    DungCuHocTap(SanPham sp, String string, int parseInt, String par1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public DungCuHocTap(String sanPham, String maDungCu2, String nsx, double giaBan, String tenSP2) {
    }
    public DungCuHocTap(String string, String string2, String string3, int i, int j, int k) {
    }
    public DungCuHocTap(Object nSX, int i, int giaBan, int giaNhap, Object object, Object chucNang2, Object maDungCu2) {
    }
    public void setSoLuongTonKho(int soluongtonkho) {
        this.soluongtonkho = soluongtonkho;
    }

    public void setDonGia(int dongia) {
        this.dongia = dongia;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getChucNang() {
        return chucNang;
    }
    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }
    
    public String getMaDungCu() {
        return maDungCu;
    }
    public void setMaDungCu(String maDungCu) {
        this.maDungCu = maDungCu;
    }
    public void input(){
        super.input();
        System.out.println("Nhap chuc nang:");
        chucNang = sc.nextLine();
        System.out.println("Nhap ma dung cu");
        maDungCu = sc.nextLine();
        boolean c = true;
        while (c == true) {
                System.out.println("Chon loai dung cu:");
                System.out.println("  1. Thuoc");
                System.out.println("  2. Viet");
                System.out.println("  3. Gom");
                System.out.println("Moi ban chon: ");
                int chon = sc.nextInt();
                switch (chon) {
                case 1: {
                    
                    System.out.println("Thuoc");
                    c = false;
                    
                    break;
                }
                case 2: {
                    
                    System.out.println("Viet");
                    c = false;
                    break;
                }
                case 3: {
                    
                    System.out.println("Gom");
                    c = false;
                    break;
                }
                default:{
                    System.out.println("Lua chon khong dung yeu cau ! Vui long chon lai");
                }
            }
        }
        }
        @Override
        public void output () {
                System.out.format("| %6s | %20s | %10s | %13s | %20s | %12s | %12s |%12s |\n", this.getNSX(),
                    this.getTenSP(), this.getGiaBan(), this.getGiaNhap(),this.getSoLuong(),this.getChucNang(),this.getMaDungCu());
        }
        @Override
         public String toString() {
        return "DungCuHocTap [chucNang=" + chucNang + ", maDungCu=" + maDungCu + ", sc=" + sc + "]";
    }
        public String getSanPham() {
            return null;
        }
    }

