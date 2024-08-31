package net.goldcraft.atlasmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.goldcraft.atlasmod.AtlasMod;
import net.goldcraft.atlasmod.block.custom.*;
import net.goldcraft.atlasmod.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {
    public static final Block ATLASITE_BLOCK = registerBlock("atlasite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), ModItemGroup.ATLAS,
            "tooltip.atlasmod.atlasite_block");

    public static final Block ATLASITE_ORE = registerBlock("atlasite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.ATLAS);

    public static final Block DEEPSLATE_ATLASITE_ORE = registerBlock("deepslate_atlasite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.ATLAS);

    //////////Special Blocks///////////////
    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool()), ModItemGroup.ATLAS);

    public static final Block ATLASITE_LAMP = registerBlock("atlasite_lamp",
            new AtlasiteLampBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(1.0f).requiresTool()
                    .luminance((state) -> state.get(AtlasiteLampBlock.CLICKED) ? 15 : 0)), ModItemGroup.ATLAS);

    //////////Building Blocks//////////////////
    public static final Block ATLASITE_BUTTON = registerBlock("atlasite_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(1.0f).requiresTool().noCollision()), ModItemGroup.ATLAS);
    public static final Block ATLASITE_BRICK_BUTTON = registerBlock("atlasite_brick_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(1.0f).requiresTool().noCollision()), ModItemGroup.ATLAS);

    public static final Block ATLASITE_PRESSURE_PLATE = registerBlock("atlasite_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL)
                    .strength(1.0f).requiresTool()), ModItemGroup.ATLAS);
    public static final Block ATLASITE_BRICK_PRESSURE_PLATE = registerBlock("atlasite_brick_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL)
                    .strength(1.0f).requiresTool()), ModItemGroup.ATLAS);

    public static final Block ATLASITE_BRICK_FENCE = registerBlock("atlasite_brick_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ATLAS);

    public static final Block ATLASITE_BRICK_FENCE_GATE = registerBlock("atlasite_brick_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ATLAS);

    public static final Block ATLASITE_BRICK_WALL = registerBlock("atlasite_brick_wall",
            new WallBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ATLAS);

    public static final Block ATLASITE_SLAB = registerBlock("atlasite_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(3.0f).requiresTool()), ModItemGroup.ATLAS);
    public static final Block ATLASITE_BRICK_SLAB = registerBlock("atlasite_brick_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ATLAS);

    public static final Block ATLASITE_BRICK_STAIRS = registerBlock("atlasite_brick_stairs",
            new ModStairsBlock(ModBlocks.ATLASITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.ATLAS);

    public static final Block ATLASITE_DOOR = registerBlock("atlasite_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.ATLAS);

    public static final Block KAUPEN_TRAPDOOR = registerBlock("kaupen_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.ATLAS);

    public static final Block ATLASITE_WINDOW = registerBlock("atlasite_window",
            new GlassBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(3.0f).nonOpaque()), ModItemGroup.ATLAS);

    public static final Block ATLASITE_BRICK = registerBlock("atlasite_brick",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.ATLAS);

    ///////////Other ///////////////////////
    public static final Block GILDED_BRUSH = registerBlock("gilded_brush",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.DANDELION).strength(1.0f).nonOpaque()), ModItemGroup.ATLAS);

    public static final Block POTTED_GILDED_BRUSH = registerBlockWithoutBlockItem("potted_gilded_brush",
            new FlowerPotBlock(ModBlocks.GILDED_BRUSH,
                    FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()), ModItemGroup.ATLAS);

    public static final Block GRAPE_VINE = registerBlockWithoutBlockItem("grape_vine",
            new GrapeVineBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()), ModItemGroup.ATLAS);




    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(AtlasMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(AtlasMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText(tooltipKey));
                }
            });
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(AtlasMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(AtlasMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(AtlasMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        AtlasMod.LOGGER.info("Registering ModBlocks for " + AtlasMod.MOD_ID);
    }
}
