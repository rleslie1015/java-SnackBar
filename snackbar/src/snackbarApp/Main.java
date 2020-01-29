package snackbarApp;

public class Main
{
    private static void workWithData()
    {
        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        VendingMachine vendingMachine1 = new VendingMachine("Food");
        VendingMachine vendingMachine2 = new VendingMachine("Drink");
        VendingMachine vendingMachine3 = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, vendingMachine1.getId());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vendingMachine1.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.00, vendingMachine1.getId());
        Snack snack4 = new Snack("Soda", 24, 2.50, vendingMachine2.getId());
        Snack snack5 = new Snack("Water", 20, 2.75, vendingMachine2.getId());

        System.out.println("*** Customer 1 buys 3 of snack 4. ***");
        System.out.println(customer1.getName() + " buys 3 " + snack4.getName());
        double customerSpends = 3 * snack4.getCost();
        customer1.buy(customerSpends);
        System.out.println(customer1.getName() + " has " + customer1.getCashOnHand());
        snack4.buy(3);
        System.out.println("There are " + snack4.getQuantity() + " sodas left." );
        System.out.println();

        System.out.println("*** Customer buys 1 of snack 4. ***");
        customer1.buy(snack3.getCost());
        snack3.buy(1);
        System.out.println(customer1.getName() + " has $" + customer1.getCashOnHand());
        System.out.println("There are " + snack3.getQuantity() + " pretzels left");
        System.out.println();

        System.out.println("*** Customer 2 buys 2 of snack 4 ***");
        customer2.buy(snack4.getTotal(2));
        snack4.buy(2);
        System.out.println(customer2.getName() + " has $" + customer2.getCashOnHand());
        System.out.println("There are " + snack4.getQuantity() + " sodas left");
        System.out.println();

        System.out.println("***Customer 1 finds $10***");
        customer1.addCash(10.00);
        System.out.println(customer1.getName() + " has $" + customer1.getCashOnHand());
        System.out.println();

        System.out.println("***Customer 1 buys 1 of snack 2.***");
        customer1.buy(snack2.getTotal(1));
        snack2.buy(1);
        System.out.println(customer1.getName() + " has $" + customer1.getCashOnHand());
        System.out.println("There are " + snack2.getQuantity() + " chocolate bars left");
        System.out.println();

        System.out.println("*** add 12 more ***");
        snack3.addQuantity(12);
        System.out.println("There are " + snack3.getQuantity() + " pretzels left");
        System.out.println();

        System.out.println("*** Customer 2 buys 3 of snack 3 ***");
        customer2.buy(snack3.getTotal(3));
        snack3.buy(3);
        System.out.println(customer2.getName() + " has $" + customer2.getCashOnHand());
        System.out.println("There are " + snack3.getQuantity() + " pretzels left");

        //stretch 
        System.out.println("**** stretch ****");
        System.out.println(snack1.toString());
        System.out.println(snack2);
        System.out.println(snack3);
        System.out.println(snack4);
        System.out.println(snack5);

        System.out.println("vendingmachine 1");
        System.out.println(vendingMachine1.getName());
        
    }

    public static void main(String[] args)
    {
        //start
        workWithData();
    }
}