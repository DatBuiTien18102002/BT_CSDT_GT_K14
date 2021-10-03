package com.datbt2004110039.tuan_03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bai4TestDrive {
    public static void main(String[] args) {
        String hocluc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên : ");
        int sL = sc.nextInt();
        sc.nextLine();
        Bai4 sinhVien[] = new Bai4[sL];
        for (int i = 0; i < sL; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1));
            System.out.print("Họ và tên:");
            String ten = sc.nextLine();
            System.out.print("Điểm:");
            float diem = sc.nextFloat();
            sc.nextLine();
            if (diem >= 9) {
                hocluc = "Xuất sắc";
            } else if (diem >= 7.5) {
                hocluc = "Giỏi";
            } else if (diem >= 6.5) {
                hocluc = "Khá";
            } else if (diem >= 5) {
                hocluc = "Trung Bình";
            } else
                hocluc = "Yếu";
            sinhVien[i] = new Bai4(ten, diem, hocluc);
        }
        System.out.println("-----------Danh sách sinh viên-----------");
        for (int i = 0; i < sL; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));
            sinhVien[i].inThongTin();
        }
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
