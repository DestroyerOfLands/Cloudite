package net.destroyer996.cloudite.item;

import net.destroyer996.cloudite.Cloudite;
import net.destroyer996.cloudite.item.custom.OreFinderItem;
import net.destroyer996.cloudite.item.custom.ValuableOreFinderItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.destroyer996.cloudite.upgrade.ClouditeSmithingTemplate;





public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Cloudite.MOD_ID);

    public static final RegistryObject<Item> CLOUDITE_INGOT = ITEMS.register("cloudite",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> RAW_CLOUDITE = ITEMS.register("raw_cloudite",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> CLOUDITE_SCRAP = ITEMS.register("cloudite_scrap",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ORE_FINDER = ITEMS.register("ore_finder",
            () -> new OreFinderItem(new Item.Properties().durability(50).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ORE_FINDER_VALUABLE = ITEMS.register("ore_finder_valuable",
            () -> new ValuableOreFinderItem(new Item.Properties().durability(25).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> CLOUDITE_TEMPLATE = ITEMS.register("cloudite_template",
            () -> ClouditeSmithingTemplate.createClouditeUpgradeTemplate());

    public static final RegistryObject<Item> CLOUDITE_PICKAXE = ITEMS.register("cloudite_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, (new Item.Properties()).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CLOUDITE_AXE = ITEMS.register("cloudite_axe",
            () -> new AxeItem(Tiers.NETHERITE, 1, -2.8F, (new Item.Properties()).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CLOUDITE_SHOVEL = ITEMS.register("cloudite_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, 1, -2.8F, (new Item.Properties()).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CLOUDITE_HOE = ITEMS.register("cloudite_hoe",
            () -> new HoeItem(Tiers.NETHERITE, 1, -2.8F, (new Item.Properties()).fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CLOUDITE_SWORD = ITEMS.register("cloudite_sword",
            () -> new SwordItem(Tiers.NETHERITE, 1, -2.8F, (new Item.Properties()).fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> CLOUDITE_HELMET = ITEMS.register("cloudite_helmet",
            ()-> new ArmorItem(ModArmourMaterials.CLOUDITE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CLOUDITE_CHESTPLATE = ITEMS.register("cloudite_chestplate",
            ()-> new ArmorItem(ModArmourMaterials.CLOUDITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CLOUDITE_LEGGINGS = ITEMS.register("cloudite_leggings",
            ()-> new ArmorItem(ModArmourMaterials.CLOUDITE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CLOUDITE_BOOTS = ITEMS.register("cloudite_boots",
            ()-> new ArmorItem(ModArmourMaterials.CLOUDITE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().rarity(Rarity.RARE)));



    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);

    }
}
