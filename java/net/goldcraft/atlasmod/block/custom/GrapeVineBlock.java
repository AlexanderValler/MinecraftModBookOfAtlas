package net.goldcraft.atlasmod.block.custom;

import net.goldcraft.atlasmod.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class GrapeVineBlock extends CropBlock {
    public GrapeVineBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.GILDED_SEED;
    }
}
