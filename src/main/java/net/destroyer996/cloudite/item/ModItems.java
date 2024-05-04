package net.destroyer996.cloudite.item;

import net.destroyer996.cloudite.FirstMod;
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


    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);

    }
}
