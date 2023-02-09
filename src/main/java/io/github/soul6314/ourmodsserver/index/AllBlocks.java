package io.github.soul6314.ourmodsserver.index;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.contraptions.components.motor.CreativeMotorBlock;
import com.simibubi.create.content.contraptions.components.motor.CreativeMotorGenerator;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.simibubi.create.foundation.utility.Couple;
import com.tterrag.registrate.util.entry.BlockEntry;
import io.github.soul6314.ourmodsserver.OurModsServer;
import io.github.soul6314.ourmodsserver.groups.ModGroup;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CryingObsidianBlock;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MaterialColor;

import static com.simibubi.create.Create.REGISTRATE;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;


@SuppressWarnings("CommentedOutCode")
public class AllBlocks {
    private static final CreateRegistrate REGISTRATE = OurModsServer.registrate()
            .creativeModeTab(() -> ModGroup.MAIN);

    public static final BlockEntry<CryingObsidianBlock> WITHERED_OBSIDIAN =
            REGISTRATE.block("withered_obsidian", CryingObsidianBlock::new)
                    .initialProperties(() -> Blocks.CRYING_OBSIDIAN)
                    .properties(p -> p.requiresCorrectToolForDrops()
                            .strength(50.0F,360000.0F))
                    .item()
                    .transform(customItemModel())
                    .register();

    public static final BlockEntry<GlassBlock> WITHERED_GLASS =
            REGISTRATE.block("withered_glass", GlassBlock::new)
                .initialProperties(() -> Blocks.GLASS)
                .properties(p -> p.explosionResistance(360000.0F)
                        .noOcclusion())
                .item()
                .transform(customItemModel())
                .register();
    public static final BlockEntry<GlassBlock> HARDENED_GLASS =
            REGISTRATE.block("hardened_glass", GlassBlock::new)
                .initialProperties(() -> Blocks.GLASS)
                .properties(p -> p.explosionResistance(1200.0F)
                        .noOcclusion())
                .item()
                .transform(customItemModel())
                .register();

    public static void register() {
    }
}
