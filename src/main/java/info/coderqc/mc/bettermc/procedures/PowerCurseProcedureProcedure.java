package info.coderqc.mc.bettermc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.Random;
import java.util.List;
import java.util.Comparator;

import info.coderqc.mc.bettermc.init.BettermcModEnchantments;

@Mod.EventBusSubscriber
public class PowerCurseProcedureProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(),
					event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, x, y, z, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity,
			double amount) {
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
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100,
								(int) (EnchantmentHelper.getItemEnchantmentLevel(BettermcModEnchantments.POWER_CURSE.get(),
										(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 2)));
					if (entityiterator instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100,
								(int) (EnchantmentHelper.getItemEnchantmentLevel(BettermcModEnchantments.POWER_CURSE.get(),
										(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 2)));
					if (entityiterator instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100,
								(int) (EnchantmentHelper.getItemEnchantmentLevel(BettermcModEnchantments.POWER_CURSE.get(),
										(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 2)));
				}
			}
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(BettermcModEnchantments.VOID_STRIKE.get(),
				(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("voidstrike").bypassArmor(),
						(float) (amount
								* (EnchantmentHelper.getItemEnchantmentLevel(BettermcModEnchantments.VOID_STRIKE.get(),
										(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1)
								- Mth.nextInt(new Random(), 0,
										(int) (amount * (EnchantmentHelper.getItemEnchantmentLevel(BettermcModEnchantments.VOID_STRIKE.get(),
												(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
												+ 1)))));
		}
	}
}
