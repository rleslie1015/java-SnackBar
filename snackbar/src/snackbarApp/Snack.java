package snackbarApp;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int qauntity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
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
    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }
    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public void addQuantity(int num)
    {
        this.quantity += num;
    }
    public void buy(int num)
    {
        this.quantity -= num;
    }
    public double getTotal(double cost)
    {
        return this.cost * cost;
    }

    @Override
    public String toString()
    {
        String rtnString =  "Snack: " + name + "\n" +
                            "Vanding Machine Name: " + vendingMachineId + "\n"  +
                            "Quantity on hand " + quantity + "\n" +
                            "Total cost of all the quantities of this snack on hand: " + quantity * cost + "\n";

        return rtnString;
    }
}
