package net.destroyer996.cloudite.item;

import net.destroyer996.cloudite.Cloudite;
import net.destroyer996.cloudite.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cloudite.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CLOUDITE_ITEMS = CREATIVE_MODE_TABS.register("cloudite_items", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CLOUDITE_INGOT.get()))
            .title(Component.translatable("creativetab.cloudite_items"))
            .displayItems((itemDisplayParameters, output) -> {
                //all items added to this tab are added from here
                output.accept(ModItems.RAW_CLOUDITE.get());
                output.accept(ModBlocks.EMPYREAN_DEBRIS.get());
                output.accept(ModItems.CLOUDITE_SCRAP.get());
                output.accept(ModItems.CLOUDITE_INGOT.get());
                output.accept(ModBlocks.CLOUDITE_BLOCK.get());
                output.accept(ModItems.CLOUDITE_TEMPLATE.get());

                output.accept(ModItems.CLOUDITE_HELMET.get());
                output.accept(ModItems.CLOUDITE_CHESTPLATE.get());
                output.accept(ModItems.CLOUDITE_LEGGINGS.get());
                output.accept(ModItems.CLOUDITE_BOOTS.get());

                output.accept(ModItems.CLOUDITE_SWORD.get());
                output.accept(ModItems.CLOUDITE_PICKAXE.get());
                output.accept(ModItems.CLOUDITE_AXE.get());
                output.accept(ModItems.CLOUDITE_SHOVEL.get());
                output.accept(ModItems.CLOUDITE_HOE.get());

                output.accept(ModItems.ORE_FINDER.get());
                output.accept(ModItems.ORE_FINDER_VALUABLE.get());

            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
