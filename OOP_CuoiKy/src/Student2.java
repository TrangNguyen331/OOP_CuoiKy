public class Student2 extends Person implements ISpeak,IStudy{
    public String universityName;

    public Student2(String name, int age, float height, String universityName){
        super(name, age, height);
        this.universityName = universityName;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Tên trường: " + this.universityName);
    }

    public void activity(){
        System.out.println(this.getName() +" đang học Toán RR!");
    }
    public void study() {
        System.out.println(this.getName() + "is studing.");
    }
    @Override
    public void speak() {
        System.out.println(this.getName() + " is speaking.");
    }
}