package baitap.tuan_01;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        float dai = sc.nextFloat();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        float rong = sc.nextFloat();
        float chuvi = (dai + rong) * 2;
        float dientich = dai * rong;
        System.out.println("Chu vi hình chữ nhật là :" + chuvi);
        System.out.println("Diện tích hình chữ nhật là :" + dientich);
        System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " + Math.min(dai, rong));

    }
}
