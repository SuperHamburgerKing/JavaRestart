package Day1;

import javax.swing.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
//        Print();
//        UserInput();
//        Expression();
//        GUI();
//        Math();
        
    }

    private static void Math() {
        //        數學常用方法-設計一個算出三角形斜邊程式
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入x長度 :");
        x = scanner.nextDouble();
        System.out.println("請輸入y長度 :");
        y = scanner.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("三角形斜邊為: "+z);
//        無條件捨去跟進入
        double s = 3.14;
        System.out.println("無條件捨取值為: "+ Math.floor(s));
        System.out.println("無條件進入值為: "+ Math.ceil(s));
    }

    private static void GUI() {
        //        對話框
        String name = JOptionPane.showInputDialog("PLEASA ENTER YOUR NAME:");
        JOptionPane.showMessageDialog(null,"HELLO "+name);
//        轉型
        int age = Integer.parseInt(JOptionPane.showInputDialog("PLEASA ENTER YOUR age:"));
        JOptionPane.showMessageDialog(null,"YOUR AGE IS: "+age);
    }

    private static void Print() {
        System.out.println("\"abc\"");
        System.out.println("\\def\\");
    }

    private static void UserInput() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int age = scanner.nextInt();

        scanner.nextLine();

        String A = scanner.nextLine();
        System.out.println(S);
        System.out.println(age);
        System.out.println(A);
    }

    private static void Expression() {
        float f = 10;
        f = (float) 10 / 3;
        System.out.println(f);
    }
}
