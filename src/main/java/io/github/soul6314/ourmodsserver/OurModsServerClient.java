package io.github.soul6314.ourmodsserver;

import io.github.soul6314.ourmodsserver.index.AllBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.RenderType;

public class OurModsServerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        // .getTranslucent()
        RenderType glinttranslucent = RenderType.glintTranslucent();
        RenderType translucent = RenderType.translucent();
        // RenderType cutout = RenderType.cutoutMipped();

        BlockRenderLayerMap.INSTANCE.putBlock(AllBlocks.WITHERED_GLASS.get(), translucent);

        BlockRenderLayerMap.INSTANCE.putBlock(AllBlocks.HARDENED_GLASS.get(),translucent);
    }
}
