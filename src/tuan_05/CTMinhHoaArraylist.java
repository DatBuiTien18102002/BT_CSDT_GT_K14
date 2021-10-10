package tuan_05;

import java.util.ArrayList;
import java.util.List;
import tuan_02.SinhVien;
import tuan_04.Bai4;
import tuan_04.Dog;

public class CTMinhHoaArraylist {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Cường");
        a.add("True");
        a.add(1);
        a.add(2.5);
        Integer x = (Integer) a.get(2);
        {
        }
        a.add(new Dog(22, "Vàng", "Fido"));
        System.out.println(a);
        // lấy 1 phần tử từ list
        Dog dog = (Dog) a.get(4);
        System.out.println("Dog name: " + dog.name + "\n" + "Color: " + dog.color + "\n" + "Size: " + dog.size);
        List bienTCArrayList = new ArrayList();
        bienTCArrayList.add(new Bai4("BÙi Tiến Đạt", 7, "Khá"));

        List<String> lisStrings = new ArrayList<>();
        // lisStrings.add(1);//Báo lỗi
        lisStrings.add("Tèo");

        ArrayList<Bai4> aStudent = new ArrayList<>();
        // aStudent.add("Mr tèo");//Lỗi

        /*
         * Bai4 student2 = new Bai4(); aStudent.add(student2);
         */

        aStudent.add(new Bai4());

        ArrayList<String> ten = new ArrayList<>();
        ten.add("Cường");
        ten.add("Tuấn");
        ten.add("Phương");
        ten.add("Hạnh");
        String s = ten.get(2);
        System.out.println("Tên:" + s);

    }
}
