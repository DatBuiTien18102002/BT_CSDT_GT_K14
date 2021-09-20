import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("NHap vao n: ");
            int n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Lỗi!!!");
        } finally {
            System.out.println("Sao cũng được");
        }
        System.out.println("Kết thúc!!");

    }

}
