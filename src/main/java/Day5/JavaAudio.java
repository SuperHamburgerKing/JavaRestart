package Day5;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JavaAudio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("Study_and_Relax.wav");
        System.out.println(file.exists());
//        讀取音頻數據
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
//        音頻數據可先加載 而不是實時回流傳輸 因此以先加載可及時對此音頻做任何處理
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("Q")){
            System.out.println("請輸入要使用的功能: \"S\"為開始 \"T\"為停止 \"R\"為重新 \"Q\"為離開");
            input = scanner.nextLine();
//            System.out.println(input);
            input.toUpperCase();
            switch (input){
                case "S":clip.start();
                break;
                case "T":clip.stop();
                break;
                case "R":
                    clip.setFramePosition(0);
                    break;
                case "Q":
                    scanner.close();
                    break;
                default:
                    System.out.println("輸入錯誤的功能");
            }
        }
        System.out.println("byeeeee");
    }
}
