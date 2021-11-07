package com.datbt2004110039.tuan_09;

import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng táo");
        int soLuong = sc.nextInt();
        FunctionApple dsApple = new FunctionApple(soLuong);

        dsApple.NhapDSApple();
        /*
        System.out.println("====Danh sách giảm dần====");
        dsApple.selection_GiamDan();
        dsApple.inDanhSach();
        */

        
        System.out.println("====Danh sách tăng dần====");
        dsApple.selection_TangDan();
        dsApple.inDanhSach();
        
        /*
        System.out.println("======");
        dsApple.bubble_TangDan();
        System.out.println("====Danh sách tăng dần theo bubble====");
        dsApple.inDanhSach();
        */
        /*
        System.out.println("Nhập mã càn tìm :");
        int ma = sc.nextInt();

        int vitri = dsApple.findvsMa(ma);

        if(vitri != -1){
            System.out.println("Tìm thấy tại vị trí thứ "+vitri);
        }
        else
            System.out.println("Không tìm thấy");
        */

        //dsApple.findvsCanNang();
        /*sc.nextLine();
        System.out.println("Nhập màu cần tìm :");
        String mau = sc.nextLine();
        dsApple.findvsMau(mau);
        */

        System.out.println("Nhập mã càn tìm :");
        int matree = sc.nextInt();

        int vitri = dsApple.findvsCayvsKL(matree);

        if(vitri != -1){
            System.out.println("Tìm thấy tại vị trí thứ "+vitri);
        }
        else
            System.out.println("Không tìm thấy");


    }
}
