package com.datbt2004110039.tuan_03;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean ok = true;
        do {
            System.out.print("Nhập vào số nguyên: ");
            n = sc.nextInt();
        } while (n < 0);
        if (n == 0 || n == 1) {
            System.out.println(n + " không phải số nguyên tố");
        } else if (n == 2) {
            System.out.println(n + " là số nguyên tố");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    ok = false;
                }
            }
            if (ok == true) {
                System.out.println(n + " là số nguyên tố");
            } else
                System.out.println(n + " không là số nguyên tố");
        }

    }
}
