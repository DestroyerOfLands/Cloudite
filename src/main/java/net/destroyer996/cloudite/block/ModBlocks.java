package net.destroyer996.cloudite.block;

import net.destroyer996.cloudite.Cloudite;
import net.destroyer996.cloudite.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Cloudite.MOD_ID);

    public static final RegistryObject<Block> CLOUDITE_BLOCK = registerBlock("cloudite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.NETHERITE_BLOCK).explosionResistance(1200f)));

    public static final RegistryObject<Block> EMPYREAN_DEBRIS = registerBlock("raw_cloudite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.ANCIENT_DEBRIS).explosionResistance(1200f)));

    public static final RegistryObject<Block> CLOUD = registerBlock("cloud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.WOOL).explosionResistance(1200f)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}