package net.destroyer996.cloudite.item.custom;

import net.destroyer996.cloudite.block.ModBlocks;
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

public class ValuableOreFinderItem extends Item {
    public ValuableOreFinderItem(Properties properties){
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
                if(isValOreBlock(state)){
                    outputValOreCoordinates(postitionClicked.below(i),player,state.getBlock());
                    foundblock = true;

                }
            }
            if(!foundblock){
                player.sendSystemMessage(Component.literal("No Valuable Ores Found"));
            }

        }
        context.getItemInHand().hurtAndBreak(1,context.getPlayer(), player -> player.broadcastBreakEvent(player.getUsedItemHand()));
        return InteractionResult.SUCCESS;

    }

    private void outputValOreCoordinates(BlockPos blockPos, Player player, Block block) {
        player.sendSystemMessage(Component.literal(I18n.get(block.getDescriptionId()) + " at " + "(" + blockPos.getX() + ','+ blockPos.getY() + ','+ blockPos.getZ() + ')'));

    }

    private boolean isValOreBlock(BlockState state) {
        return state.is(Blocks.GOLD_ORE) || state.is(Blocks.DIAMOND_ORE) || state.is(Blocks.ANCIENT_DEBRIS)  || state.is(Blocks.EMERALD_ORE) || state.is(Blocks.DEEPSLATE_GOLD_ORE) || state.is(Blocks.DEEPSLATE_DIAMOND_ORE) || state.is(Blocks.DEEPSLATE_EMERALD_ORE);
    }
}
