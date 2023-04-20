package net.puppsly.pupptasticmod;

import net.fabricmc.api.ModInitializer;
import net.puppsly.pupptasticmod.block.ModBlocks;
import net.puppsly.pupptasticmod.item.ModItems;
import net.puppsly.pupptasticmod.world.feature.ModConfiguredFeatures;
import net.puppsly.pupptasticmod.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PupptasticMod implements ModInitializer {
	public static final String MOD_ID = "pupptasticmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfigureFeatures();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


		ModOreGeneration.generateOres();




	}
}
