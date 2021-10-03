package com.datbt2004110039.tuan_03.bt_them;

import java.util.Scanner;

public class taikhoanTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng tài khoản: ");
        int n = sc.nextInt();
        sc.nextLine();
        taikhoan thongtin[] = new taikhoan[n];
        for (int i = 0; i < thongtin.length; i++) {
            System.out.println("====Tài khoản " + (i + 1)+"====");
            System.out.print("Tên chủ tài khoản: ");
            String tCTK = sc.nextLine();
            System.out.print("Số tài khoản: ");
            int sTK = sc.nextInt();
            System.out.print("Số dư: ");
            int sD = sc.nextInt();
            sc.nextLine();
            thongtin[i] = new taikhoan(tCTK, sTK, sD);
        }
        System.out.println("------------Danh sách tài khoản-----------");
        for (int i = 0; i < n; i++) {
            System.out.println("====Tài khoản " + (i + 1)+"====");
            thongtin[i].inThongTin();
        }
        System.out.println("------------------------------------------");
        // Thêm tài khoản
        taikhoan thongTin1[] = new taikhoan[n + 1];
        for (int i = 0; i < n; i++) {
            thongTin1[i] = thongtin[i];
        }
        System.out.println("====Tài khoản " + (n + 1)+"====");
        System.out.print("Tên chủ tài khoản: ");
        String tCTK = sc.nextLine();
        System.out.print("Số tài khoản: ");
        int sTK = sc.nextInt();
        System.out.print("Số dư: ");
        int sD = sc.nextInt();
        sc.nextLine();
        thongTin1[n] = new taikhoan(tCTK, sTK, sD);
        System.out.println("-----------Danh sách tài khoản sau khi thêm----------");
        for (int i = 0; i <= n; i++) {
            System.out.println("====Tài khoản " + (i + 1)+"====");
            thongTin1[i].inThongTin();
        }
        System.out.println("-----------------------------------------------------");
        //Xóa tài khoản
        System.out.println("Nhập  tài khoản cần xóa: ");
        int xoa =sc.nextInt();
        taikhoan thongTin2[] = new taikhoan[n];
        int dem=0;
        for (int i = 0; i <= n; i++) {
            if(i==(xoa-1)){
                continue;
            }
            thongTin2[dem] = thongTin1[i];
            dem++;
        }
        System.out.println("-----------Danh sách tài khoản sau khi xóa----------");
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if(temp == (xoa-1))
                temp+=1;
            System.out.println("====Tài khoản " + (temp + 1)+"====");
            thongTin2[i].inThongTin();
            temp++;
        }
        System.out.println("-----------------------------------------------------");  
    }
}
