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
public class PHIEUNHAP {
    private NCC nhaCungcap;
    private String maPN;
    private NHANVIEN NHANVIEN;
    private CHITIETPN chiTietPN;

    public PHIEUNHAP() {
    }

    public PHIEUNHAP(NCC nhaCungcap, String maPN, NHANVIEN NHANVIEN, CHITIETPN chiTietPN) {
        this.nhaCungcap = nhaCungcap;
        this.maPN = maPN;
        this.NHANVIEN = NHANVIEN;
        this.chiTietPN = chiTietPN;
    }

    public NCC getNhaCungcap() {
        return nhaCungcap;
    }

    public void setNhaCungcap(NCC nhaCungcap) {
        this.nhaCungcap = nhaCungcap;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public NHANVIEN getNHANVIEN() {
        return NHANVIEN;
    }

    public void setNHANVIEN(NHANVIEN NHANVIEN) {
        this.NHANVIEN = NHANVIEN;
    }

    public CHITIETPN getChiTietPN() {
        return chiTietPN;
    }

    public void setChiTietPN(CHITIETPN chiTietPN) {
        this.chiTietPN = chiTietPN;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap thong tin san pham: ");
        chiTietPN.input();
        System.out.println("Nhap maPN");
        maPN=sc.nextLine();
    }
    public void output(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "PHIEUNHAP{" + "nhaCungcap=" + nhaCungcap + ", maPN=" + maPN + ", NHANVIEN=" + NHANVIEN + ", chiTietPN=" + chiTietPN + '}';
    }    
}
