package tuan_09;

import java.util.Arrays;

public class sapxepmang {
    public static void main(String[] args) {
        int[] mang = new int[]{3,6,2,9,1,0};
        System.out.println("Danh sách phần tử trong mảng ban đầu:" + Arrays.toString(mang));
        selectionSort(mang);
        System.out.println("Danh sách phần tử trong mảng sau sắp xếp:" + Arrays.toString(mang));


    }
    public static void  selectionSort(int[] arr){
        for(int i = 0;i<arr.length - 1;i++){
            int index = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] =smallerNumber;
        }

    }
}
