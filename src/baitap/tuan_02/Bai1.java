package baitap.tuan_02;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập các hệ số a,b của phương trình bậc 1:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0)
                System.out.println("Phương trình có vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");

        }
        else{
            float x = (float)-b/a; 
            System.out.println("Phương trình có nghiệm x ="+ x);
        }
    }
}
