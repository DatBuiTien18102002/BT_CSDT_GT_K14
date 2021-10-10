package com.datbt2004110039.tuan_04;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> soThuc = new ArrayList<>();
        float S = 0 ;
        
        while(true){
            System.out.print("Nhập số thực:");
            Double x = sc.nextDouble();
            sc.nextLine();
            soThuc.add(x);
            S += x;
            System.out.println("Nhập thêm ?(Y/N)");
            String temp = sc.nextLine();
            if(temp.equals("N"))
                break;
        }
        System.out.println("Danh sách số thực:");
        for (Double double1 : soThuc) {
            System.out.println(double1);
        }
        System.out.println("Tổng các số thực vừa nhập là:"+S);

    }
}
