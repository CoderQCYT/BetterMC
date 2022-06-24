
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package info.coderqc.mc.bettermc.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BettermcModTabs {
	public static CreativeModeTab TAB_CREATOR_TOOLS_TAB;

	public static void load() {
		TAB_CREATOR_TOOLS_TAB = new CreativeModeTab("tabcreator_tools_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.DIAMOND_PICKAXE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
