package net.goldcraft.atlasmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.goldcraft.atlasmod.AtlasMod;
import net.goldcraft.atlasmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        AtlasMod.LOGGER.info("Registering Fuels for " + AtlasMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.GILDED_SEED, 200);
    }
}
