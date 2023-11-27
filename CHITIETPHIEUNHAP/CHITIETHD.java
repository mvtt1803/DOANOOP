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
public class CHITIETHD {
    private String maHD;
    private int soluong;
    private SANPHAM sp;
    Scanner sc =new Scanner(System.in);
    public CHITIETHD() {
    }

    public CHITIETHD(String maHD, int soluong, SANPHAM sp) {
        this.maHD = maHD;
        this.soluong = soluong;
        this.sp = sp;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public SANPHAM getSp() {
        return sp;
    }
    
    public void setSp(SANPHAM sp) {
        this.sp = sp;
    }
    public double getGiaBan(){
        return sp.getGiaBan();
    }
    public double getTongTienSP(){
        return (sp.getGiaBan())*soluong;
    }
    public String getTenSP(){
        return sp.getTenSP();
    }
    public void input(){
        System.out.println("Nhap ten san pham: ");
        sp.input();
        System.out.println("Nhap so luong: ");
        soluong=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ma doa don:");
        maHD=sc.nextLine();
    }
}
