public class Person {
    private String name;
    private int age;
    private float height;


    public Person(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setName(String name){
        if(name.length() > 0 && name.length() <= 70){
            this.name = name;}
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if(age >=0 && age <= 100){
            this.age = age;
        }
    }
    public int getAge(){
        return this.age;
    }

    public void setHeight(float height){
        if(height>=0){
            this.height = height;}
    }
    public float getHeight(){
        return this.height;
    }

    public void getInfo(){
        System.out.println("Tên: " + this.name);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Chiều cao: " + this.height);
    }

}
