package info.coderqc.mc.bettermc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PowerCurseProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(),
					event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(BettermcModEnchantments.POWER_CURSE.get(),
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class,
						new AABB(_center, _center).inflate((EnchantmentHelper.getItemEnchantmentLevel(BettermcModEnchantments.POWER_CURSE.get(),
								(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 2) / 2d),
						e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1));
					if (entityiterator instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1));
					if (entityiterator instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 60, 1));
				}
			}
		}
	}
}