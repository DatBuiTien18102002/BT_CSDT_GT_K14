package com.datbt2004110039.tuan_02;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập các hệ số a,b,c của phương trình bậc 2: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0)
                    System.out.println("Phương trình có vô số nghiệm");
                else
                    System.out.println("Phương trình vô nghiệm");

            } else {
                float x = (float) -c / b;
                System.out.println("Phương trình có nghiệm x =" + x);
            }

        } else {
            if (delta < 0)
                System.out.println("Phương trình vô ngiệm");
            else if (delta == 0) {
                int x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép :" + x);
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt :");
                float x1 = (float) (-b + Math.sqrt(delta)) / 2 * a;
                float x2 = (float) (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }

        }
    }

}
