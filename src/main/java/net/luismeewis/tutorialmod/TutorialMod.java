package net.luismeewis.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.luismeewis.tutorialmod.block.ModBlocks;
import net.luismeewis.tutorialmod.item.ModItems;
import net.luismeewis.tutorialmod.painting.ModPaintings;
import net.luismeewis.tutorialmod.villager.ModVillagers;
import net.luismeewis.tutorialmod.world.feature.ModConfiguredFeatures;
import net.luismeewis.tutorialmod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();

		ModPaintings.registerPaintings();
		ModOreGeneration.generateOres();

	}
}
