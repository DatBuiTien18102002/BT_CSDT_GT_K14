package com.datbt2004110039.tuan_05.bt_them;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SVGDTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cần phải nhập danh sách trước khi thực hiện các chức năng trong Menu
        System.out.println("Nhập danh sách đầu tiên");
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        HamSVGD listSinhVien = new HamSVGD(n);
        listSinhVien.nhapDSSV();
        int luaChon;
        int luaChonS;
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
                    System.out.print("Nhập số lượng sinh viên: ");
                    n = sc.nextInt();
                    listSinhVien = new HamSVGD(n);
                    listSinhVien.nhapDSSV();
                    break;
                case 2:
                    System.out.println("========================Danh sách sinh viên Gia Định========================");
                    listSinhVien.inListSinhVien();
                    System.out.println("============================================================================");
                    break;
                case 3:
                    listSinhVien.sapxepList();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Nhập tên sinh viên cần tìm : ");
                    String tim = sc.nextLine();
                    listSinhVien.timSVTheoTen(tim);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Nhập tên sinh viên cần Sửa : ");
                    String sua = sc.nextLine();
                    do{
                        System.out.println("Chọn nội dung cần sửa:");
                        System.out.println("======Menu======");
                        System.out.println("1.Mã số sinh viên");
                        System.out.println("2.Họ và tên(tự kết thúc sau khi sửa)");
                        System.out.println("3.Ngày sinh");
                        System.out.println("4.Điểm");
                        System.out.println("5.Kết thúc");
                        System.out.println("================");
                        System.out.print("Lựa chọn:");
                        luaChonS = sc.nextInt();
                        listSinhVien.suaSV(sua, luaChonS);
                        if(luaChonS ==2 ){
                            break;
                        }
                    }while(luaChonS!=5);
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Nhập tên sinh viên cần xóa : ");
                    String xoa = sc.nextLine();
                    listSinhVien.xoaSV(xoa);
                    break;

            }

        } while (luaChon != 7);
    }






}