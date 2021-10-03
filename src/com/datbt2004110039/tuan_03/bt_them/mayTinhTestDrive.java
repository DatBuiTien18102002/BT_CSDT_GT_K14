package com.datbt2004110039.tuan_03.bt_them;

import java.util.Scanner;


public class mayTinhTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng máy tính: ");
        int n = sc.nextInt();
        sc.nextLine();
        mayTinh thongtin[] = new mayTinh[n];
        for (int i = 0; i < thongtin.length; i++) {
            System.out.println("====Máy " + (i + 1)+"====");
            System.out.print("Nhà sản xuất: ");
            String nSX = sc.nextLine();
            System.out.print("Hệ điều hành: ");
            String hDH = sc.nextLine();
            System.out.print("Ram: ");
            String r = sc.nextLine();
            System.out.print("CPU: ");
            String cpu = sc.nextLine();
            System.out.print("Giá: ");
            int g = sc.nextInt();
            System.out.print("Năm bảo hành: ");
            int nBH = sc.nextInt();
            sc.nextLine();
            thongtin[i] = new mayTinh(nSX, hDH, r, cpu, g, nBH);
        }
        System.out.println("------------Danh sách máy tính-----------");
        for (int i = 0; i < n; i++) {
            System.out.println("====Máy " + (i + 1)+"====");
            thongtin[i].inThongTin();
        }
        System.out.println("------------------------------------------");
        // Thêm máy tính
        mayTinh thongTin1[] = new mayTinh[n + 1];
        for (int i = 0; i < n; i++) {
            thongTin1[i] = thongtin[i];
        }
        System.out.println("====Máy " + (n + 1)+"====");
        System.out.print("Nhà sản xuất: ");
        String nSX = sc.nextLine();
        System.out.print("Hệ điều hành: ");
        String hDH = sc.nextLine();
        System.out.print("Ram: ");
        String r = sc.nextLine();
        System.out.print("CPU: ");
        String cpu = sc.nextLine();
        System.out.print("Giá: ");
        int g = sc.nextInt();
        System.out.print("Năm bảo hành: ");
        int nBH = sc.nextInt();
        thongTin1[n] = new mayTinh(nSX, hDH, r, cpu, g, nBH);
        System.out.println("-----------Danh sách máy tính sau khi thêm----------");
        for (int i = 0; i <= n; i++) {
            System.out.println("====Máy " + (i + 1)+"====");
            thongTin1[i].inThongTin();
        }
        System.out.println("-----------------------------------------------------");
        //Xóa máy tính
        System.out.println("Nhập  máy cần xóa: ");
        int xoa =sc.nextInt();
        mayTinh thongTin2[] = new mayTinh[n];
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
            System.out.println("====Máy " + (temp + 1)+"====");
            thongTin2[i].inThongTin();
            temp++;
        }
        System.out.println("-----------------------------------------------------");
    }
}
