package com.datbt2004110039.baitap.tuan_01;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các hệ số a,b,c của phương trình bậc 2: ");
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        System.out.print("Nhập c: ");
        int c = sc.nextInt();
        Double Delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("Căn delta là : %.2f" , Math.sqrt(Math.abs(Delta)));
    }
}
