/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOANOOP.CHITIETPHIEUNHAP;

import java.util.Scanner;

public class SANPHAM {
    private String NSX;
    private String tenSP;
    private double giaBan;
    private double giaNhap;
    Scanner sc= new Scanner (System.in);

    public SANPHAM(String NSX, double giaBan, double giaNhap, String tenSP) {
        this( NSX, tenSP, giaBan, giaNhap);
    }

    public SANPHAM( String NSX, String tenSP, double giaBan, double giaNhap) {
    
        this.NSX = NSX;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
    
    }

    public SANPHAM() {
        
    }

    public String getNSX() {
        return NSX;
    }
    public void setNSX(String NSX) {
        while(NSX.length() < 2 || NSX.length() > 30 ){
         System.out.println("Nhap lai Nha san Xuat");
         NSX=sc.nextLine();
        }
        this.NSX = NSX;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        while(tenSP.length() < 2 || tenSP.length() > 30 ){
         System.out.println("Nhap lai Ten San Pham");
         tenSP=sc.nextLine();
        }
        this.tenSP = tenSP;
    }
     public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double Gia) {
        while( giaBan<0 || giaBan>1000000000){
            System.out.println("Nhap lai gia Ban cua San Pham");
            giaBan=sc.nextDouble();
        }
        this.giaBan = giaBan;
    }
    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double Gia) {
        while( giaNhap<0 || giaNhap>1000000000){
            System.out.println("Nhap lai gia Nhap cua San Pham");
            giaNhap=sc.nextDouble();
        }
        this.giaNhap = giaNhap;
    }


    public void input(){
            System.out.println("Nhap NSX: ");
            this.NSX = this.sc.nextLine();
            System.out.println("Nhap ten San Pham: ");
            this.tenSP = this.sc.nextLine();
            System.out.println("Nhap gia Ban: ");
            this.giaBan = this.sc.nextDouble();
            System.out.println("Nhap gia Nhap: ");
            this.giaNhap = this.sc.nextDouble();
          
        
    
}
    public void output() {
       System.out.format("| %20s | %10s | %13s | %13s |\n", this.tenSP,
				this.NSX, this.giaBan, this.giaNhap);
   }
 
    @Override
   public String toString() {
      return  this.getTenSP() + "," + this.getNSX() + "," + this.getGiaBan() + "," + this.getGiaNhap() ;
   } 
   

   
}

