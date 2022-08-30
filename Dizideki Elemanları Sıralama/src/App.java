

import java.util.Arrays;
import java.util.Scanner;

public class App {
    static void sort(int[] list){
        int temp,std = list.length;
        while(std>1){
            for(int i = 0;i<std;i++){
                for(int j = i+1;j<std;j++){
                    if((i!=j) && (list[i]>list[j])){
                        temp = list[i];
                        list[i]=list[j];
                        list[j]=temp;
                    }
                }
            }
            std--;
        }
        System.out.println(Arrays.toString(list));
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutu n : ");
        int number = input.nextInt();
        int[] list = new int[number];
        System.out.println("Dizinin elemanları giriniz : ");
        int count = 0;
        while(count<list.length){
            System.out.print((count+1)+" Elamanı : ");
            int n = input.nextInt();
            list[count++]=n;
        }
        System.out.println(Arrays.toString(list));
        sort(list);
    }
}