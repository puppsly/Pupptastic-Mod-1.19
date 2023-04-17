package net.puppsly.pupptasticmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.puppsly.pupptasticmod.PupptasticMod;
import net.puppsly.pupptasticmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_ROSE_QUARTZ_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ROSE_QUARTZ_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_ROSE_QUARTZ_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHERRACK_ROSE_QUARTZ_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROSE_QUARTZ_ORE =
            ConfiguredFeatures.register("rose_quartz_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ROSE_QUARTZ_ORES, 8));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_ROSE_QUARTZ_ORE =
            ConfiguredFeatures.register("rose_quartz_ore", Feature.ORE, new OreFeatureConfig(NETHER_ROSE_QUARTZ_ORES, 14));



    public static void registerConfigureFeatures() {
        PupptasticMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + PupptasticMod. MOD_ID);
    }
}
