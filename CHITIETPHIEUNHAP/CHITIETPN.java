/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOANOOP.CHITIETPHIEUNHAP;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CHITIETPN {
    private SANPHAM sanPham;
    private int soluongNhap;
    private String donNhap;
    Scanner sc=new Scanner(System.in);
    public CHITIETPN() {
    }

    public CHITIETPN(SANPHAM sanPham, int soluongNhap, String donNhap) {
        this.sanPham = sanPham;
        this.soluongNhap = soluongNhap;
        this.donNhap = donNhap;
    }

    public SANPHAM getSanPham() {
        return sanPham;
    }

    public void setSanPham(SANPHAM sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoluongNhap() {
        return soluongNhap;
    }

    public void setSoluongNhap(int soluongNhap) {
        this.soluongNhap = soluongNhap;
    }

    public String getDonNhap() {
        return donNhap;
    }

    public void setDonNhap(String donNhap) {
        this.donNhap = donNhap;
    }
    public void input(){
        System.out.println("Nhap thong tin san pham: ");
        sanPham.input();
        System.out.println("Nhap so luong can nhap ");
        soluongNhap=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap don Nhap");
        donNhap=sc.nextLine();
    }
    @Override
    public String toString() {
        return "CHITIETPN{" + "sanPham=" + sanPham + ", soluongNhap=" + soluongNhap + ", donNhap=" + donNhap + '}';
    }
}
