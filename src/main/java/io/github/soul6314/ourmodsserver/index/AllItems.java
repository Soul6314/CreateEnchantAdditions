package io.github.soul6314.ourmodsserver.index;

import com.simibubi.create.content.contraptions.itemAssembly.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import io.github.soul6314.ourmodsserver.groups.ModGroup;
import io.github.soul6314.ourmodsserver.item.armor.SlimeArmorItem;
import net.minecraft.world.item.Item;

import static io.github.soul6314.ourmodsserver.OurModsServer.registrate;

@SuppressWarnings({"unused", "CommentedOutCode"})
public class AllItems {

    private static final CreateRegistrate REGISTRATE = registrate()
            .creativeModeTab(() -> ModGroup.MAIN);

    public static final ItemEntry<Item> ADVANCED_ALLOY_ITEM =
            REGISTRATE.item("advanced_alloy", Item::new)
                    .properties(p -> p.stacksTo(32))
                    .properties(p -> p.fireResistant())
                    .register();

    public static final ItemEntry<Item> ADVANCED_ALLOY_SHEET_ITEM =
            REGISTRATE.item("advanced_alloy_sheet", Item::new)
                    .properties(p -> p.stacksTo(32))
                    .properties(p -> p.fireResistant())
                    .register();

    public static final ItemEntry<SequencedAssemblyItem> INCOMPLETE_ADVANCED_ALLOY_SHEET =
            REGISTRATE.item("incomplete_advanced_alloy_sheet", SequencedAssemblyItem::new)
                    .register();

    public static final ItemEntry<? extends SlimeArmorItem>
    SLIME_BOOTS = REGISTRATE.item("slime_boots", SlimeArmorItem.SlimeBootsItem::new)
            .register();
    public static void register() {

    }
}
