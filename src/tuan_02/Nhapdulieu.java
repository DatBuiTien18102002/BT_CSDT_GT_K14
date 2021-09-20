package tuan_02;
import java.util.Scanner;//#include<stdio.h>
public class Nhapdulieu {
    public static void main(String[] args) {
        Scanner sc;// Biến tham chiếu đối tượng Kiểu Scanner
        // Tạo đối tượng
        // toán tử new
        // Hàm tạo của Lớp Scanner
        sc = new Scanner(System.in);
        System.out.print("Nhap diem mon CTDL & GT: ");
        Float diem = sc.nextFloat();
        System.out.println("Diem vua nhap la: " + diem);

    }

}
