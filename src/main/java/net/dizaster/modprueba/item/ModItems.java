package net.dizaster.modprueba.item;

import net.dizaster.modprueba.ModPrueba;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    /* ITEMS TO ADD */
    public static final Item ONION = registerItem("onion", new Item(new Item.Settings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ModPrueba.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ModPrueba.LOGGER.info("Registering Mod Items for " + ModPrueba.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ONION);
            fabricItemGroupEntries.add(TOMATO);
        });
    }


}
