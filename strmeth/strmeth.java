public class strmeth
{
    public static void main(String[] args)
    {
        String name = "              Bro Code";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        name = name.trim();
        name = name.replace("o", "a");
        name = name.toUpperCase();
        name = name.toLowerCase();
        name.isEmpty();
        System.out.println(name);

        if(name.isEmpty())
        {
            System.out.println("Your name is Empty");
        }
        if(name.contains(" "))
        {
            System.out.println("Your name contains a space");
        }

        else{
            System.out.println("Your name DOES't CONTAINS SPACES");
        }

        if(name.equalsIgnoreCase("password"))
        {
            System.out.println("Your name cant'be password");
        }
        else
        {
            System.out.println("Hello " + name);
        }

        
    }
}