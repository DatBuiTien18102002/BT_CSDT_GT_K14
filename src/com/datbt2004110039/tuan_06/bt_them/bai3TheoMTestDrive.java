package com.datbt2004110039.tuan_06.bt_them;
import java.util.Scanner;

public class bai3TheoMTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm: ");
        int  n = sc.nextInt();
        int  newsL =n;
        HamTheoM listSanPham = new HamTheoM(n);
        listSanPham.nhapDSSP();
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
                System.out.print("Nhập số lượng sản phẩm: ");
                n = sc.nextInt();
                newsL = n ;
                listSanPham = new HamTheoM(n);
                listSanPham.nhapDSSP();
                break;
            case 2:
                listSanPham.sapXepGiamDan();
                break;

            case 3:
                newsL--;
                sc.nextLine();
                System.out.print("Nhập tên sản phẩn cần xóa: ");
                String tenXoa = sc.nextLine();
                listSanPham.xoaTheoTen(tenXoa,newsL);
                break;

            case 4:
                listSanPham.giaTB(newsL);
                break;
            }

        } while (luaChon != 5);
    }
}
