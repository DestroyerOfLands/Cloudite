package net.destroyer996.cloudite.datagen;

import net.destroyer996.cloudite.Cloudite;
import net.destroyer996.cloudite.block.ModBlocks;
import net.destroyer996.cloudite.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Cloudite.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.EMPYREAN_DEBRIS.get()).addTag(Tags.Blocks.ORES);
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.EMPYREAN_DEBRIS.get(),
                        ModBlocks.CLOUDITE_BLOCK.get()).addTag(Tags.Blocks.ORES);
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.EMPYREAN_DEBRIS.get());
    }

}
