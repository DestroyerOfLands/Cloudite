package net.destroyer996.cloudite.item.custom;

import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class OreFinderItem extends Item {
    public OreFinderItem(Properties properties){
        super(properties);

    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if(!context.getLevel().isClientSide()){
            BlockPos postitionClicked = context.getClickedPos();
            Player player = context.getPlayer();
            boolean foundblock = false;
            for(int i=0;i<=postitionClicked.getY()+64;i++){
                BlockState state = context.getLevel().getBlockState(postitionClicked.below(i));
                if(isOreBlock(state)){
                    outputOreCoordinates(postitionClicked.below(i),player,state.getBlock());
                    foundblock = true;

                }
            }
            if(!foundblock){
                player.sendSystemMessage(Component.literal("No Regular Ores Found"));
            }

        }
        context.getItemInHand().hurtAndBreak(1,context.getPlayer(), player -> player.broadcastBreakEvent(player.getUsedItemHand()));
        return InteractionResult.SUCCESS;

    }

    private void outputOreCoordinates(BlockPos blockPos, Player player, Block block) {
        player.sendSystemMessage(Component.literal(I18n.get(block.getDescriptionId()) + " at " + "(" + blockPos.getX() + ','+ blockPos.getY() + ','+ blockPos.getZ() + ')'));

    }

    private boolean isOreBlock(BlockState state) {
        return state.is(Blocks.IRON_ORE) || state.is(Blocks.COPPER_ORE) || state.is(Blocks.NETHER_QUARTZ_ORE)  || state.is(Blocks.COAL_ORE) || state.is(Blocks.LAPIS_ORE) || state.is(Blocks.REDSTONE_ORE) || state.is(Blocks.DEEPSLATE_IRON_ORE) || state.is(Blocks.DEEPSLATE_COPPER_ORE)  || state.is(Blocks.DEEPSLATE_COAL_ORE) || state.is(Blocks.DEEPSLATE_LAPIS_ORE) || state.is(Blocks.DEEPSLATE_REDSTONE_ORE);
    }
}
