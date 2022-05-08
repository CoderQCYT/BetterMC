package info.coderqc.mc.bettermc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BeansPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (BettermcModVariables.MapVariables.get(world).jokesEnabled) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 1, (false), (true)));
		}
	}
}
