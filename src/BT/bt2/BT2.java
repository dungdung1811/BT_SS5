package BT.bt2;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình so sánh chuỗi");
        System.out.println("nhập vào chuỗi 1");
        String str1 = sc.nextLine();
        System.out.println("nhập vào chuỗi 2");
        String str2 = sc.nextLine();
        boolean check = str1.equals(str2);
        if (check == false){
            System.out.println("chuỗi không giống nhau: " + check);
        } else {
            System.out.println("chuỗi giống nhau: " + check);
        }

    }

}
