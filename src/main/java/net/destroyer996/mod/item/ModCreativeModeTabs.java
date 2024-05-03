package net.destroyer996.mod.item;

import net.destroyer996.mod.FirstMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CLOUDITE_ITEMS = CREATIVE_MODE_TABS.register("cloudite_items" , () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CLOUDITE.get()))
            .title(Component.translatable( "creativetab.cloudite_items"))
            .displayItems((itemDisplayParameters, output) -> {
                //all items added to this tab are added from here
                output.accept(ModItems.CLOUDITE.get());
                output.accept(ModItems.RAW_CLOUDITE.get());
            })
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
