package Day3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
//        ArrayList();
//        TwoDArraylist();
//        For_Each();
//        JavaMethod();
//        Printf();
//        Final_Keyword();
//        Constructor();
//        ToString();
//       Object_Passing();
//        Static();
//        繼承中若是母類別有東西不想被子類別繼承 屬性或方法可加上 final 關鍵字
//        OverRide();
//        Encpsulation();
//        CopyObject();
//        java為單一繼承但使用interface可讓子類別實現多個interface 類似多繼承的效果 interface屬性須設定初值且方法皆為抽象方法

    }

    private static void CopyObject() {
        //        複製物件A中的屬性給物件B 不可用 B = A 因為這只是將兩物件指向同一位址 而不真正將物件B的屬性更改為物件A
        Hero hero1 = new Hero("kk",20,"##");
        Hero hero2 = new Hero("LL",45,"%%");
        //        將hero2的屬性改成hero1的屬性
        hero2.copy(hero1);
        System.out.println(hero2.getPower());
        System.out.println(hero1);
        System.out.println(hero2);
    }

    private static void Encpsulation() {
        //      封裝:概念為將類中的屬性設為private 若是要調用或是更改則必須透過getter和setter方法
        Hero hero = new Hero("abc",23,"$$");
        hero.setPower("$$$");
        System.out.println(hero.getPower());
    }

    private static void Override() {
        //        override方法
        Hero hero1 = new Hero("Superman",30,"$$");
        Hero hero2 = new Hero("Batman",20,"everything");
        System.out.println(hero1.toString());
    }

    private static void Static() {
        Car car1  = new Car("KK");
        Car car2 = new Car("LL");
        System.out.println(Car.carnumber);
    }

    private static void Object_Passing() {
        Car car1 = new Car("kk");
        Park park = new Park();
        park.park(car1);
    }

    private static void ToString() {
        //        java的 toString方法繼承給所有的類別 若是單純使用會得到一個地址，因此可以在該類別複寫他
//        在呼叫物件的tostring方法時便可得到所有的值 若是直接印出該物件則編譯器會自動套上toString方法
//        可隱性調用或顯性調用都可
        Car car = new Car(3,4,"kk");
//        沒複寫的話只會印出car該物件的地址，複寫後若印出car則系統會自動調用toString方法
//       以下兩種印出方式的到一樣的結果
        System.out.println(car);
        System.out.println(car.toString());
    }

    private static void Constructor() {
        //          建構子用法
        Car car1 = new Car(3,4,"KK");
        Car car2 = new Car(4,5,"BB");
        car1.qq();
        System.out.println(car1.name);
    }

    private static void Final_Keyword() {
        //        使用final宣告的變數 不可更改
        final int a = 123;
        System.out.println(a);
    }

    private static void Printf() {
        //        格式化印出
//        (boolean "%b") (Char "%c") (int "%d") (double "%f") (String "%s")
//        若要印空格 ex:   int a = 123; printf("%10d",a)
        int a = 123;
        double b = 1000;

        System.out.printf("數字為%d",a);
        System.out.println();
//        %10d:向右對其包含數字有10格   %-10d:向左對齊
        System.out.printf("數字為%10d",a);
        System.out.println();
//        若要規定小數點後顯示幾位
        System.out.printf("顯示小數點後兩位%.2f",b);
        System.out.println();
//        以千分位加上逗點
        System.out.printf("加上逗點後為%,f",b);
    }

    private static void JavaMethod() {
        //        java method
        int x = 3;
        int y = 4;
        int z = add(x,y);
        System.out.println(z);
    }

    public static int add(int a,int b){
        int z = a+b;
        return z;
    }

    private static void For_Each() {
        //for each用法:通常是用在遍歷數組或集合 更簡單但較不靈活
        String[] S  = new String[3];
        S[0] = "A";
        S[1] = "B";
        S[2] = "C";
        for(String s : S){
            System.out.println(s);
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("b");
        for (String SS: arrayList){
            System.out.println(SS);
        }
    }

    private static void TwoDArraylist() {
        //        2D ArrayList宣告
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        a.add("c");
        a.add("d");
        b.add("e");
        b.add("f");
        groceryList.add(a);
        groceryList.add(b);
        System.out.println(groceryList);
//        得到二維arraylist內部的資料
        System.out.println(groceryList.get(0).get(0));
    }

    private static void ArrayList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
//        調換 c換a
        list.set(0,"c");
//        將list中元素清除
        list.clear();
//        得到list中該索引元素
        list.get(0);
    }
}
