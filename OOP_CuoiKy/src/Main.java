public class Main {
    public static void main(String[] args) {
        Student a = new Student("Dương", 20, 1.8f, "HCMUTE");
        System.out.println(a.getAge());
        a.setAge(19);
        System.out.println(a.getAge());
        a.setAge(-10);
        System.out.println(a.getAge());
    }
}