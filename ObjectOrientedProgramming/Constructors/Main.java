package ObjectOrientedProgramming.Constructors;

public class Main {
    public static void main(String[] args) {
        /*
         * constructor = A special method to initialize objects
         * You can pass arguments to a contructor
         * and set up initial values
         */

        Student student = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Daniel", 20, 4.0);
        Student student3 = new Student("Bro", 30, 4.0);

        System.out.printf("%s, %d, %b\n", student.name, student.age, student.isEnrolled);
        System.out.printf("%s, %d, %b\n", student2.name, student2.age, student2.isEnrolled);
        System.out.printf("%s,%d,%b\n",student3.name, student3.age, student3.isEnrolled);

        student.study();
        student2.study();
        student3.study();
    }
}
