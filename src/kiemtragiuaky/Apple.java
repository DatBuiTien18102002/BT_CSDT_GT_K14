package kiemtragiuaky;

import java.util.Scanner;

public class Apple {
    int ma;
    String khoiLuong;
    String mauSac;

    Apple(){
        
    }

    Apple(int id,String kL, String color){
        ma = id;
        khoiLuong = kL;
        mauSac = color;
    }

    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã quả táo :");
        ma = sc.nextInt();
        sc.nextLine();
        System.out.print("Khối lượng quả táo : ");
        khoiLuong = sc.nextLine();
        System.out.print("Màu sắc quả táo : ");
        mauSac = sc.nextLine();
    }

    void inThongTin(){
        System.out.println("Mã của táo : "+ma);
        System.out.println("Khối lượng của táo : "+ khoiLuong);
        System.out.println("Màu sắc trái táo : "+mauSac);
    }

}
