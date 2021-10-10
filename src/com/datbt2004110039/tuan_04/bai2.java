package com.datbt2004110039.tuan_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        ArrayList<String> listHoTen = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("=====================Menu================");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.println("=========================================");
            System.out.print("Lựa chọn :");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    sc.nextLine();
                    listHoTen.clear();
                    while (true) {

                        System.out.print("Nhập họ tên:");
                        String x = sc.nextLine();
                        listHoTen.add(x);
                        System.out.println("Nhập thêm ?(Y/N)");
                        String temp = sc.nextLine();
                        if (temp.equals("N"))
                            break;
                    }
                    break;
                case 2:
                    System.out.println("============Danh sách tên==========");
                    for (String ten : listHoTen) {
                        System.out.println(ten);
                    }
                    break;
                case 3:
                    Collections.shuffle(listHoTen);
                    System.out.println("============Danh sách sắp xếp ngẫu nhiên==========");
                    for (String ten : listHoTen) {
                        System.out.println(ten);
                    }
                    break;
                case 4:
                    Collections.sort(listHoTen,new Comparator<String>(){

                        @Override
                        public int compare(String o1, String o2) {
                            return o2.compareTo(o1);
                        }
                        
                    });
                    System.out.println("============Danh sách sắp xếp giảm dần==========");
                    for (String ten : listHoTen) {
                        System.out.println(ten);
                    }
                    break;
                case 5:
                sc.nextLine();
                    System.out.println("Nhập họ tên cần xóa:");
                    String  tenXoa = sc.nextLine();
                    for (String ten : listHoTen) {
                        if(tenXoa.equals(ten))
                        {
                            listHoTen.remove(ten);
                            break;
                        }

                    }
                    break;

            }

        } while (luaChon != 6);

    }
}
