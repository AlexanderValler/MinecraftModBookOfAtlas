package net.goldcraft.atlasmod;

import net.fabricmc.api.ModInitializer;
import net.goldcraft.atlasmod.block.ModBlocks;
import net.goldcraft.atlasmod.item.ModItems;
import net.goldcraft.atlasmod.painting.ModPaintings;
import net.goldcraft.atlasmod.util.ModRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AtlasMod implements ModInitializer {
	public static final String MOD_ID = "atlasmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModPaintings.registerPaintings();

		ModRegistries.registerModStuffs();

	}
}
