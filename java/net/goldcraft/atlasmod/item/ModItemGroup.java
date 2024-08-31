package net.goldcraft.atlasmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.goldcraft.atlasmod.AtlasMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ATLAS = FabricItemGroupBuilder.build(new Identifier(AtlasMod.MOD_ID, "atlas"),
            () -> new ItemStack(ModItems.ATLASITE_INGOT));
}
