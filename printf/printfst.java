public class printfst
{
    public static void main(String[] args) {
        String name = "Spongebob"; 
        char firtLetter = 's';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firtLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.1f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);     

        System.out.printf("%s is %d years old", name, age);
    }
}