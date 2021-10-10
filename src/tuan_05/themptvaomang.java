package tuan_05;

public class themptvaomang {
    public static void main(String[] args) {
        int arr[] ={3,5,7,9};//n=4
        int newElement = 8;//Phần tửu cần them vào
        //Chiều dài của mảng cũ
        int n=arr.length;
        //Tao mảng mới
        int newArr[] = new int[n+1];
        //Đổi dữ liệu của mảng cũ sang mảng mới
        for(int i=0;i<n;i++){
            newArr[i]=arr[i];
        }
        System.out.println("In mảng cũ");
        for (int x : arr) {
            System.out.println(x);
        }
        newArr[n]=newElement;
        System.out.println("In mảng mới");
        for (int x : newArr) {
            System.out.println(x);
        }

    }
}
