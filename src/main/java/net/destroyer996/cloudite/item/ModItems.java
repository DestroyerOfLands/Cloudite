package net.destroyer996.cloudite.item;

import net.destroyer996.cloudite.FirstMod;
import net.destroyer996.cloudite.item.custom.OreFinderItem;
import net.destroyer996.cloudite.item.custom.ValuableOreFinderItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> CLOUDITE = ITEMS.register("cloudite",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_CLOUDITE = ITEMS.register("raw_cloudite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CLOUDITE_SCRAP = ITEMS.register("cloudite_scrap",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORE_FINDER = ITEMS.register("ore_finder",
            () -> new OreFinderItem(new Item.Properties().durability(50)));

    public static final RegistryObject<Item> ORE_FINDER_VALUABLE = ITEMS.register("ore_finder_valuable",
            () -> new ValuableOreFinderItem(new Item.Properties().durability(25)));

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);

    }
}
