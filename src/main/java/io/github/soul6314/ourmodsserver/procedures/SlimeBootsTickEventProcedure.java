package io.github.soul6314.ourmodsserver.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class SlimeBootsTickEventProcedure {
	public static void execute(Level world, Entity entity) {
		if (entity != null) {
			if (entity instanceof LivingEntity) {
				LivingEntity _entity = (LivingEntity)entity;
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 2, 3, false, false));
			}

		}
	}
}
