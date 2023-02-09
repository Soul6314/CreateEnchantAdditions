package io.github.soul6314.ourmodsserver.groups;

import io.github.soul6314.ourmodsserver.OurModsServer;
import io.github.soul6314.ourmodsserver.index.AllBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModGroup {

    public static CreativeModeTab MAIN = FabricItemGroupBuilder.build(new ResourceLocation(OurModsServer.MODID, "main"), () -> new ItemStack(AllBlocks.WITHERED_OBSIDIAN.get()));

}
