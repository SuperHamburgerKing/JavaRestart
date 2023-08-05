package Day2;

import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
//        RandomNumber();
//        If();
//        Switch();
//        While();
//沒寫     For();
//        NextedLoop();
//        Array();
//        TwodArray();
//        StringMethod();
    }

    private static void StringMethod() {
        String name = "BRO";
        System.out.println(name.equals("CINDY"));
//        忽略大小寫
        boolean result = name.equalsIgnoreCase("bro");
        System.out.println(result);
        System.out.println(name.length());
//        字母在名子的第幾個位置
        int a = name.indexOf("B");
//        將name中有空白格的地方刪除
        name.trim();
//        將name中的一字母換成另一字母
        name.replace("o","a");
//        將name中的大寫換成小寫
        name.toLowerCase();
    }

    private void TwodArray () {
        //        2D Array 宣告方式
        String[][] car = new String[3][3];
        String[][] cars = {{"a","b"},{"c","d"},{"e","f"}};
        System.out.println(cars.length);
        for(int i =0;i < cars.length-1;i++){
            System.out.println();
            for (int j = 0 ;j < cars.length-1 ; j++){
                System.out.print(cars[i][j]);
            }
        }
    }

    private static void Array() {
        //        兩種宣告方式
        String[] a = {"b","c","d"};
        String[] A = new String[3];
        A[0] = "e";
        A[1] = "f";
        A[2] = "g";
        for(int i = 0;i< A.length;i++){
            System.out.println(A[i]);
        }
    }

    private static void NextedLoop() {
        int row;
        int col;
        String symbol = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEAES ENTER THE ROW: ");
        row = scanner.nextInt();
        System.out.println("PLEAES ENTER THE COL: ");
        col = scanner.nextInt();
        scanner.nextLine();
        System.out.println("PLEAES ENTER THE SYMBOL: ");
        symbol = scanner.nextLine();
        for (int i = 1 ; i<=row ; i++){
            System.out.println();
            for(int j = 1 ; j<=col ; j++ ){
                System.out.print(symbol);
            }
        }
    }

    private static void While() {
        String name = "";
        Scanner scanner = new Scanner(System.in);
        while (name.isBlank()){
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
        }
    }

    private static void Switch() {
        String day = "friday";
        switch (day) {
            case "monday":
                System.out.println("today is "+day);
                break;
            case "friday":
                System.out.println("today is "+day);
                break;
            default:
                System.out.println("gugugu");
        }
    }

    private static void If() {
        int age = 16;
        if ( age < 18){
            System.out.println("child");
        }
        else System.out.println("adult");
    }

    private static void RandomNumber() {
        Random random = new Random();
//        0~5變1~6
        int x = random.nextInt(6)+1;
//        生成隨機0~1的小數
        double y = random.nextDouble();
        System.out.println(x);
        System.out.println(y);
    }
}
