package com.datbt2004110039.tuan_05.bt_them;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HamSVGD {
    int sLSV;
    ArrayList<SVGD> listSinhVien = new ArrayList();
    HamSVGD(int sL){
        sLSV = sL;
    }

    String xetHocLuc(float diem) {
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

    void nhapDSSV(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sLSV; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": ");
            System.out.print("Mã số sinh viên: ");
            int maSV = sc.nextInt();
            sc.nextLine();
            System.out.print("Họ và Tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh = sc.nextLine();
            System.out.print("Điểm: ");
            float diem = sc.nextFloat();
            sc.nextLine();
            String hocluc = xetHocLuc(diem);

            listSinhVien.add(new SVGD(maSV, hoTen, ngaySinh, diem, hocluc));
        }       
    }
    
    
    void inListSinhVien() {
        // In danh sách sinh viên
        System.out.printf("%-15s %-20s %-15s %-10s %-20s\n", "Mã Sinh Viên", "Họ và tên", "Ngày sinh", "Điểm",
                "Học lực");
        for (int i = 0; i < sLSV; i++) {
            SVGD sinhVien = (SVGD) listSinhVien.get(i);
            sinhVien.inThongTin();
        }
    }

    void sapxepList() {
        Comparator<SVGD> sosanh = new Comparator<SVGD>() {
            @Override
            public int compare(SVGD o1, SVGD o2) {
                return Float.compare(o2.diem, o1.diem);
            }
        };
        listSinhVien.sort(sosanh);
        System.out.println("===================Danh sách sinh viên sau theo khoảng điểm====================");
        inListSinhVien();
        System.out.println("===============================================================================");
    }

    void timSVTheoTen(String tim) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================================");
        System.out.printf("%-15s %-20s %-15s %-10s %-20s\n", "Mã Sinh Viên", "Họ và tên", "Ngày sinh", "Điểm",
                "Học lực");
        for (int i = 0; i < sLSV; i++) {
            SVGD sinhVien = (SVGD) listSinhVien.get(i);
            if (tim.equals(sinhVien.hoTen) == true) {
                sinhVien.inThongTin();
            }
        }
        System.out.println("===============================================================================");
    }

    
    void suaSV(String sua , int luaChonS) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sLSV; i++) {
            SVGD sinhVien = (SVGD) listSinhVien.get(i);
            if (sua.equals(sinhVien.hoTen) == true) {
                switch (luaChonS) {
                    case 1:
                        System.out.print("Nhập mã số mới:");
                        int newMaSV = sc.nextInt();
                        sinhVien.maSV = newMaSV;
                        break;
                    case 2:
                        System.out.print("Nhập họ tên mới:");
                        String newHoTen = sc.nextLine();
                        sinhVien.hoTen = newHoTen;
                        break;
                    case 3:
                        System.out.print("Nhập ngày sinh mới :");
                        String newNS = sc.nextLine();
                        sinhVien.ngaySinh = newNS;
                        break;
                    case 4:
                        System.out.print("Nhập điểm mới:");
                        Float newDiem = sc.nextFloat();
                        sinhVien.diem = newDiem;
                        sinhVien.hocLuc =  xetHocLuc(newDiem);
                        break;

                }
                break;
            }
        }
    }

    void xoaSV(String xoa){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sLSV; i++) {
            SVGD sinhVien = (SVGD) listSinhVien.get(i);
            if (xoa.equals(sinhVien.hoTen) == true) {
                listSinhVien.remove(i);
                sLSV --;
            }
        }
    }




}
