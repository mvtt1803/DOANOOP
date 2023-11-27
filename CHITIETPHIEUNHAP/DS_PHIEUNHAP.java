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
public class DS_PHIEUNHAP implements CHUCNANG, DOCGHIFILE{
    private static int soluong;
    private static PHIEUNHAP[] ListPN =new PHIEUNHAP[300];
    private PHIEUNHAP pn;
    Scanner sc =new Scanner(System.in);
    
    public DS_PHIEUNHAP() {
    }
    
    public static int getSoluong() {
        return soluong;
    }

    public static PHIEUNHAP[] getListPN() {
        return ListPN;
    }
    
    public void inputDS(){
        System.out.println("Nhap so luong phieu nhap: ");
        soluong=Integer.parseInt(sc.nextLine());
        ListPN=new PHIEUNHAP[soluong];
        for(int i=1;i<=soluong;i++){
            System.out.println("Nhap thong tin phieu nhap thu "+ i);
            ListPN[i] =new PHIEUNHAP();
            ListPN[i].input();
        }
    }
    public void outputDS(){
        for(int i=1;i<=ListPN.length;i++){
            System.out.println("Thong tin phieu nhap thu "+i+":");
            ListPN[i].output();
            System.out.println();
        }
    }  
    @Override
    public void DocFile(String tenFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(tenFile))) {
            soluong = Integer.parseInt(br.readLine());
            ListPN = new PHIEUNHAP[soluong];
            System.out.println("Đọc file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    @Override
    public void GhiFile(String tenFile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(tenFile))) {
            bw.write(Integer.toString(soluong));
            bw.newLine();
            for (int i = 0; i < soluong; i++) {
                PHIEUNHAP pn = ListPN[i];
                if (pn != null) {  
                    bw.write(pn.toString());
                    bw.newLine();
                }
            }
            System.out.println("Ghi file thành công.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
     

    @Override
    public void hienThiDanhSach() {
        for(int i=1;i<=ListPN.length;i++){
            System.out.println("Thong tin phieu nhap thu "+i+":");
            ListPN[i].output();
            System.out.println();
        }
    }


    @Override
    public void Sua() {
        System.out.println("Nhap vao ma phieu nhap can sua: ");
        int index=Integer.parseInt(sc.nextLine());
        if (index >= 0 && index < soluong) {
            ListPN[index].input();
            System.out.println("Phieu da duoc cap nhat.");
        } else {
            System.out.println("ma khong hop le.");
        }
    }

    @Override
    public void Xoa() {
        System.out.println("Nhap vao ma phieu nhap can xoa: ");
        int index=Integer.parseInt(sc.nextLine());
        if (index >= 0 && index < soluong) {
            for (int i = index; i < soluong - 1; i++) {
                ListPN[i] = ListPN[i + 1];
            }
            soluong--;
            System.out.println("Phieu da da duoc xoa.");
        } else {
            System.out.println("ma khong hop le.");
        }
    }

    @Override
    public void Them() {
        PHIEUNHAP pn = null;
        if(soluong==ListPN.length){
            ListPN = java.util.Arrays.copyOf(ListPN, ListPN.length +1);
        }
        if (soluong < ListPN.length) {
            pn.input();
            ListPN[soluong] = pn;
            soluong++;
            System.out.println("San pham da duoc them vao phieu nhap.");
        } 
    }
    public void menu(){
        
    }
    public static void main(String[] args){
        DS_PHIEUNHAP ds =new DS_PHIEUNHAP();
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
        ds.DocFile("danhsachphieunhap.txt");
        ds.GhiFile("dachsachphieunhap.txt");
    }
    
}
