package io.github.soul6314.ourmodsserver.item.armor;

import io.github.soul6314.ourmodsserver.procedures.SlimeBootsTickEventProcedure;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SlimeArmorItem extends ArmorItem {

    public SlimeArmorItem(EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial(){
			@Override
			public int getDurabilityForSlot(@NotNull EquipmentSlot slot) {return (new int[]{13, 15, 16, 11})[slot.getIndex()] * 5;}
			@Override
			public int getDefenseForSlot(@NotNull EquipmentSlot slot) {return (new int[]{2, 5, 6, 2})[slot.getIndex()];}
			@Override
			public int getEnchantmentValue() {return 9;}
			@Override
			public @NotNull SoundEvent getEquipSound() {return SoundEvents.ARMOR_EQUIP_GENERIC;}
			@Override
			public @NotNull Ingredient getRepairIngredient() {
				return Ingredient.of(Items.SLIME_BALL);
			}
			@Override
			public @NotNull String getName() {return "slime";}
			@Override
			public float getToughness() {return 0.0F;}
			@Override
			public float getKnockbackResistance() {return 0.0F;}
		},slot, properties.stacksTo(1));
    }

	public static class SlimeBootsItem extends SlimeArmorItem {
		public SlimeBootsItem(Properties p_i48534_3_) {
			super(EquipmentSlot.FEET, p_i48534_3_);
		}
		public void appendHoverText(@NotNull ItemStack itemstack, Level world, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
			if (Screen.hasShiftDown()) {
				list.add(Component.literal("§8Hold [§fShift§8] for Summary"));
				list.add(Component.literal(" "));
				list.add(Component.literal("§4These bouncy boots allow you to"));
				list.add(Component.literal("§ctravel faster§4 and survive the most"));
				list.add(Component.literal("§cdeadly falls!"));
			} else {
				list.add(Component.literal("§8Hold [§7Shift§8] for Summary"));
			}

			super.appendHoverText(itemstack, world, list, flag);
		}

		/*public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "create_sa:textures/models/armor/slime_layer_1.png";
		}*/

		public static void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			SlimeBootsTickEventProcedure.execute(world, entity);
			//SlimeBootsTickEventProcedure.execute(entity);
		}

		public static void onArmorTick(LivingEntity livingEntity) {
		}
	}
}
