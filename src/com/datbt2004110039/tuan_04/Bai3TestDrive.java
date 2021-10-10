package com.datbt2004110039.tuan_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3TestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bai3> sanPham = new ArrayList<>();
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
                    sc.nextLine();
                    sanPham.clear();
                    while (true) {

                        System.out.print("Nhập tên sản phẩm:");
                        String ten = sc.nextLine();
                        System.out.print("Nhập giá sản phẩm:");
                        int gia = sc.nextInt();
                        sc.nextLine();
                        sanPham.add(new Bai3(ten, gia));
                        System.out.println("Nhập thêm ?(Y/N)");
                        String temp = sc.nextLine();
                        if (temp.equals("N"))
                            break;
                    }
                    break;
                case 2:
                    Comparator<Bai3> comp = new Comparator<Bai3>() {

                        @Override
                        public int compare(Bai3 o1, Bai3 o2) {
                            return Integer.compare(o2.gia, o1.gia);
                        }

                    };
                    Collections.sort(sanPham, comp);
                    System.out.println("============Danh sách sản phẩm==========");
                    for (int i = 0; i < sanPham.size(); i++) {
                        Bai3 sp = (Bai3) sanPham.get(i);
                        System.out.println("Tên sản phẩm:" + sp.ten);
                        System.out.println("Giá sản phẩm:" + sp.gia);
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Nhập tên sản phẩm cần xóa:");
                    String tenXoa = sc.nextLine();
                    for (int i = 0; i < sanPham.size(); i++) {
                        Bai3 sp = (Bai3) sanPham.get(i);
                        if (tenXoa.equals(sp.ten))
                            sanPham.remove(i);
                    }
                    break;
                case 4:
                    int s = 0;
                    for (int i = 0; i < sanPham.size(); i++) {
                        Bai3 sp = (Bai3) sanPham.get(i);
                        s += sp.gia;

                    }
                    int giaTB =  s / sanPham.size();
                    System.out.println("Giá trung bình của các sản phẩm là:" + giaTB);
                    break;
            }

        } while (luaChon != 6);
    }
}
