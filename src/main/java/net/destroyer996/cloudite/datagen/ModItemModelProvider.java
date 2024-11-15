package net.destroyer996.cloudite.datagen;

import net.destroyer996.cloudite.Cloudite;
import net.destroyer996.cloudite.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Cloudite.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CLOUDITE_TEMPLATE);
        simpleItem(ModItems.ORE_FINDER);
        simpleItem(ModItems.ORE_FINDER_VALUABLE);
        simpleItem(ModItems.CLOUDITE_SCRAP);
        simpleItem(ModItems.CLOUDITE_HELMET);
        simpleItem(ModItems.CLOUDITE_CHESTPLATE);
        simpleItem(ModItems.CLOUDITE_LEGGINGS);
        simpleItem(ModItems.CLOUDITE_BOOTS);
        simpleItem(ModItems.CLOUDITE_INGOT);
        simpleItem(ModItems.RAW_CLOUDITE);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Cloudite.MOD_ID, "item/" + item.getId().getPath()));
    }
}
