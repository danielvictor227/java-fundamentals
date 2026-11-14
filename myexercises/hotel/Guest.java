package myexercises.hotel;

public class Guest {
    private String name;
    private String document;

    Guest(String name, String document)
    {
        this.name = name;
        this.document = document;

        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Invalid Name");
        }
        
        if(document == null || document.isBlank())            // nao sei como comparar null para evitar NullpointerException, nao lembro na verdade. Irei manter sabendo que preciso trocar
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
