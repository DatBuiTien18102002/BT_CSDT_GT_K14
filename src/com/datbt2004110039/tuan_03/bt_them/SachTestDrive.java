package com.datbt2004110039.tuan_03.bt_them;

import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sách: ");
        int n = sc.nextInt();
        sc.nextLine();
        Sach thongtin[] = new Sach[n];
        for (int i = 0; i < thongtin.length; i++) {
            System.out.println("====Quyển  " + (i + 1)+"====");
            System.out.print("Giá: ");
            int g = sc.nextInt();
            System.out.print("Nhà xuất bản: ");
            String nhaXB = sc.nextLine();
            System.out.print("Năm xuất bản: ");
            int namXB = sc.nextInt();
            System.out.print("Giá bán: ");
            int gB = sc.nextInt();
            System.out.print("Số lượng: ");
            int sL = sc.nextInt();
            System.out.print("Loại: ");
            String l = sc.nextLine();
            thongtin[i] = new Sach(g, nhaXB, namXB, gB, sL, l);
        }
        System.out.println("------------Danh sách quyển sách-----------");
        for (int i = 0; i < n; i++) {
            System.out.println("====Quyển " + (i + 1)+"====");
            thongtin[i].inThongTin();
        }
        System.out.println("------------------------------------------");
        // Thêm sách
        Sach thongTin1[] = new Sach[n + 1];
        for (int i = 0; i < n; i++) {
            thongTin1[i] = thongtin[i];
        }
        System.out.println("====Quyển " + (n + 1)+"====");
        System.out.print("Giá: ");
        int g = sc.nextInt();
        System.out.print("Nhà xuất bản: ");
        String nhaXB = sc.nextLine();
        System.out.print("Năm xuất bản: ");
        int namXB = sc.nextInt();
        System.out.print("Giá bán: ");
        int gB = sc.nextInt();
        System.out.print("Số lượng: ");
        int sL = sc.nextInt();
        System.out.print("Loại: ");
        String l = sc.nextLine();
        thongTin1[n] = new Sach(g, nhaXB, namXB, gB, sL, l);
        System.out.println("-----------Danh sách cuốn sách sau khi thêm----------");
        for (int i = 0; i <= n; i++) {
            System.out.println("====Quyển " + (i + 1)+"====");
            thongTin1[i].inThongTin();
        }
        System.out.println("-----------------------------------------------------");
        //Xóa sách
        System.out.println("Nhập  quyển sách cần xóa: ");
        int xoa =sc.nextInt();
        Sach thongTin2[] = new Sach[n];
        int dem=0;
        for (int i = 0; i <= n; i++) {
            if(i==(xoa-1)){
                continue;
            }
            thongTin2[dem] = thongTin1[i];
            dem++;
        }
        System.out.println("-----------Danh sách quyển sách sau khi xóa----------");
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if(temp == (xoa-1))
                temp+=1;
            System.out.println("====Quyển " + (temp + 1)+"====");
            thongTin2[i].inThongTin();
            temp++;
        }
        System.out.println("-----------------------------------------------------");
    }
}
