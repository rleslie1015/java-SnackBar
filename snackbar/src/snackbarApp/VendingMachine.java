package snackbarApp;

public class VendingMachine
{
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name; 
    }
}