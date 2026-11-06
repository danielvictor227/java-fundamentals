package myexercises.library;

public class Member {
    private String name;
    private int age;

    Member(String name, int age)
    {
        this.name = name;
        this.age = age;
        
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
