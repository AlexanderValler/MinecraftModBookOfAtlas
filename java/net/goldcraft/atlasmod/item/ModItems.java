package net.goldcraft.atlasmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.goldcraft.atlasmod.AtlasMod;
import net.goldcraft.atlasmod.block.ModBlocks;
import net.goldcraft.atlasmod.item.custom.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ATLASITE_INGOT = registerItem("atlasite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS)));

    public static final Item GILDED_BERRIES = registerItem("gilded_berries",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS).food(ModFoodComponents.GILDED_BERRIES)));

    public static final Item GILDED_SEED = registerItem("gilded_seed",
            new AliasedBlockItem(ModBlocks.GRAPE_VINE, new FabricItemSettings().group(ModItemGroup.ATLAS)));

    public static final Item GILDED_FLESH = registerItem("gilded_flesh",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS).food(ModFoodComponents.GILDED_FLESH)));

    public static final Item GILDED_BEEF = registerItem("gilded_beef",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS).food(ModFoodComponents.GILDED_BEEF)));

    public static final Item GILDED_BERRY_SOUP = registerItem("gilded_berry_soup",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS).food(ModFoodComponents.GILDED_BERRY_SOUP)));

    public static final Item GILDED_HEART = registerItem("gilded_heart",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS).food(ModFoodComponents.GILDED_HEART)));

    //////////////////Tools//////////////////
    public static final Item ATLASITE_SWORD = registerItem("atlasite_sword",
            new ModSlownessSwordItem(ModToolMaterials.ATLASITE, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.ATLAS)));
    public static final Item ATLASITE_AXE = registerItem("atlasite_axe",
            new ModAxeItem(ModToolMaterials.ATLASITE, 3, 1f,
                    new FabricItemSettings().group(ModItemGroup.ATLAS)));
    public static final Item ATLASITEL_HOE = registerItem("atlasite_hoe",
            new ModHoeItem(ModToolMaterials.ATLASITE, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.ATLAS)));
    public static final Item ATLASITE_SHOVEL = registerItem("atlasite_shovel",
            new ShovelItem(ModToolMaterials.ATLASITE, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.ATLAS)));
    public static final Item ATLASITE_PICKAXE = registerItem("atlasite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ATLASITE, 1, 0f,
                    new FabricItemSettings().group(ModItemGroup.ATLAS)));
    public static final Item GOLDCRAFT_BOW = registerItem("goldcraft_bow",
            new BowItem(new FabricItemSettings().group(ModItemGroup.ATLAS).maxDamage(640)));
    public static final Item ATLASITE_AND_OBSIDIAN = registerItem("atlasite_and_obsidian",
            new FlintAndSteelItem(new FabricItemSettings().group(ModItemGroup.ATLAS)));

    //////////////////////Armor////////////////
    public static final Item ATLASITE_HELMET = registerItem("atlasite_helmet",
            new ModArmorItem(ModArmorMaterials.ATLASITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ATLAS)));
    public static final Item ATLASITE_CHESTPLATE = registerItem("atlasite_chestplate",
            new ArmorItem(ModArmorMaterials.ATLASITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.ATLAS)));
    public static final Item ATLASITE_LEGGINGS = registerItem("atlasite_leggings",
            new ArmorItem(ModArmorMaterials.ATLASITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.ATLAS)));
    public static final Item ATLASITE_BOOTS = registerItem("atlasite_boots",
            new ArmorItem(ModArmorMaterials.ATLASITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.ATLAS)));

    ////////////////////Other/////////////////
    public static final Item MAGIC_MYTHRIL_DUST = registerItem("magic_mythril_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS)));

    public static final Item ATLAS_SHARD = registerItem("atlas_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS)));

    public static final Item ATLAS_TOME = registerItem("atlas_tome",
            new BookItem(new FabricItemSettings().group(ModItemGroup.ATLAS)));

    public static final Item GILDED_BONE = registerItem("gilded_bone",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS)));

    public static final Item GILDED_CRYSTAL = registerItem("gilded_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS)));

    public static final Item GILDED_FABRIC = registerItem("gilded_fabric",
            new Item(new FabricItemSettings().group(ModItemGroup.ATLAS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AtlasMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AtlasMod.LOGGER.info("Registering Mod Items for " + AtlasMod.MOD_ID);
    }
}
