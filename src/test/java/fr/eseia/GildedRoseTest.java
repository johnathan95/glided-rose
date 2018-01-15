package fr.eseia;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import fr.esiea.GildedRose;
import fr.esiea.Item;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

}
