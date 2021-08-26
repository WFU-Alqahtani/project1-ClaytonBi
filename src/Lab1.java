import java.util.ArrayList;//import ArrayList

public class Lab1 {

    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<Item>();//set up ArrayList to hold items
        ArrayList<Item> cart = new ArrayList<Item>();//set up ArrayList to contain the items in the cart

        //create object Bread with its itemName and itemPrice and add it to ArrayList
        Item Bread = new Item("Bread", 5.0);
        itemList.add(Bread);
        //create object Milk with its itemName and itemPrice and add it to ArrayList
        Item Milk = new Item("Milk", 8.0);
        itemList.add(Milk);
        //create object Steak with its itemName and itemPrice and add it to ArrayList
        Item Steak = new Item ("Steak", 11.5);
        itemList.add(Steak);
        //create object Chicken with its itemName and itemPrice and add it to ArrayList
        Item Chicken = new Item ("Chicken wing", 3.5);
        itemList.add(Chicken);
        //create object Salt with its itemName and itemPrice and add it to ArrayList
        Item Salt = new Item ("Salt", 2.5);
        itemList.add(Salt);
        //create object Tomato with its itemName and itemPrice and add it to ArrayList
        Item Tomato = new Item ("Tomato", 4);
        itemList.add(Tomato);
        //create object Banana with its itemName and itemPrice and add it to ArrayList
        Item Banana = new Item ("Banana", 4.5);
        itemList.add(Banana);
        //create object Apple with its itemName and itemPrice and add it to ArrayList
        Item Apple = new Item ("Apple", 4.5);
        itemList.add(Apple);
        //create object Potato with its itemName and itemPrice and add it to ArrayList
        Item Potato = new Item ("Potato", 6);
        itemList.add(Potato);
        //create object Sugar with its itemName and itemPrice and add it to ArrayList
        Item Sugar = new Item ("Sugar", 3.5);
        itemList.add(Sugar);

        System.out.println("Welcome, dear Command Line! Please enter the tokens.");
        System.out.println();
        //use a for loop to put the command line's corresponding items into the cart ArrayList
        for (int i = 0; i < args.length; ++i){
            int j;//j contains the token from the command line
            //try adding the token's corresponding item to cart
            try {
                j = Integer.parseInt(args[i]);
                cart.add(itemList.get(j));//add the corresponding item into cart
            }
            //the first catch statement tests whether the token represent an integer
            catch (NumberFormatException e1){
                System.out.println("\"" + args[i] + "\" is not a valid integer.");
            }
            //the second catch statement tests whether the integer value of the token
            // consistent with your Store
            catch (IndexOutOfBoundsException e2){
                System.out.println("We do not have an item of index " + args[i] + ".");
            }
        }


        double subtotal = 0.0;
        double total;
        String tax = "5%";
        double taxValue = 0.05;
        //print out receipt
        System.out.println();
        System.out.println("Receipt");
        System.out.println("=========================");
        System.out.println("Item              Price");
        //use a for loop to get the item name and price of every item from cart
        for (int i = 0; i < cart.size(); ++i){
            subtotal += cart.get(i).getItemPrice();
            //print out the item name and price in the chart
            System.out.printf("%-18s%-14.1f\n", cart.get(i).getItemName(), cart.get(i).getItemPrice());
        }
        //calculate total price
        total = (1 + taxValue) * subtotal;
        System.out.println("=========================");
        //print out sum
        System.out.println("(a) Subtotal: " + subtotal);
        System.out.println("(b) Sales Tax: " + tax);
        System.out.println("(c) Total: " + total);
    }
}
