import java.util.ArrayList;//import ArrayList

public class Lab1 {

    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<Item>();//set up ArrayList to hold items
        ArrayList<Item> cart = new ArrayList<Item>();//set up ArrayList to contain the items in the cart

        //create object bread with its itemName and itemPrice and add it to ArrayList
        Item Bread = new Item("Bread", 5.0);
        itemList.add(Bread);

        //use a for loop to put the command line's corresponding items into the cart ArrayList
        for (int i = 0; i < args.length; ++i){
            int j;//j contains the token from the command line
            //the outer try catch statement tests whether the token represent an integer
            try {
                j = Integer.parseInt(args[i]);
                //the inner try catch statement tests whether the integer value of the token
                // consistent with your Store
                try{
                    cart.add(itemList.get(j));//add the corresponding item into cart
                }
                catch (IndexOutOfBoundsException e2){
                    System.out.println("We do not have an item of index " + args[i] + ".");
                }
            }
            catch(NumberFormatException e1){
                System.out.println("\"" + args[i] + "\" is not a valid integer.");
            }
        }

        System.out.println("Fix me!");
    }
}
