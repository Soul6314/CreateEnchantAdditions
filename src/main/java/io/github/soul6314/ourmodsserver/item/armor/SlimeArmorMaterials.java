package io.github.soul6314.ourmodsserver.item.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class SlimeArmorMaterials implements ArmorMaterial {

    @Override
    public int getDurabilityForSlot(@NotNull EquipmentSlot slot) {
        return 128;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return 2;
    }

    @Override
    public int getEnchantmentValue() {
        return 9;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_GENERIC;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return Ingredient.of(Items.SLIME_BALL);
    }

    @Override
    public @NotNull String getName() {
        return "slime";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0F;
    }

}
