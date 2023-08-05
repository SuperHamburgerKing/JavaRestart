package Day3;

public class Hero extends Person{

      private String power;
    Hero(String name,int age,String power){
        super(name, age);
        this.power = power;
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+power;
    }
    public String getPower(){
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    public void copy(Hero x){
        this.setName(x.getName());
        this.setAge(x.getAge());
        this.setPower(x.getPower());
    }
}
