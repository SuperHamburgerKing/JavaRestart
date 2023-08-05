package Day3;

public class Car {
    int a ;
    int b ;
    String name;
    static int carnumber;

    public Car(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
        carnumber++;
    }
    void qq(){
        System.out.println("i am "+name);
    }
    public Car( String name) {
        this.name = name;
        carnumber++;
    }
    public String toString(){
        return a+"\n"+b+"\n"+name;
    }
}
