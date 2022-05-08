package info.coderqc.mc.bettermc.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class JokesCommandExecutedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (BettermcModVariables.MapVariables.get(world).jokesEnabled) {
			BettermcModVariables.MapVariables.get(world).jokesEnabled = false;
			BettermcModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Most joke behaviors have been disabled"), (false));
		} else {
			BettermcModVariables.MapVariables.get(world).jokesEnabled = true;
			BettermcModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Most joke behaviors have been re-enabled"), (false));
		}
	}
}
