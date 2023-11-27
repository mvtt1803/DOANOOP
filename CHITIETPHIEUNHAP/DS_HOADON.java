/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOANOOP.CHITIETPHIEUNHAP;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Admin
 */
public class DS_HOADON implements CHUCNANG, DOCGHIFILE {

    private static int soluong;
    private static HOADON[] ListHD;
    Scanner sc = new Scanner(System.in);

    public DS_HOADON() {
    }

    public static int getSoluong() {
        return soluong;
    }

    public static HOADON[] getListHD() {
        return ListHD;
    }
    
@Override
    public void DocFile(String tenFile) {
       try (BufferedReader br = new BufferedReader(new FileReader(tenFile))) {
            soluong = Integer.parseInt(br.readLine());
            ListHD = new HOADON[soluong];
            System.out.println("Đọc file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
        }
    
@Override
    public void GhiFile (String tenFile){
try (BufferedWriter bw = new BufferedWriter(new FileWriter(tenFile))) {
            bw.write(Integer.toString(soluong));
            bw.newLine();
            for (int i = 0; i < soluong; i++) {
                HOADON hd = ListHD[i];
                if (hd != null) { 
                    bw.write(hd.toString());
                    bw.newLine();
                }
            }
            System.out.println("Ghi file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
    
        public void inputDS(){
        System.out.println("Nhap so luong hoa don: ");
        soluong=Integer.parseInt(sc.nextLine());
        ListHD=new HOADON[soluong];
        for(int i=1;i<=soluong;i++){
            System.out.println("Nhap thong tin hoa don thu "+ i);
            ListHD[i] =new HOADON();
            ListHD[i].input();
        }
    }
    

    @Override
    public void Them() {
        HOADON hd = null;
        if(soluong==ListHD.length){
            ListHD = java.util.Arrays.copyOf(ListHD, ListHD.length +1);
        }
        if (soluong < ListHD.length) {
            hd.input();
            ListHD[soluong] = hd;
            soluong++;
            System.out.println("Da them hoa don.");
        } 
    }

    @Override
    public void Xoa() {
        System.out.println("Nhap vao ma hoa don can xoa: ");
        int index=Integer.parseInt(sc.nextLine());
        if (index >= 0 && index < soluong) {
            for (int i = index; i < soluong - 1; i++) {
                ListHD[i] = ListHD[i + 1];
            }
            soluong--;
            System.out.println("Hoa don da duoc xoa.");
        } else {
            System.out.println("ma khong hop le.");
        }
    }

    @Override
    public void Sua() {
        System.out.println("Nhap vao ma hoa don can sua: ");
        int index=Integer.parseInt(sc.nextLine());
        if (index >= 0 && index < soluong) {
            ListHD[index].input();
            System.out.println("Hoa don da duoc cap nhat.");
        } else {
            System.out.println("ma khong hop le.");
        }
    }

    

    @Override
    public void hienThiDanhSach() {
        for(int i=1;i<=ListHD.length;i++){
            System.out.println("Thong tin hoa don "+i+":");
            ListHD[i].displayHoaDon();
            System.out.println();
        }
    }
    
    public static void main(String[] args){
         DS_HOADON ds =new DS_HOADON();
         
        Scanner scanner =new Scanner(System.in);        
        int choice;
        
        do {
            System.out.println("===  ===");
            System.out.println("1. them");
            System.out.println("2. xoa");
            System.out.println("3. sua");
            System.out.println("4. hien thi danh sach");
            System.out.println("0. thoat");
            
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    scanner.nextLine(); 
                    ds.Them();
                    break;
                case 2:
                    scanner.nextLine(); 
                    ds.Xoa();
                    break;
                case 3:                    
                    scanner.nextLine(); 
                    ds.Sua();
                    break;
                case 4:
                    ds.hienThiDanhSach();
                    break;
                case 0:
                    System.out.println("da thoat.");
                    break;
                default:
                    System.out.println("khong hop le vui long nhap lai.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
        ds.DocFile("danhsachhoadon.txt");

        ds.GhiFile("dachsachhoadon.txt");
    }
    
         
}
        
            
        
