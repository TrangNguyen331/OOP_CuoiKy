public class Student extends Person implements IStudy, ISpeak{
    @Override
    public void speak() {
        System.out.println(this.getName() + " is speaking.");
    }
    @Override
    public void study() {
        System.out.println(this.getName()+ " is studying.");
    }

    public String universityName;

    public Student(String name, int age, float height, String universityName){
        super(name, age, height);
        this.universityName = universityName;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Tên trường: " + this.universityName);
    }

    public void activity(){
        System.out.println(this.getName() +" đang học Toán!");
    }


}