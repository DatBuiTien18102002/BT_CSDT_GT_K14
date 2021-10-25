package com.datbt2004110039.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class HamTheoArrayList {
    ArrayList<Apple> danhSachApple = new ArrayList<>();
    int sL;
    HamTheoArrayList(int soluong){
        sL = soluong;
    }

    void NhapDS(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<sL;i++){
            System.out.println("Quả táo "+ i);
            System.out.print("Mã quả táo :");
            int ma = sc.nextInt();
            sc.nextLine();
            System.out.print("Khối lượng quả táo : ");
            String kL = sc.nextLine();
            System.out.print("Màu sắc quả táo : ");
            String color = sc.nextLine();

            danhSachApple.add(new Apple(ma, kL, color));           
        }
    }

    void themApple(int viTri){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dữ liệu của táo : ");
        System.out.print("Mã quả táo :");
        int ma = sc.nextInt();
        sc.nextLine();
        System.out.print("Khối lượng quả táo : ");
        String kL = sc.nextLine();
        System.out.print("Màu sắc quả táo : ");
        String color = sc.nextLine();
        danhSachApple.add(viTri,new Apple(ma, kL, color)); 
    }

    void findTheoColor(String mauSac){
        System.out.println("====Thông tin  trái táo màu " + mauSac);
        for(int i =0;i<sL;i++){
            Apple danhSach = (Apple)danhSachApple.get(i);
            if(danhSach.mauSac.equals(mauSac) == true){
                danhSach.inThongTin();
            }
        }
        System.out.println("==============================================");

    }

    void inDanhSachApple(){
        System.out.println("===========Danh sách các trái táo=============");
        for(int i =0;i<sL;i++){
            Apple danhSach = (Apple)danhSachApple.get(i);
            System.out.println("Trái táo "+ i);
            danhSach.inThongTin();
        }
        System.out.println("==============================================");
    }
}
