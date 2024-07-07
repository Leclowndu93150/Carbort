package com.leclowndu93150.carbort.registry;

import com.leclowndu93150.carbort.Carbort;
import com.leclowndu93150.carbort.common.items.PartyPickaxeItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Carbort.MODID);

    public static final DeferredItem<Item> PARTY_PICKAXE = ITEMS.register("party_pickaxe", () -> new PartyPickaxeItem(new Item.Properties()));

}
