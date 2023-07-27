package gildedrose;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseApplication {

    public void run() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Sulfuras, Hand of Ragnaros", -1, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49));
        // this Conjured item doesn't yet work properly
        items.add(new Item("Conjured Mana Cake", 3, 6));

        GildedRose app = new GildedRose(items.toArray(Item[]::new));

        System.out.println("OMGHAI!");

        for (int day = 0; day <= 30; day++) {
            System.out.println("-------- day " + day + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {

                System.out.println(item.toString());
            }
            System.out.println();

            app.updateQuality();
        }
    }
}
