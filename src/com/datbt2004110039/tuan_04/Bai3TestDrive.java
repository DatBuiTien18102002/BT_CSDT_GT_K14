package com.datbt2004110039.tuan_04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3TestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HamBai3 sanPham = new HamBai3();
        int luaChon;
        do {
            System.out.println("=====================Menu================");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Kết thúc");
            System.out.println("=========================================");
            System.out.print("Lựa chọn :");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    sanPham.nhapDS();
                    break;
                case 2:
                    sanPham.sapXepDS();
                    sanPham.xuatDSSV();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Nhập tên sản phẩm cần xóa:");
                    String tenXoa = sc.nextLine();
                    sanPham.xoaSP(tenXoa);
                    break;
                case 4:

                    System.out.println("Giá trung bình của các sản phẩm là:" + sanPham.xuatGiaTB());
                    break;
            }

        } while (luaChon != 6);
    }
}
