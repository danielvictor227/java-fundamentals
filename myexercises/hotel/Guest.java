package myexercises.hotel;

public class Guest {
    private String name;
    private String document;

    Guest(String name, String document)
    {
        name = this.name;
        document = this.document;

        if(name.equals(null) || name.equals(""))
        {
            throw new IllegalArgumentException("Invalid Name");
        }
        
        if(document.equals(null) || document.equals(""))            // nao sei como comparar null para evitar NullpointerException, nao lembro na verdade. Irei manter sabendo que preciso trocar
        {
            throw new IllegalArgumentException("Invalid Document");
        }
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }
}
