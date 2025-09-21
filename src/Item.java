class Item {
    int id;
    String name;
    double price;
    String category;

    public Item(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;


    }
    public String toString(){
        return

                ("ID:"+id +"name:"+name+"price:"+price+"category:"+category) ;

    }
}


