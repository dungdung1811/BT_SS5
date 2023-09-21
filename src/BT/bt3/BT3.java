package BT.bt3;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        System.out.println("Nhập vào 1 đoạn văn bản để đạo ngược nó");
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer(sc.nextLine());
        str.reverse();
        System.out.println("Đây là đoạn văn bản sau khi được đảo ngược:\n"+str);

    }
}
