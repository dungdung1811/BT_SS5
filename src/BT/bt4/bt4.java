package BT.bt4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise;

        while (true){
            System.out.println("nhập vào lựa chọn\n1: email: \n2:số phone:\n3:password:\n4:Năm/Tháng/Ngày:\n0:Thoát chương trình");
             choise = sc.nextInt();
            sc.nextLine();
            switch (choise){
                case 1:
                    while (true){
                        System.out.println("Nhập Email");
                        String email = sc.nextLine();
                        if (!validateEmail(email)){
                            System.out.println("sai cú pháp");
                        }else {
                            System.out.println("ok");
                            break;

                        }
                    }


                case 2:
                    while (true){
                        System.out.println("Nhập số điện thoại");
                        String phonenumber = sc.nextLine();
                        if (!validatePhoneNumber(phonenumber)){
                            System.out.println("sai cú pháp phone");
                        } else {
                            System.out.println();
                            break;
                        }
                    }


                case 3:
                    while (true){
                        System.out.println("Nhập Password");
                        String pass= sc.nextLine();
                        if (!validatePassWord(pass)){
                            System.out.println("PassWord không đúng định dạng");
                        } else {
                            System.out.println();
                            break;
                        }
                    }


                case 4:
                    while (true){
                        System.out.println("Thời gian");
                        String time = sc.nextLine();
                        if (!validateTime(time)){
                            System.out.println("Thời gian không đúng định dạng");
                        } else {
                            System.out.println();
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");

            }
        }

    }
    public static boolean validateEmail (String email){
        String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);
        return m.matches();
    }
    public static boolean validatePhoneNumber (String number) {
        String phonenum = "^(09|01[2|6|8|9])+([0-9]{8})$|^(02|03[2|3|4|5|6|7|8|9])+([0-9]{7})$";
        Pattern p = Pattern.compile(phonenum);
        Matcher m = p.matcher(number);
        return m.matches();
    }
    public  static  boolean validatePassWord (String pass){
        String passWord = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        Pattern p = Pattern.compile(passWord);
        Matcher m = p.matcher(pass);
        return m.matches();
    }
    public static boolean validateTime (String date){
        String time = "^(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])/(0[1-9]|1[0-2]|[1-9])/([0-9]{4})$";
        Pattern p = Pattern.compile(time);
        Matcher m = p.matcher(date);
        return m.matches();
    }
}
