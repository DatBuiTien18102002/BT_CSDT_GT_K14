package baitap.tuan_01;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập cạnh của hình lập phương: ");
        float canh = sc.nextFloat();
        System.out.println("Thể tích khối lập phương là :"+Math.pow(canh,3));
    }
}
