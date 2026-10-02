package keywords.SuperKey;

public class Main {
    public static void main(String[] args) {
            /* super = Refers to the parent class (subclass <- superclass)
            Used in constructors and method overriding
            Calls the parent constructor to initialize attributes */

            Person person = new Person("Tom", "Hiddle");
            Student student = new Student("Harry", "Potter", 3.25);
            Employee employee = new Employee("Daniel", "Victor", 2500);
                person.showName();
                student.showName();
                System.out.println(student.gpa);
                student.showGPA();
                employee.showSalary();
                employee.showName();
    }
}
