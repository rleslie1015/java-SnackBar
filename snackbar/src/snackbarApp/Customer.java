package snackbarApp;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public double addCash(double cashAdd)
    {
        return this.cashOnHand += cashAdd;
    }

    public void buy(double total)
    {
        this.cashOnHand -= total;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public double getCashOnHand()
    {
        return cashOnHand;
    }
}