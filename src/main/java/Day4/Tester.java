package Day4;

import java.io.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
//        File();
//        Exception();
//        FileWritter();
//        FileReader();
    }

    private static void FileReader() {
        //      讀取檔案資料

        try {
            FileReader reader = new FileReader("abc");
            int result = reader.read();
            while (result!=-1){
                System.out.print((char) result);
                result = reader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void FileWritter() {
        //        寫入資料進檔案
        try {
//            建立目標檔案並給檔名也可給路徑加檔名自訂位置
            FileWriter writer = new FileWriter("abc");
            writer.write("hello\nhello\nhello");
            writer.append("\nok");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void File() {
//        得到有關檔案的資訊
        File file = new File("abc");
//        有沒有這個檔案
        System.out.println(file.exists());
//          檔案的相對路徑和絕對路徑
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
//        刪除該檔案
        file.delete();
    }

    private static void Exception() {
        Scanner scanner = new Scanner(System.in);
        try {
            int x;
            int y;
            System.out.println("請輸入被除數: ");
            x = scanner.nextInt();
            System.out.println("請輸入除數: ");
            y = scanner.nextInt();
            int z = x/y;
            System.out.println("計算結果為:"+z);
        }catch (ArithmeticException e){
            System.out.println("除數不可為0");

        }
        catch (Exception e){
            System.out.println("發生錯誤");
        }
        finally {
            scanner.close();
        }
    }
}
