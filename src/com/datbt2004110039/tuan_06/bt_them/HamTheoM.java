package com.datbt2004110039.tuan_06.bt_them;
import java.util.Scanner;

public class HamTheoM {
    int sL;

    HamTheoM(int n ){
        sL = n;

    }
    
    bai3TheoM[] sanPham ;


    void nhapDSSP(){
        Scanner sc = new Scanner(System.in);
        sanPham = new bai3TheoM[sL];
        for (int i = 0; i < sL; i++) {
            System.out.println("Sản phẩm " + i);
            System.out.print("Nhập tên sản phẩm:");
            String ten = sc.nextLine();
            System.out.print("Nhập giá sản phẩm:");
            int gia = sc.nextInt();
            sc.nextLine();
            sanPham[i] = new bai3TheoM(ten, gia);
        }
    }

    void inDS(){
        System.out.println("============Danh sách sản phẩm ban đầu==========");
        for (int i = 0; i < sL; i++) {
            System.out.println("====Sản phẩm " + i+"====");
            sanPham[i].inThongTin();
        } 
    }

    void sapXepGiamDan(){
        for (int i = 0; i < sL - 1; i++) {
            for (int j = i + 1; j < sL; j++)
                if (sanPham[i].gia < sanPham[j].gia) {
                    String tempt;
                    tempt = sanPham[i].ten;
                    sanPham[i].ten = sanPham[j].ten;
                    sanPham[j].ten = tempt;
                    int tempg;
                    tempg = sanPham[i].gia;
                    sanPham[i].gia = sanPham[j].gia;
                    sanPham[j].gia = tempg;

                }
        }
        inDS();
    }

    void xoaTheoTen(String ten, int newsL){

        for(int i = 0;i < sL; i++){
            if(sanPham[i].ten.equals(ten)){
                for(int j = i; j< sL-1;j++){
                    sanPham[j] = sanPham[j+1];
                }
                break;
            }
        }
        System.out.println("============Danh sách sản phẩm sau xóa==========");
        for (int i = 0; i < newsL; i++) {
            System.out.println("====Sản phẩm " + i+"====");
            sanPham[i].inThongTin();
        }   
    }

    void giaTB(int newsL){
        int s = 0;
        for (int i = 0; i < newsL; i++) {
            s += sanPham[i].gia;
        }
        int giaTB = s / newsL;
        System.out.println("Giá trung bình của các sản phẩm  là:" + giaTB);
    }


}
