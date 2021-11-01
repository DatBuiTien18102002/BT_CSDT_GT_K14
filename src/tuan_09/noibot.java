package tuan_09;

import java.util.Arrays;

public class noibot {
    public static void main(String[] args) {
        int[] mang = new int[]{3,2,4,5,6,10};
        System.out.println("Danh sách phần tử trong mảng ban đầu:" + Arrays.toString(mang));
        bubbleSort(mang);
        System.out.println("Danh sách phần tử trong mảng sau sắp xếp:" + Arrays.toString(mang));
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;

        int temp = 0 ;
        for(int i =0;i<n;i++){
            for(int j = 1 ; j< n-i ;j++){
                if(arr[j-1]<arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
