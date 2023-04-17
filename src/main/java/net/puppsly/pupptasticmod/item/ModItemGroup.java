package net.puppsly.pupptasticmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.puppsly.pupptasticmod.PupptasticMod;

public class ModItemGroup {
    public static final ItemGroup ROSEQUARTZ = FabricItemGroupBuilder.build(
            new Identifier(PupptasticMod.MOD_ID, "rose_quartz"), () -> new ItemStack(ModItems.ROSE_QUARTZ));
}
