package baitap.tuan_02;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("+---------------------------------+");
            System.out.println("1.Giải phương trình bậc nhất");
            System.out.println("2.Giải phương trình bậc hai");
            System.out.println("3.Tính tiền điện");
            System.out.println("4.Kết thúc");
            System.out.println("+---------------------------------+");
            System.out.print("Lựa chọn của bạn là: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Nhập các hệ số a,b của phương trình bậc 1:");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    if (a == 0) {
                        if (b == 0)
                            System.out.println("*Phương trình có vô số nghiệm");
                        else
                            System.out.println("*Phương trình vô nghiệm");

                    } else {
                        float x = (float) -b / a;
                        System.out.println("*Phương trình có nghiệm x =" + x);
                    }
                    break;
                }
                case 2: {
                    System.out.print("Nhập các hệ số a,b,c của phương trình bậc 2: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    double delta = Math.pow(b, 2) - 4 * a * c;
                    if (a == 0) {
                        if (b == 0) {
                            if (c == 0)
                                System.out.println("*Phương trình có vô số nghiệm");
                            else
                                System.out.println("*Phương trình vô nghiệm");

                        } else {
                            float x = (float) -c / b;
                            System.out.println("*Phương trình có nghiệm x =" + x);
                        }

                    } else {
                        if (delta < 0)
                            System.out.println("*Phương trình vô ngiệm");
                        else if (delta == 0) {
                            int x = -b / (2 * a);
                            System.out.println("*Phương trình có nghiệm kép :" + x);
                        } else {
                            System.out.println("*Phương trình có 2 nghiệm phân biệt :");
                            float x1 = (float) (-b + Math.sqrt(delta)) / 2 * a;
                            float x2 = (float) (-b - Math.sqrt(delta)) / 2 * a;
                            System.out.println("*X1 = " + x1);
                            System.out.println("*X2 = " + x2);
                        }

                    }
                    break;
                }
                case 3: {
                    int tienDien;
                    System.out.print("Nhập số điện đã sử dụng: ");
                    float soDien = sc.nextFloat();
                    if (soDien <= 50) {
                        tienDien = (int) (soDien * 1000);
                    } else {
                        tienDien = (int) (50 * 1000 + (soDien - 50) * 1200);
                    }
                    System.out.println("*TIền điện phải trả là: " + tienDien + "Đồng");
                    break;
                }

            }
        } while (choice != 4);
    }
}
