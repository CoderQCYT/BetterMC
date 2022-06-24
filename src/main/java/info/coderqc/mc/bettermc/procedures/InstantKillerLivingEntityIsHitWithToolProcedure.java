package info.coderqc.mc.bettermc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InstantKillerLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.MAGIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
	}
}
