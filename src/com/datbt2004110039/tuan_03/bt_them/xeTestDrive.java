package com.datbt2004110039.tuan_03.bt_them;

import java.util.Scanner;

public class xeTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng xe: ");
        int n = sc.nextInt();
        sc.nextLine();
        xe thongtin[] = new xe[n];
        for (int i = 0; i < thongtin.length; i++) {
            System.out.println("====Xe " + (i + 1)+"====");
            System.out.print("Tên chủ xe: ");
            String tCX = sc.nextLine();
            System.out.print("Hãng sản xuất: ");
            String hSX = sc.nextLine();
            System.out.print("Dòng xe: ");
            String dX = sc.nextLine();
            System.out.print("Giấy phép xe: ");
            String gPX = sc.nextLine();
            System.out.print("Dung tích xăng: ");
            String dTX = sc.nextLine();
            thongtin[i] = new xe(tCX, hSX, dX, gPX, dTX);
        }
        System.out.println("------------Danh sách xe-----------");
        for (int i = 0; i < n; i++) {
            System.out.println("====Xe " + (i + 1)+"====");
            thongtin[i].inThongTin();
        }
        System.out.println("------------------------------------------");
        // Thêm xe
        xe thongTin1[] = new xe[n + 1];
        for (int i = 0; i < n; i++) {
            thongTin1[i] = thongtin[i];
        }
        System.out.println("====Xe " + (n + 1)+"====");
        System.out.print("Tên chủ xe: ");
        String tCX = sc.nextLine();
        System.out.print("Hãng sản xuất: ");
        String hSX = sc.nextLine();
        System.out.print("Dòng xe: ");
        String dX = sc.nextLine();
        System.out.print("Giấy phép xe: ");
        String gPX = sc.nextLine();
        System.out.print("Dung tích xăng: ");
        String dTX = sc.nextLine();
        thongTin1[n] = new xe(tCX, hSX, dX, gPX, dTX);
        System.out.println("-----------Danh sách xe sau khi thêm----------");
        for (int i = 0; i <= n; i++) {
            System.out.println("====Xe " + (i + 1)+"====");
            thongTin1[i].inThongTin();
        }
        System.out.println("-----------------------------------------------------");
        //Xóa xe
        System.out.println("Nhập  xe cần xóa: ");
        int xoa =sc.nextInt();
        xe thongTin2[] = new xe[n];
        int dem=0;
        for (int i = 0; i <= n; i++) {
            if(i==(xoa-1)){
                continue;
            }
            thongTin2[dem] = thongTin1[i];
            dem++;
        }
        System.out.println("-----------Danh sách máy tính sau khi xóa----------");
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if(temp == (xoa-1))
                temp+=1;
            System.out.println("====Xe " + (temp + 1)+"====");
            thongTin2[i].inThongTin();
            temp++;
        }
        System.out.println("-----------------------------------------------------");
    }
}
