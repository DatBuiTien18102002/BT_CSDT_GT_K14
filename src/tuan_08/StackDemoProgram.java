package tuan_08;

import java.util.Stack;

public class StackDemoProgram {
    public static void main(String[] args) {
        Stack<String> stack;

        stack = new Stack<>();

        stack.push("Wellcome");
        stack.push("to");
        stack.push("Data structure an Algotithm");

        System.out.println(stack);

        String popped = stack.pop();

        System.err.println("Đã lấy ra phần tử khỏi danh sách " +popped);

        System.err.println("Phần tử còn lại của stack");
        System.out.println(stack);
        //Thăm nút đỉnh không loại khỏi danh sách

        String phanTuDuocTham = stack.peek();

        System.out.println("Phần tử được thăm: "+phanTuDuocTham);
        System.out.println("Phần tử còn lại của stack");
        System.out.println(stack);


    }
}
