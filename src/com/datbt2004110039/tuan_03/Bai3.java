package com.datbt2004110039.tuan_03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng : ");
        int n = sc.nextInt();
        int[] mangSoNguyen = new int[n];
        for(int i =0;i<n;i++){
            System.out.printf("mangSoNguyen[%d]:",i);
             mangSoNguyen[i] = sc.nextInt();
        }
        int temp = 0;
        int tong =0;
        int dem =0;
        System.out.println("a)Mảng sau khi xếp là:");
        for(int x:mangSoNguyen){
            Arrays.sort(mangSoNguyen);
            System.out.printf("mangSoNguyen[%d]:%d\n",temp,x);
            temp++;
        }
        int Min=mangSoNguyen[0];
        for(int i=0;i<n;i++){
            Min= Math.min(Min,mangSoNguyen[i] );
        }
        System.out.println("b)Phần tử có giá trị nhỏ nhất trong mảng:"+Min);
        for(int i =0;i<n;i++){
            if(mangSoNguyen[i]%3==0){
                tong += mangSoNguyen[i];
                dem++;
            }
        }
        float tbc= (float)tong/dem;
        System.out.printf("c)Trung bình cộng của các phần tử chia hết cho 3: %.2f ",tbc);
    }
}
