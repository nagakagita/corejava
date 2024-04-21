import java.util.*;

public class Program {
    public ArrayList<Item> Items;

    public static void main(String[] args)
    {
        System.out.println("OMGHAI!");

        var app = new Program();
        app.Items = getItems();

        System.out.println("If you want to use new functionality press 123 ");
        var inputScan = new Scanner(System.in);
        Integer input = Integer.valueOf(inputScan.nextLine());
        if(input == 123){
            Order order = getOrder();
            StoreStock storeStock = executeOrder(order);
            for(Map.Entry<Item,Integer> stockItem :storeStock.getStockMap().entrySet()){
                System.out.println("stockname: " +stockItem.getKey().getName() +"  Available quantity: "+stockItem.getValue());
            }

        }else{
            app.UpdateQuality();
            for(Item item:app.Items){
                System.out.println("getName: "+item.getName());
                System.out.println("getSellIn: "+item.getSellIn());
                System.out.println("getQuality: "+item.getQuality());
            }
            System.out.println("Press enter to exit...");
            var scan = new Scanner(System.in);
            scan.nextLine();
            scan.close();
        }
    }

    private static ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));
        return items;
    }

    private static StoreStock executeOrder(Order order) {
        StoreStock storeStock = getStock();
        for(Map.Entry<Item,Integer> stockItem :storeStock.getStockMap().entrySet()){
            for(Map.Entry<Item,Integer> orderedItem :order.getOrderMap().entrySet()){
                if(stockItem.getKey().getName().equalsIgnoreCase(orderedItem.getKey().getName())){
                    stockItem.setValue(stockItem.getValue()-orderedItem.getValue());
                }
            }
        }
        return storeStock;
    }
    private static Order getOrder() {
        Order order = new Order();
        Map<Item,Integer> orderMap = new HashMap<>();
        Scanner input= new Scanner(System.in);
        do{
            System.out.println("Stock details are below and Please press item number to enter the quantity:");
            System.out.println("item 1:   +5 Dexterity Vest");
            System.out.println("item 2:   Aged Brie");
            System.out.println("item 3:   Elixir of the Mongoose");
            System.out.println("item 4:   Sulfuras, Hand of Ragnaros");
            System.out.println("item 5:   Backstage passes to a TAFKAL80ETC concert");
            System.out.println("item 6:   Conjured Mana Cake");
            switch (input.nextInt()){
                case 1:
                    System.out.println("How many items do you need for this item +5 Dexterity Vest");
                    orderMap.put(new Item("+5 Dexterity Vest",1,1), input.nextInt());
                    break;
                case 2:
                    System.out.println("How many items do you need for this item Aged Brie");
                    orderMap.put(new Item("Aged Brie",1,1), input.nextInt());
                    break;
                case 3:
                    System.out.println("How many items do you need for this item Elixir of the Mongoose");
                    orderMap.put(new Item("Elixir of the Mongoose",1,1), input.nextInt());
                    break;
                case 4:
                    System.out.println("How many items do you need for this item Sulfuras, Hand of Ragnaros");
                    orderMap.put(new Item("Sulfuras, Hand of Ragnaros",1,1), input.nextInt());
                    break;
                case 5:
                    System.out.println("How many items do you need for this item Backstage passes to a TAFKAL80ETC concert");
                    orderMap.put(new Item("Backstage passes to a TAFKAL80ETC concert",1,1), input.nextInt());
                    break;
                case 6:
                    System.out.println("How many items do you need for this item +5 Dexterity Vest");
                    orderMap.put(new Item("Conjured Mana Cake",1,1), input.nextInt());
                    break;
            }
            System.out.println("do you want to continue your order please press yes otherwise NO");

        }while(input.next().equalsIgnoreCase("yes"));
        order.setOrderMap(orderMap);
        return order;
    }

    private static StoreStock getStock() {
        StoreStock storeStock = new StoreStock();
        Map<Item, Integer> stockMap = new HashMap<>();
        stockMap.put(new Item("+5 Dexterity Vest",1,1), 50);
        stockMap.put(new Item("Aged Brie",1,1), 50);
        stockMap.put(new Item("Elixir of the Mongoose",1,1), 50);
        stockMap.put(new Item("Sulfuras, Hand of Ragnaros",1,1), 50);
        stockMap.put(new Item("Backstage passes to a TAFKAL80ETC concert",1,1), 50);
        stockMap.put(new Item("Conjured Mana Cake",1,1), 50);
        storeStock.setStockMap(stockMap);
        return storeStock;
    }

    public void UpdateQuality()
    {
        for (var i = 0; i < Items.size(); i++)
        {
            var item = Items.get(i);
            if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert"))
            {
                if (item.getQuality() > 0)
                {
                    if (!item.getName().equals("Sulfuras, Hand of Ragnaros"))
                    {
                        item.setQuality(item.getQuality() - 1);
                    }
                }
            }
            else
            {
                if (item.getQuality() < 50)
                {
                    item.setQuality(item.getQuality() + 1);

                    if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert"))
                    {
                        if (item.getSellIn() < 11)
                        {
                            if (item.getQuality() < 50)
                            {
                                item.setQuality(item.getQuality() + 1);
                            }
                        }

                        if (item.getSellIn() < 6)
                        {
                            if (item.getQuality() < 50)
                            {
                                item.setQuality(item.getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (!item.getName().equals("Sulfuras, Hand of Ragnaros"))
            {
                item.setSellIn(item.getSellIn() - 1);
            }
// "Conjured" items degrade in Quality twice as fast as normal items
            if (item.getName().contains("Conjured"))
            {
                if(item.getSellIn() - 1>0)
                item.setSellIn(item.getSellIn() - 1);
                if(item.getQuality() -2 >0)
                item.setQuality(item.getQuality()-2);
            }

            if (item.getSellIn() < 0)
            {
                if (!item.getName().equals("Aged Brie"))
                {
                    if (!item.getName().equals("Backstage passes to a TAFKAL80ETC concert"))
                    {
                        if (item.getQuality() > 0)
                        {
                            if (!item.getName().equals("Sulfuras, Hand of Ragnaros"))
                            {
                                item.setQuality(item.getQuality() - 1);
                            }
                        }
                    }
                    else
                    {
                        item.setQuality(item.getQuality() - item.getQuality());
                    }
                }
                else
                {
                    if (item.getQuality() < 50)
                    {
                        item.setQuality(item.getQuality() + 1);
                    }
                }
            }
        }
    }
}