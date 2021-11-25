

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datetest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfd = new SimpleDateFormat("dd");
        SimpleDateFormat sdfm = new SimpleDateFormat("MM");
        SimpleDateFormat sdfy = new SimpleDateFormat("yyyy");

        Date date =null;
        System.out.print("Nhập ngày tháng năm:");

        try {
            date = sdf.parse(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Nhập sai cấu trúc!!!");
        }

        System.out.println("Ngày tháng năm vừa nhâp kiểu java: "+ date);

        int a = Integer.parseInt(sdfd.format(date));

        System.out.println("Ngày: "+ a);

        System.out.println("Tháng: "+ sdfm.format(date));

        System.out.println("Năm: "+ sdfy.format(date));



       

      



        


    }
}
