package com.datbt2004110039.tuan_03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;

public class HamBai4 {
    int sL;

    Bai4 sinhVien[];

    HamBai4(int soLuong) {
        sL = soLuong;
    }

    public  String xetHocLuc(float diem) {
        if (diem >= 9) {
            return "Xuất sắc";
        } else if (diem >= 7.5) {
            return "Giỏi";
        } else if (diem >= 6.5) {
            return "Khá";
        } else if (diem >= 5) {
            return "Trung Bình";
        } else
            return "Yếu";
    }

    void nhapSV() {
        Scanner sc = new Scanner(System.in);
        sinhVien = new Bai4[sL];
        for (int i = 0; i < sL; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1));
            System.out.print("Họ và tên:");
            String ten = sc.nextLine();
            System.out.print("Điểm:");
            float diem = sc.nextFloat();
            sc.nextLine();
            String hocLuc = xetHocLuc(diem);
            sinhVien[i] = new Bai4(ten, diem, hocLuc);
        }
    }

    void xuatDSSV() {
        System.out.println("-----------Danh sách sinh viên-----------");
        for (int i = 0; i < sL; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));
            sinhVien[i].inThongTin();
        }
    }

    void sapXepDS() {
        List list = Arrays.asList(sinhVien);
        // Bộ so sánh
        Comparator comparator = new Comparator<Bai4>() {
            @Override
            public int compare(Bai4 o1, Bai4 o2) {
                return Float.compare(o1.diem, o2.diem);
            }
        };
        list.sort(comparator);// Truyền vào đối số cần thiết để so sánh
        System.out.println("-----------Danh sách sinh viên sau khi sắp xếp theo điểm-----------");
        for (int i = 0; i < sL; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));
            sinhVien[i].inThongTin();
        }
    }

}
