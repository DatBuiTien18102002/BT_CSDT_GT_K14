package tuan_09;

import java.util.Arrays;

public class sapxepchen {
    public static void main(String[] args) {
        int[] mang = new int[]{3,2,4,5,6,10};
        System.out.println("Danh sách phần tử trong mảng ban đầu:" + Arrays.toString(mang));
        sort(mang);
        System.out.println("Danh sách phần tử trong mảng sau sắp xếp:" + Arrays.toString(mang));
    }
    static void sort(int arr[]){
        int n = arr.length;
        for(int i =1 ;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while (j>= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1]=key;
        }
    }
}
