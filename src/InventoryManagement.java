import java.util.ArrayList;

public class InventoryManagement{
    public static void main(String[] args){
        ArrayList<Item> inventory= new ArrayList<>();
        inventory.add(new Item(1,"HP", 1200, "Laptops"));
        inventory.add (new Item(2,"Lacoste", 2500, "T-shirts"));
        inventory.add(new Item(2, "Nike", 3000, "shoes"));
        inventory.add(new Item(4,"Techno",1500, "phones"));
        //printing all items in the inventory
        System.out.println("All items");
        for (Item item: inventory){
            System.out.println(item);
        }
        //The most expensive item
        Item mostExpensive=inventory.get(0);
        for(Item item:inventory){
            if (item.price> mostExpensive.price ){
                mostExpensive=item;
            }
        }
        System.out.println("The most expensiveItem: " + mostExpensive);

        int removedId=2;// remove item with Id =2
        Item toRemove=null;
        for (Item item: inventory){
            if (item.id==removedId){
                toRemove=item;

            }

        }
        if(toRemove != null){
            inventory.remove(toRemove);
        }



    }
}