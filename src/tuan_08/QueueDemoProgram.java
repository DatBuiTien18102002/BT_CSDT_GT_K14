package tuan_08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue ;

        queue = new LinkedList<>();
        queue.add(8);
        queue.add(10);
        queue.add(2);
        System.out.println(queue);

        int phanTuDuocLayRa = queue.remove();

        System.out.println("Phần tử được lấy ra :"+ phanTuDuocLayRa);

        System.err.println("Phần tử còn lại :"+queue);

        //Thêm 1 phần tử của Queue - không loại khỏi danh sách

        int phanTuDuocTham = queue.peek();
      
        System.out.println("Phần tử được thăm  :"+ phanTuDuocTham);
        System.err.println("Phần tử còn lại sau thăm :"+queue);




        List list = new ArrayList<>();

        //Cài đặt linked List
            //Thêm phần tử vào cuối .
            //Lấy 1 phần tử đầu
            //Xóa phần tử ở đầu

        //Dùng Linked List để cài đặt  cấu trúc Stack
        //Cài đặt linked List
            //Thêm phần tử vào  cuối .
            //Lấy 1 phần tử cuối 
            //Xóa phần tử ở cuối
        
    }
}
