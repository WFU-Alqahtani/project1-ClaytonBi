public class Item {
    private String itemName;
    private double itemPrice;

    //default constructor
    public Item(){
        itemName = "unknown";
        itemPrice = 0.0;
    }

    //default constructor with the input of the item's name and price
    public Item(String itemName, double itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    //method to set up private String itemName with the parameter String itemName
    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    //method to set up private double itemPrice with the parameter double itemPrice
    public void setItemPrice(double itemPrice){
        this.itemPrice = itemPrice;
    }

    //method to get itemName
    public String getItemName(){
        return itemName;
    }

    //method to get itemPrice
    public double getItemPrice(){
        return itemPrice;
    }
}
