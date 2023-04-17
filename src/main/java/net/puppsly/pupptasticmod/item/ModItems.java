package net.puppsly.pupptasticmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.puppsly.pupptasticmod.PupptasticMod;

public class ModItems {
    public static final Item RAW_ROSE_QUARTZ = registerItem("raw_rose_quartz",
            new Item(new FabricItemSettings().group(ModItemGroup.ROSEQUARTZ)));
    public static final Item ROSE_QUARTZ = registerItem("rose_quartz",
            new Item(new FabricItemSettings().group(ModItemGroup.ROSEQUARTZ)));


    private static Item registerItem(String name, Item item) {
            return Registry.register(Registry.ITEM, new Identifier(PupptasticMod.MOD_ID, name), item);
        }

        public static void registerModItems() {
            PupptasticMod.LOGGER.debug("Registering Mod Items for " + PupptasticMod.MOD_ID);
        }
}
