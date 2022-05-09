
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BettermcModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(4).add(new BasicItemListing(new ItemStack(Blocks.SLIME_BLOCK), new ItemStack(BettermcModItems.AMBER.get()),
					new ItemStack(BettermcModItems.EMERALD_SWORD.get()), 10, 5, 0.05f));
		}
	}
}
