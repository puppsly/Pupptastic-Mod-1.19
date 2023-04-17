package net.puppsly.pupptasticmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.puppsly.pupptasticmod.PupptasticMod;
import net.puppsly.pupptasticmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ROSEQUARTZ);

    public static final Block ROSE_QUARTZ_ORE = registerBlock("rose_quartz_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(2, 5)), ModItemGroup.ROSEQUARTZ);

    public static final Block DEEPSLATE_ROSE_QUARTZ_ORE = registerBlock("deepslate_rose_quartz_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(2, 5)), ModItemGroup.ROSEQUARTZ);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(PupptasticMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(PupptasticMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks() {
        PupptasticMod.LOGGER.debug("Registering ModBlocks for " + PupptasticMod.MOD_ID);
    }
}