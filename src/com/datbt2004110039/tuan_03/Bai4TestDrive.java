package com.datbt2004110039.tuan_03;

import java.util.Scanner;

import tuan_02.SinhVien;

public class Bai4TestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên : ");
        int sL = sc.nextInt();
        HamBai4 sinhVien = new HamBai4(sL);

        sinhVien.nhapSV();
        System.out.println("Danh sách sinh viên 1");
        sinhVien.xuatDSSV();
        sinhVien.sapXepDS();

    }

}
