package info.coderqc.mc.bettermc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import info.coderqc.mc.bettermc.network.BettermcModVariables;

public class JokesCommandExecutedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (BettermcModVariables.MapVariables.get(world).jokesEnabled) {
			BettermcModVariables.MapVariables.get(world).jokesEnabled = false;
			BettermcModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Most joke behaviors have been disabled"), (false));
		} else {
			BettermcModVariables.MapVariables.get(world).jokesEnabled = true;
			BettermcModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Most joke behaviors have been re-enabled"), (false));
		}
	}
}
