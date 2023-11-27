/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOANOOP.CHITIETPHIEUNHAP;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import DOANOOP.KHACHHANG.KHACHHANG;
/**
 *
 * @author Admin
 */
public class HOADON {
    
    private NHANVIEN NHANVIEN;
    private KHACHHANG KHACHHANG;
    private Date ngayBan;
    private CHITIETHD sp; 
    private CHITIETHD[] hd;
    private int soLuongSP;
    public HOADON() {
        
    }
    public HOADON(NHANVIEN NHANVIEN, KHACHHANG KHACHHANG, Date ngayBan) {
        this.NHANVIEN = NHANVIEN;
        this.KHACHHANG = KHACHHANG;
        this.ngayBan = ngayBan;
        Scanner sc=new Scanner(System.in);
    }
    public double tongTien(){
        double tongTien = 0;
        for (CHITIETHD HD  : hd) {
            tongTien += HD.getTongTienSP();
        }
        return tongTien;
    }  
    

    public NHANVIEN getNHANVIEN() {
        return NHANVIEN;
    }

    public void setNHANVIEN(NHANVIEN NHANVIEN) {
        this.NHANVIEN = NHANVIEN;
    }

    public KHACHHANG getKHACHHANG() {
        return KHACHHANG;
    }

    public void setKHACHHANG(KHACHHANG KHACHHANG) {
        this.KHACHHANG = KHACHHANG;
    }
    
    public void setNgayBan(Date ngayBan){
        this.ngayBan=ngayBan;
    }
    public void displayNgayBan(){
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngay ban: "+dateFormat.format(ngayBan));
    }
    public HOADON(int maxSize){
        hd=new CHITIETHD[maxSize];
    }
    
    public void addSanPham(CHITIETHD HD) {
        hd[soLuongSP] = HD;
        soLuongSP++;
    }
    public void displayHoaDon() {
        System.out.println("Hóa đơn mua hàng:");
        System.out.println("------------------");
        System.out.println("Sản phẩm\t\tGiá\t\tSố lượng\t\tThành tiền");
        for (int i = 0; i < soLuongSP; i++) {
            CHITIETHD HD = hd[i];
            System.out.printf("%s\t\t%.2f\t\t%d\t\t\t%.2f%n", sp.getTenSP(), sp.getGiaBan(),
                    sp.getSoluong(), sp.getTongTienSP());
        }
        System.out.println("------------------");
        System.out.printf("Tổng cộng:\t\t\t\t\t\t%.2f%n", tongTien());
    
    }   
    public void input(){
        System.out.println("Nhap thong tin san pham: ");
        sp.input();
        }
}
 
