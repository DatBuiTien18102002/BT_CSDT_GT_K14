package tuan_05;
import java.util.ArrayList;
import java.util.List;

public class ThaotacArrayList {
    public static void main(String[] args) {
        List a = new ArrayList<>();
        a.add(1);
        a.add(6);
        a.add("tuấn");
        a.add(3);
        System.out.println(a);
        //Thêm phần tử vào vị trí
        a.add(2, 18);
        System.out.println("Sau khi thêm");
        System.out.println(a);
        //Xóa phần tử tại vị trí
        a.remove(3);//<=> a.remove("tuấn");
        System.out.println("Sau khi xóa");
        System.out.println(a);
        //Xóa tất cả phần tử
        //a.clear();
        //Thay đổi phần tử tại vị trí
        a.set(2,"Hòa");
        System.out.println("Sau khi đổi");
        System.out.println(a);
        //Truy suất phần tử tại vị trí
        System.out.println("Lấy phần tử");
        System.out.println(a.get(2));
        //Số phần tử
        System.out.println("Số phần tử của list");
        System.out.println(a.size());
        System.out.println("Vị trí của phần tử Hòa");
        System.out.println(a.indexOf("Hòa"));
        



        


    }

}
