package com.datbt2004110039.tuan_05.bt_them;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SVGDTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SVGD> listSinhVien = new ArrayList();
        //Cần phải nhập danh sách trước khi thực hiện các chức năng trong Menu
        System.out.println("Nhập danh sách đầu tiên");
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        SVGD soSV = new SVGD(n);
        nhapListSinhVien(listSinhVien, soSV);
        int luaChon;
        do {
            System.out.println("===================Menu===================");
            System.out.println("1.Nhập danh sách sinh viên");
            System.out.println("2.Xuất danh sách sinh viên");
            System.out.println("3.Xuất danh sinh viên theo khoảng điểm");
            System.out.println("4.Tìm sinh viên theo tên");
            System.out.println("5.Sửa thông tin sinh viên");
            System.out.println("6.Xóa sinh viên theo tên");
            System.out.println("7.Kết thúc");
            System.out.println("==========================================");
            System.out.print("Lựa chọn:");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    listSinhVien.clear();
                    System.out.print("Nhập số lượng sinh viên: ");
                    n = sc.nextInt();
                    soSV = new SVGD(n);
                    nhapListSinhVien(listSinhVien, soSV);
                    break;
                case 2:
                    System.out.println("========================Danh sách sinh viên Gia Định========================");
                    inListSinhVien(listSinhVien, soSV);
                    System.out.println("============================================================================");
                    break;
                case 3:
                    sapxepList(listSinhVien, soSV);
                    break;
                case 4:
                    timSVTheoTen(listSinhVien, soSV);
                    break;
                case 5:
                    suaSV(listSinhVien, soSV);
                    break;
                case 6:
                    xoaSV(listSinhVien, soSV);
                    break;

            }

        } while (luaChon != 7);
    }

    public static void nhapListSinhVien(ArrayList<SVGD> listSV, SVGD n) {
        for (int i = 0; i < n.soSV; i++) {
            Scanner sc = new Scanner(System.in);
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
            String hocluc;
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
            listSV.add(new SVGD(maSV, hoTen, ngaySinh, diem, hocluc));
        }
    }

    public static void inListSinhVien(ArrayList<SVGD> listSV, SVGD n) {
        // In danh sách sinh viên
        System.out.printf("%-15s %-20s %-15s %-10s %-20s\n", "Mã Sinh Viên", "Họ và tên", "Ngày sinh", "Điểm",
                "Học lực");
        for (int i = 0; i < n.soSV; i++) {
            SVGD sinhVien = (SVGD) listSV.get(i);
            sinhVien.inThongTin();
        }
    }

    public static void sapxepList(ArrayList<SVGD> listSV, SVGD n) {
        Comparator<SVGD> sosanh = new Comparator<SVGD>() {
            @Override
            public int compare(SVGD o1, SVGD o2) {
                return Float.compare(o2.diem, o1.diem);
            }
        };
        listSV.sort(sosanh);
        System.out.println("===================Danh sách sinh viên sau theo khoảng điểm====================");
        inListSinhVien(listSV, n);
        System.out.println("===============================================================================");
    }

    public static void timSVTheoTen(ArrayList<SVGD> listSV, SVGD n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên cần tìm : ");
        String tim = sc.nextLine();
        System.out.println("===============================================================================");
        System.out.printf("%-15s %-20s %-15s %-10s %-20s\n", "Mã Sinh Viên", "Họ và tên", "Ngày sinh", "Điểm",
                "Học lực");
        for (int i = 0; i < n.soSV; i++) {
            SVGD sinhVien = (SVGD) listSV.get(i);
            if (tim.equals(sinhVien.hoTen) == true) {
                sinhVien.inThongTin();
            }
        }
        System.out.println("===============================================================================");
    }

    public static void suaSV(ArrayList<SVGD> listSV, SVGD n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên cần Sửa : ");
        String sua = sc.nextLine();
        System.out.println("Chọn nội dung cần sửa:");
        System.out.println("======Menu======");
        System.out.println("1.Mã số sinh viên");
        System.out.println("2.Họ và tên");
        System.out.println("3.Ngày sinh");
        System.out.println("4.Điểm");
        System.out.println("================");
        System.out.print("Lựa chọn:");
        int luaChon = sc.nextInt();

        for (int i = 0; i < n.soSV; i++) {
            SVGD sinhVien = (SVGD) listSV.get(i);
            if (sua.equals(sinhVien.hoTen) == true) {
                switch (luaChon) {
                    case 1:
                        System.out.print("Nhập mã số mới:");
                        int newMaSV = sc.nextInt();
                        sinhVien.maSV = newMaSV;
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("Nhập họ tên mới:");
                        String newHoTen = sc.nextLine();
                        sinhVien.hoTen = newHoTen;
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.print("Nhập ngày sinh mới :");
                        String newNS = sc.nextLine();
                        sinhVien.ngaySinh = newNS;
                        break;
                    case 4:
                        System.out.print("Nhập điểm mới:");
                        Float newDiem = sc.nextFloat();
                        sinhVien.diem = newDiem;
                        if (sinhVien.diem >= 9) {
                            sinhVien.hocLuc = "Xuất sắc";
                        } else if (sinhVien.diem >= 7.5) {
                            sinhVien.hocLuc = "Giỏi";
                        } else if (sinhVien.diem >= 6.5) {
                            sinhVien.hocLuc = "Khá";
                        } else if (sinhVien.diem >= 5) {
                            sinhVien.hocLuc = "Trung Bình";
                        } else
                            sinhVien.hocLuc = "Yếu";
                        break;

                }
            }
        }
    }
    public static void xoaSV(ArrayList<SVGD> listSV, SVGD n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên cần xóa : ");
        String xoa = sc.nextLine();
        for (int i = 0; i < n.soSV; i++) {
            SVGD sinhVien = (SVGD) listSV.get(i);
            if (xoa.equals(sinhVien.hoTen) == true) {
                listSV.remove(i);
                n.soSV--;
            }
        }
    }
}