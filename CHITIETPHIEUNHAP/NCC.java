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
public class NCC {
    private String tenNCC, SDT, eMail, diaChi, maNCC;

    public NCC() {
    }

    public NCC(String tenNCC, String SDT, String eMail, String diaChi, String maNCC) {
        this.tenNCC = tenNCC;
        this.SDT = SDT;
        this.eMail = eMail;
        this.diaChi = diaChi;
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten NCC: ");
        tenNCC=sc.nextLine();
        System.out.println("Nhap SDT: ");
        SDT=sc.nextLine();
        System.out.println("Nhap eMail: ");
        eMail=sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi=sc.nextLine();
        System.out.println("Nhap ma NCC: ");
        maNCC=sc.nextLine();
    }
    @Override
    public String toString() {
        return "PHIEUNHAP{" + "tenNCC=" + tenNCC + ", SDT=" + SDT + ", eMail=" + eMail + ", diaChi=" + diaChi + ", maNCC=" + maNCC + '}';
    }
}
