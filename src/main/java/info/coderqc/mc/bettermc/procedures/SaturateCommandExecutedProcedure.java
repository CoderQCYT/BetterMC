package info.coderqc.mc.bettermc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.HashMap;

import info.coderqc.mc.bettermc.network.BettermcModVariables;

public class SaturateCommandExecutedProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("allow")) {
			if (entity.hasPermissions(3)) {
				BettermcModVariables.MapVariables.get(world).SaturationEnabled = true;
				BettermcModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Saturation has been allowed!"), (false));
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You do not have permission to do this!"), (false));
			}
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("block")) {
			if (entity.hasPermissions(3)) {
				BettermcModVariables.MapVariables.get(world).SaturationEnabled = false;
				BettermcModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Saturation has been blocked!"), (false));
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You do not have permission to do this!"), (false));
			}
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("")) {
			if (BettermcModVariables.MapVariables.get(world).Saturated) {
				BettermcModVariables.MapVariables.get(world).Saturated = false;
				BettermcModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You are no longer being saturated."), (false));
			} else {
				BettermcModVariables.MapVariables.get(world).Saturated = true;
				BettermcModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You are now being saturated."), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Unknown option, possible options: \" \", \"allow\", and \"deny\"."), (false));
		}
	}
}
