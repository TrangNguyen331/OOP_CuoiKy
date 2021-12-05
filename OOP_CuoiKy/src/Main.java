public class Main {
    public static void main(String[] args) {
        Student a = new Student("Quang Dương", 19, 1.8f, "HCMUTE");
        a.getInfo();
        a.activity();
        a.study();
        a.speak();
        Student1 b = new Student1("Thùy Trang", 19, 1.6f, "HCMUTE" );
        b.getInfo();
        b.activity();
        b.speak();
        b.study();
        Student2 c = new Student2("Duy Nguyễn",19, 1.7f,"HCMUTE");
        c.getInfo();
        c.activity();
        c.speak();
        c.study();
    }
}
