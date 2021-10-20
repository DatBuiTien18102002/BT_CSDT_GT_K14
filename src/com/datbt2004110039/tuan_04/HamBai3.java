package com.datbt2004110039.tuan_04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
public class HamBai3 {
    ArrayList<Bai3> sanPham;
    void nhapDS(){
        sanPham = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
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
    }
    void xuatDSSV(){
        System.out.println("============Danh sách sản phẩm==========");
        for (int i = 0; i < sanPham.size(); i++) {
            Bai3 sp = (Bai3) sanPham.get(i);
            sp.inThongTin();
        }
    }
    void sapXepDS(){
        Comparator<Bai3> comp = new Comparator<Bai3>() {

            @Override
            public int compare(Bai3 o1, Bai3 o2) {
                return Integer.compare(o2.gia, o1.gia);
            }

        };
        Collections.sort(sanPham, comp);
    }
    void xoaSP(String tenXoa){
        for (int i = 0; i < sanPham.size(); i++) {
            Bai3 sp = (Bai3) sanPham.get(i);
            if (tenXoa.equals(sp.ten))
                sanPham.remove(i);
        }
    }
    int xuatGiaTB(){
        int s = 0;
        int giaTB = 0;
        for (int i = 0; i < sanPham.size(); i++) {
            Bai3 sp = (Bai3) sanPham.get(i);
            s += sp.gia;

        }

        return  giaTB =  s / sanPham.size();
    }

}
