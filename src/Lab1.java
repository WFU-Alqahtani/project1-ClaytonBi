import java.util.ArrayList;//import ArrayList

public class Lab1 {

    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<Item>();//set up ArrayList to hold items

        //create object bread with its itemName and itemPrice and add it to ArrayList
        Item Bread = new Item("Bread", 5.0);
        itemList.add(Bread);

        System.out.println("Fix me!");
    }
}
