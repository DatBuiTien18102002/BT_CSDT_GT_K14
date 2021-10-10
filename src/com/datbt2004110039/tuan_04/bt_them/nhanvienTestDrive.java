package com.datbt2004110039.tuan_04.bt_them;

import java.util.Scanner;

public class nhanvienTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        nhanvien thongTin[] = new nhanvien[n];
        for (int i = 0; i < thongTin.length; i++) {
            System.out.println("====Nhân viên " + (i + 1)+"====");
            System.out.print("Tên nhân viên: ");
            String tNV = sc.nextLine();
            System.out.print("Lương: ");
            String L = sc.nextLine();
            System.out.print("Địa chỉ: ");
            String dC = sc.nextLine();
            System.out.print("Bộ phận làm việc: ");
            String bPLV = sc.nextLine();
            System.out.print("Ngày sinh: ");
            String nS = sc.nextLine();
            thongTin[i] = new nhanvien(tNV, L, dC, bPLV, nS);
        }
        System.out.println("------------Danh sách nhân viên-----------");
        for (int i = 0; i < n; i++) {
            System.out.println("====Nhân viên " + (i + 1)+"====");
            thongTin[i].inThongTin();
        }
        System.out.println("------------------------------------------");
        // Thêm nhân viên
        nhanvien thongTin1[] = new nhanvien[n + 1];
        for (int i = 0; i < n; i++) {
            thongTin1[i] = thongTin[i];
        }
        System.out.println("====Nhân viên " + (n + 1)+"====");
        System.out.print("Tên nhân viên: ");
        String tNV = sc.nextLine();
        System.out.print("Lương: ");
        String L = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String dC = sc.nextLine();
        System.out.print("Bộ phận làm việc: ");
        String bPLV = sc.nextLine();
        System.out.print("Ngày sinh: ");
        String nS = sc.nextLine();
        thongTin1[n] = new nhanvien(tNV, L, dC, bPLV, nS);
        System.out.println("-----------Danh sách nhân viên sau khi thêm----------");
        for (int i = 0; i <= n; i++) {
            System.out.println("====Nhân viên " + (i + 1)+"====");
            thongTin1[i].inThongTin();
        }
        System.out.println("-----------------------------------------------------");
        //Xóa nhân viên
        System.out.println("Nhập  nhân viên cần xóa: ");
        int xoa =sc.nextInt();
        nhanvien thongTin2[] = new nhanvien[n];
        int dem=0;
        for (int i = 0; i <= n; i++) {
            if(i==(xoa-1)){
                continue;
            }
            thongTin2[dem] = thongTin1[i];
            dem++;
        }
        System.out.println("-----------Danh sách nhân viên sau khi xóa----------");
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if(temp == (xoa-1))
                temp+=1;
            System.out.println("====Nhân viên " + (temp + 1)+"====");
            thongTin2[i].inThongTin();
            temp++;
        }
        System.out.println("-----------------------------------------------------");
    }
}
