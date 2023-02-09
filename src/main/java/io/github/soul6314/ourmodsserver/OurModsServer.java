package io.github.soul6314.ourmodsserver;

import com.simibubi.create.content.curiosities.armor.DivingBootsItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;

import io.github.fabricators_of_create.porting_lib.event.common.LivingEntityEvents;
import io.github.soul6314.ourmodsserver.index.AllBlocks;
import io.github.soul6314.ourmodsserver.index.AllItems;
import io.github.soul6314.ourmodsserver.item.armor.SlimeArmorItem;
import net.fabricmc.api.ModInitializer;

public class OurModsServer implements ModInitializer {

    public static final String MODID = "ourmodsserver";
    //private static final NonNullSupplier<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(OurModsServer.MODID);
    private static final NonNullSupplier<CreateRegistrate> REGISTRATE =
            NonNullSupplier.lazy(() -> CreateRegistrate.create(OurModsServer.MODID));

    @Override
    public void onInitialize() {
        AllBlocks.register();
        AllItems.register();
        REGISTRATE.get().register();
    }


    public static CreateRegistrate registrate() {
        return REGISTRATE.get();
    }
}

